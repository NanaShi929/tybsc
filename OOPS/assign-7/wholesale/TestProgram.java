package wholesale;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        try  
        {  
            /*
             * TODO:
             * create a comma seperated file named gstbilldata.csv in the current 
             * folder where you will be executing this test program.
             * Each line of the file will have 
             * TIN, Bill Date, Customer name, Bill number, Sale amount, GST, Narration
             */
            Path file = Paths.get("gstbilldata.csv");
            int count = (int)(Files.lines(file).count());
            GstBill[] bills = new GstBill[count];
            FileInputStream fis=new FileInputStream("gstbilldata.csv");       
            Scanner sc=new Scanner(fis);
            String line;
            int iter = 0;
            String[] flds;
            while(sc.hasNextLine()) {
                line = sc.nextLine();
                flds = line.split(",");
                bills[iter] = new GstBill(flds[0], flds[1], flds[2], flds[3], flds[4], flds[5], flds[6]);
                ++iter;
            }  
            sc.close();
            Distributor distribute = new Distributor(bills);
            /*
             * TODO:
             * Write the instructions to test your program here
             */
            System.out.println(distribute.toString());
        }  
        catch(IOException e) {  
            e.printStackTrace();  
        } 

    }
}
