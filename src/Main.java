/** Project: Solo Lab2 Assignment Networking
 * Purpose Details: Main File
 * Course: IST 242
 * Author: Jordan Borrero
 * Date Developed: February 4, 2024
 * Last Date Changed: February 4, 2024
 * Rev: 1

 */

import java.util.Scanner;
public class Main {
    //while loop to give user interface with options
    public static void main(String[] args) {
        int onOrOff = 1;
        while(onOrOff == 1){
            Scanner reader = new Scanner(System.in);
            System.out.println("Option 1. performs a network ping\n" +
                    "Option 2. shows the NIC Network Interface card details\n" +
                    "Option 3. performs a port scan on your local computer show ports\n" +
                    "Option 4. show the routing table\nEnter 5 to Exit\nChoose an Option: ");
            String option = reader.nextLine();

            if(option.equals("1")){
                    NetworkPing newPing = new NetworkPing();
                newPing.setHostName("www.espn.com");
                newPing.getPing();
            }else if (option.equals("2")){
                NICDetails newDetails = new NICDetails();
                newDetails.getDetails();
            }else if (option.equals("3")){
                Scanner reader2 = new Scanner(System.in);
                System.out.println("Enter Target Host: ");
                String option2 = reader2.nextLine();
                PortScanner newScan = new PortScanner();
                newScan.setTargetHost(option2);
                newScan.portScan();

            }else if (option.equals("4")){
                RoutingTable newTable = new RoutingTable();
                newTable.getRoutingTable();
            }else if (option.equals("5")){
                onOrOff = 0;
            }

        }



        //NetworkPing newPing = new NetworkPing();
        //newPing.setHostName("www.espn.com");
        //newPing.getPing();
        //NICDetails newDetails = new NICDetails();
        //newDetails.getDetails();
        //PortScanner newScan = new PortScanner();
        //newScan.portScan();
        //RoutingTable newTable = new RoutingTable();
        //newTable.getRoutingTable();
    }
}