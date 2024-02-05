/** Project: Solo Lab2 Assignment Networking
 * Purpose Details: Port Scanner Class
 * Course: IST 242
 * Author: Jordan Borrero
 * Date Developed: February 4, 2024
 * Last Date Changed: February 4, 2024
 * Rev: 1

 */
import java.net.Socket;
import java.io.IOException;
public class PortScanner {
    //Host
    public String targetHost;
    //Minium Port Number
    public int minPort;
    //Maximum Port Number
    public int maxPort;

    //Method to scan ports
    void portScan(){
        System.out.println("Scanning ports on " + targetHost + "...");

        for (int port = minPort; port <= maxPort; port++) {
            try {
                Socket socket = new Socket(targetHost, port);
                System.out.println("Port " + port + " is open");
                socket.close();
            } catch (IOException e) {
                // Port is likely closed or unreachable
            }
        }

        System.out.println("Port scanning finished.");
    }
//Getters and Setters for Host and Port Numbers
    public String getTargetHost(){
        return targetHost;
    }
    public void setTargetHost(String newTargetHost){
        this.targetHost = newTargetHost;
    }
    public int getMinPort(){
        return minPort;
    }
    public void setMinPort(int newMinPort){
        this.minPort = newMinPort;
    }
    public int getMaxPort(){
        return maxPort;
    }
    public void setMaxPort(int newMaxPort){
        this.maxPort = newMaxPort;
    }

}
