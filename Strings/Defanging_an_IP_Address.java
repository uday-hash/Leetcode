package Strings;

public class Defanging_an_IP_Address {
    public String defangIPaddr(String address) {
        String str = address.replaceAll("[.]", "[.]");
        return str;
        
        
    }
    public static void main(String[] args) {
        Defanging_an_IP_Address obj = new Defanging_an_IP_Address();
        String address = "1.1.1.1";
        System.out.println(obj.defangIPaddr(address));
    }
}
