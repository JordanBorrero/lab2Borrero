/** Project: Solo Lab2 Assignment Networking
 * Purpose Details: Routing Table Class
 * Course: IST 242
 * Author: Jordan Borrero
 * Date Developed: February 4, 2024
 * Last Date Changed: February 4, 2024
 * Rev: 1

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class RoutingTable {
    //Method to get Routing Table
    void getRoutingTable(){
        try {
            // Execute the "route print" command on Windows
            Process process = Runtime.getRuntime().exec("route print");

            // Read the output of the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader and wait for the process to exit
            reader.close();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
