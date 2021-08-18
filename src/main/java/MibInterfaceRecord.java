import java.util.Objects;

public class MibInterfaceRecord {

    String index;
    String description="null";
    String type="null";
    String mtu="null";
    String speed="null";
    String physicAddress="null";
    String adminStatus="null";
    String operStatus="null";
    String lastChange="null";
    String inOctets="null";
    String inUcastPkts="null";
    String inNUcastPkts="null";
    String inDiscards="null";
    String inErrors="null";
    String inUnknownProtos="null";
    String outOctets="null";
    String outUcastPkts="null";
    String outNUcastPkts="null";
    String outDiscard="null";
    String outErrors="null";
    String outQLen="null";
    String specific="null";

    public MibInterfaceRecord(String index){
        this.index=index;
    }
    public MibInterfaceRecord setValueByOid(String oid, String variable){
        switch (oid){
            case"1.3.6.1.2.1.2.2.1.2" : setDescription(variable); break;
            case"1.3.6.1.2.1.2.2.1.3" : setType(variable); break;
            case"1.3.6.1.2.1.2.2.1.4" : setMtu(variable); break;
            case"1.3.6.1.2.1.2.2.1.5" : setSpeed(variable); break;
            case"1.3.6.1.2.1.2.2.1.6" : setPhysicAddress(variable); break;
            case"1.3.6.1.2.1.2.2.1.7" : setAdminStatus(variable); break;
            case"1.3.6.1.2.1.2.2.1.8" : setOperStatus(variable); break;
            case"1.3.6.1.2.1.2.2.1.9" : setLastChange(variable); break;
            case"1.3.6.1.2.1.2.2.1.10" : setInOctets(variable); break;
            case"1.3.6.1.2.1.2.2.1.11" : setInUcastPkts(variable); break;
            case"1.3.6.1.2.1.2.2.1.12" : setInNUcastPkts(variable); break;
            case"1.3.6.1.2.1.2.2.1.13" : setInDiscards(variable); break;
            case"1.3.6.1.2.1.2.2.1.14" : setInErrors(variable); break;
            case"1.3.6.1.2.1.2.2.1.15" : setInUnknownProtos(variable); break;
            case"1.3.6.1.2.1.2.2.1.16" : setOutOctets(variable); break;
            case"1.3.6.1.2.1.2.2.1.17" : setOutUcastPkts(variable); break;
            case"1.3.6.1.2.1.2.2.1.18" : setOutNUcastPkts(variable); break;
            case"1.3.6.1.2.1.2.2.1.19" : setOutDiscard(variable); break;
            case"1.3.6.1.2.1.2.2.1.20" : setOutErrors(variable); break;
            case"1.3.6.1.2.1.2.2.1.21" : setOutQLen(variable); break;
            case"1.3.6.1.2.1.2.2.1.22" : setSpecific(variable); break;
        }
        return this;
    }

    @Override
    public String toString() {
        return  " interface " + "\""+index + "\""+' ' +
                ": description = " + "\""+description + "\""+' ' +
                ", type = " + "\""+type + "\""+' ' +
                ", mtu = " + "\""+mtu + "\""+' ' +
                ", speed = " + "\""+speed + "\""+' ' +
                ", physicAddress = " + "\""+physicAddress + "\""+' ' +
                ", adminStatus = " + "\""+adminStatus + "\""+' ' +
                ", operStatus = " + "\""+operStatus + "\""+' ' +
                ", lastChange = " + "\""+lastChange + "\""+' ' +
                ", inOctets = " + "\""+inOctets + "\""+' ' +
                ", inUcastPkts = " + "\""+inUcastPkts + "\""+' ' +
                ", inNUcastPkts = " + "\""+inNUcastPkts + "\""+' ' +
                ", inDiscards = " + "\""+inDiscards + "\""+' ' +
                ", inErrors = " + "\""+inErrors + "\""+' ' +
                ", inUnknownProtos = " + "\""+inUnknownProtos + "\""+' ' +
                ", outOctets = " + "\""+outOctets + "\""+' ' +
                ", outUcastPkts = " + "\""+outUcastPkts + "\""+' ' +
                ", outNUcastPkts = " + "\""+outNUcastPkts + "\""+' ' +
                ", outDiscard = " + "\""+outDiscard + "\""+' ' +
                ", outErrors = " + "\""+outErrors + "\""+' ' +
                ", outQLen = " + "\""+outQLen + "\""+' ' +
                ", specific = " + "\""+specific+"\""
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MibInterfaceRecord)) return false;
        MibInterfaceRecord that = (MibInterfaceRecord) o;
        return Objects.equals(index, that.index) && Objects.equals(description, that.description) && Objects.equals(type, that.type) && Objects.equals(mtu, that.mtu) && Objects.equals(speed, that.speed) && Objects.equals(physicAddress, that.physicAddress) && Objects.equals(adminStatus, that.adminStatus) && Objects.equals(operStatus, that.operStatus) && Objects.equals(lastChange, that.lastChange) && Objects.equals(inOctets, that.inOctets) && Objects.equals(inUcastPkts, that.inUcastPkts) && Objects.equals(inNUcastPkts, that.inNUcastPkts) && Objects.equals(inDiscards, that.inDiscards) && Objects.equals(inErrors, that.inErrors) && Objects.equals(inUnknownProtos, that.inUnknownProtos) && Objects.equals(outOctets, that.outOctets) && Objects.equals(outUcastPkts, that.outUcastPkts) && Objects.equals(outNUcastPkts, that.outNUcastPkts) && Objects.equals(outDiscard, that.outDiscard) && Objects.equals(outErrors, that.outErrors) && Objects.equals(outQLen, that.outQLen) && Objects.equals(specific, that.specific);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, description, type, mtu, speed, physicAddress, adminStatus, operStatus, lastChange, inOctets, inUcastPkts, inNUcastPkts, inDiscards, inErrors, inUnknownProtos, outOctets, outUcastPkts, outNUcastPkts, outDiscard, outErrors, outQLen, specific);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMtu(String mtu) {
        this.mtu = mtu;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setPhysicAddress(String physicAddress) {
        this.physicAddress = physicAddress;
    }

    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
    }

    public void setOperStatus(String operStatus) {
        this.operStatus = operStatus;
    }

    public void setLastChange(String lastChange) {
        this.lastChange = lastChange;
    }

    public void setInOctets(String inOctets) {
        this.inOctets = inOctets;
    }

    public void setInUcastPkts(String inUcastPkts) {
        this.inUcastPkts = inUcastPkts;
    }

    public void setInNUcastPkts(String inNUcastPkts) {
        this.inNUcastPkts = inNUcastPkts;
    }

    public void setInDiscards(String inDiscards) {
        this.inDiscards = inDiscards;
    }

    public void setInErrors(String inErrors) {
        this.inErrors = inErrors;
    }

    public void setInUnknownProtos(String inUnknownProtos) {
        this.inUnknownProtos = inUnknownProtos;
    }

    public void setOutOctets(String outOctets) {
        this.outOctets = outOctets;
    }

    public void setOutUcastPkts(String outUcastPkts) {
        this.outUcastPkts = outUcastPkts;
    }

    public void setOutNUcastPkts(String outNUcastPkts) {
        this.outNUcastPkts = outNUcastPkts;
    }

    public void setOutDiscard(String outDiscard) {
        this.outDiscard = outDiscard;
    }

    public void setOutErrors(String outErrors) {
        this.outErrors = outErrors;
    }

    public void setOutQLen(String outQLen) {
        this.outQLen = outQLen;
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }
}
