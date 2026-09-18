import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressTypeExample{
    public static void main(String[] args){
        try{
            InetAddress wildcardAddress = InetAddress.getByName("0.0.0.0");
            InetAddress loopbackAddress = InetAddress.getByName("127.0.0.1");
            InetAddress linkLocalAddress = InetAddress.getByName("169.254.0.0");
            InetAddress siteLocalAddress = InetAddress.getByName("10.0.0.0");
            InetAddress multicastAddress = InetAddress.getByName("224.0.0.0");
        
            System.out.println("Wildcard Address: " + wildcardAddress.isAnyLocalAddress());
            System.out.println("Link-Local Address: " + linkLocalAddress.isLinkLocalAddress());
            System.out.println("Site-Local Address: " + siteLocalAddress.isSiteLocalAddress());
            System.out.println("Multicast Address: " + multicastAddress.isMulticastAddress());
            System.out.println("Loopback Address: " + loopbackAddress.isLoopbackAddress());
        }
        catch(UnknownHostException e){
            System.out.println("Unknown host exception");         
        }
    }
}