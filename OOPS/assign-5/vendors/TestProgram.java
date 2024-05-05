package vendors;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestProgram {
    public static void main(String[] arg) {
        try  
        {  
            /*
             * TODO:
             * create a comma seperated file named shopdata.csv in the current 
             * folder where you will be executing this test program.
             * Each line will have 
             * name, shopno, license_fee, unpaidamount
             */
            Path file = Paths.get("shopdata.csv");
            int count = (int)(Files.lines(file).count());
            Vendor[] vendors = new Vendor[count];
            FileInputStream fis=new FileInputStream("shopdata.csv");
            Scanner sc=new Scanner(fis);
            String line;
            int iter = 0;
            String[] flds;
            while(sc.hasNextLine()) {
                line = sc.nextLine();
                flds = line.split(",");
                vendors[iter] = new Vendor(flds[0],flds[1],flds[2],flds[3]);
                ++iter;
            }  
            sc.close();
            Shopingcomplex complex = new Shopingcomplex(vendors);
            /*
             * TODO:
             * Write the instructions to test your program here
             *collection made, Balance to be received, Interest GST, License GST. */

            //System.out.println(vendors.toString());
            System.out.println(complex.toString());

        }  
        catch(IOException e) {  
            e.printStackTrace();  
        } 
    }
}
