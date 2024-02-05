/** Project: Solo Lab2 Assignment Networking
 * Purpose Details: NIC Details Class
 * Course: IST 242
 * Author: Jordan Borrero
 * Date Developed: February 4, 2024
 * Last Date Changed: February 4, 2024
 * Rev: 1

 */
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
public class NICDetails {
    //Method to get NIC Details
    void getDetails(){
        try {
            // Get the local host information
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Local Hostname: " + localhost.getHostName());
            System.out.println("Local IP Address: " + localhost.getHostAddress());

            // Get information about network interfaces
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                System.out.println("Interface Name: " + networkInterface.getDisplayName());
                if (networkInterface.getHardwareAddress() != null){
                    System.out.println("Interface Hardware Address: " + formatMACAddress(networkInterface.getHardwareAddress()));
                }
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddress = inetAddresses.nextElement();
                    System.out.println("IP Address: " + inetAddress.getHostAddress());
                }
                System.out.println();
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Formatting Method
    private static String formatMACAddress(byte[] mac) {
        StringBuilder formattedMAC = new StringBuilder();
        for (byte b : mac) {
            formattedMAC.append(String.format("%02X:", b));
        }
        if (formattedMAC.length() > 0) {
            formattedMAC.deleteCharAt(formattedMAC.length() - 1); // Remove the trailing ':'
        }
        return formattedMAC.toString();
    }
}
