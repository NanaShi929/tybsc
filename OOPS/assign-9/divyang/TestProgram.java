package divyang;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class TestProgram {
    public static void main(String[] args) {
        try  
        {  
            /*
             * TODO:
             * create a comma seperated file named divyangdata.csv in the current 
             * folder where you will be executing this test program.
             * Each line of the file will have 
             * name, locality, udidno, divyangpercent, hasSkillcertificate, salary, jobpost, statehonararium, centerhonararium, schooling
             * Salary field will differentiate between employed and unemployed divyang
             */

            ArrayList<Employed> employ = new ArrayList<Employed>();
            ArrayList<Unemployed> unemploy =  new ArrayList<Unemployed>();
            FileInputStream fis=new FileInputStream("divyangdata.csv");       
            Scanner sc=new Scanner(fis);
            String line;
            String[] flds;
            while(sc.hasNextLine()) {
                line = sc.nextLine();
                flds = line.split(",");
                if (flds[7].isEmpty() || flds[6].isEmpty()) {
                    unemploy.add(new Unemployed(flds[0], flds[1], flds[2], flds[3], flds[4], flds[7], flds[8], flds[9]));
                }
                else {
                    employ.add(new Employed(flds[0], flds[1], flds[2], flds[3], flds[4], flds[5], flds[6]));
                }
            }  
            sc.close();
            Demography population = new Demography(employ, unemploy);
            /*
             * TODO:
             * Write the instructions to test your program here
             */
            System.out.println(population.Report());
        }  
        catch(IOException e) {  
            e.printStackTrace();  
        } 

        
    }
}
