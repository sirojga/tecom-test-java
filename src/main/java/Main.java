
public class Main {
    static String address = "udp:127.0.0.1/175";
    static String pathname = "Interfaces.txt";
    public static void main(String[] args) throws Exception {
        Service service = new Service(address);
        service.interfacesTableToFile(pathname);
    }
}
