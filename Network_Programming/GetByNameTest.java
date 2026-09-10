package Network_Programming;
import java.net.InetAddress;  //import the inet class
public class GetByNameTest{

    public static void main(String[] args){
        try{
            InetAddress address= InetAddress.getByName("www.google.com");
            System.out.println(address);
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            System.out.println(address.getAddress());

        }catch(Exception e) {System.out.println(e);}
    }
}