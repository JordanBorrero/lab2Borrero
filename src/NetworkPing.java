/** Project: Solo Lab2 Assignment Networking
 * Purpose Details: Network Ping Class
 * Course: IST 242
 * Author: Jordan Borrero
 * Date Developed: February 4, 2024
 * Last Date Changed: February 4, 2024
 * Rev: 1

 */
import java.net.InetAddress;
import java.net.UnknownHostException;
public class NetworkPing {
    //Name of the Host
    public String hostName;

    //Method to Ping
     void getPing(){
         try {
             InetAddress inetAddress = InetAddress.getByName(hostName);
             if (inetAddress.isReachable(5000)) {
                 System.out.println(hostName + " is reachable");
             } else {
                 System.out.println(hostName + " is not reachable");
             }
         } catch (UnknownHostException e) {
             System.err.println("Unknown host: " + hostName);
         } catch (Exception e) {
             System.err.println("Error while pinging " + hostName + ": " + e.getMessage());
         }
    }

    //Method to get Host Name
    public String getHostName(){
         return hostName;
}
//Method to set Host Name
    public void setHostName(String newhostName){
         this.hostName = newhostName;
    }

}
