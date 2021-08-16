import org.snmp4j.CommunityTarget;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.*;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import org.snmp4j.util.DefaultPDUFactory;
import org.snmp4j.util.TreeEvent;
import org.snmp4j.util.TreeUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service {
    private String address;
    private Map<Integer,MibInterfaceRecord> records = new TreeMap<>();
    private String interfacesOid = ".1.3.6.1.2.1.2.2";

    public Service(String address){
        this.address=address;
    }

    private void interfacesTableToMap() throws IOException {
        CommunityTarget target = new CommunityTarget();
        target.setCommunity(new OctetString("public"));
        target.setAddress(GenericAddress.parse(address));
        target.setVersion(SnmpConstants.version2c);

        TransportMapping<? extends Address> transport = new DefaultUdpTransportMapping();
        Snmp snmp = new Snmp(transport);

        transport.listen();
        TreeUtils treeUtils = new TreeUtils(snmp, new DefaultPDUFactory());
        for (TreeEvent event : treeUtils.getSubtree(target, new OID(interfacesOid))) {

            for (VariableBinding varBinding : event.getVariableBindings()) {
                String oid = getIndexAndOid(1, varBinding.getOid().toString());
                Integer index = Integer.parseInt(getIndexAndOid(2, varBinding.getOid().toString()));
                String variable = varBinding.getVariable().toString();

                MibInterfaceRecord mibInterfaceRecord = records.getOrDefault(index, new MibInterfaceRecord(index + ""));
                records.put(index, mibInterfaceRecord.setValueByOid(oid, variable));
            }
        }
        snmp.close();
    }

    private String getIndexAndOid(Integer group, String oid){
        //first group is oid without index
        //second group is index without oid of subtree
        Pattern pattern = Pattern.compile("(.*)\\.(\\d{1,2})$");
        Matcher matcher = pattern.matcher(oid);
        matcher.find();
        return matcher.group(group);}

    public void interfacesTableToFile(String pathname){

        try{interfacesTableToMap();
            File file = new File(pathname);
            FileWriter fileWriter = new FileWriter(file);
            for(Map.Entry<Integer, MibInterfaceRecord> record : records.entrySet() ){
                fileWriter.write(record.getValue().toString()+ '\n');
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
