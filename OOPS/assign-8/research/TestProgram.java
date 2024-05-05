package research;

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
             * create a comma seperated file named researchdata.csv in the current 
             * folder where you will be executing this test program.
             * Each line of the file will have 
             * Article title, Published year, First Author, supportive authors, Guide, citation key, remark, journal, conference
             * if article is of journal type then conference value will be empty string and journal will be empty if article is of conference
             */
            ArrayList<JournPaper> journal = new ArrayList<JournPaper>();
            ArrayList<ConfPaper> conference =  new ArrayList<ConfPaper>();
            FileInputStream fis=new FileInputStream("researchdata.csv");       
            Scanner sc=new Scanner(fis);
            String line;
            String[] flds;
            while(sc.hasNextLine()) {
                line = sc.nextLine();
                flds = line.split(",");
                if (flds[7].equals("")) {
                    conference.add(new ConfPaper(flds[0], flds[1], flds[2], flds[3], flds[4], flds[5], flds[6], flds[8]));
                }
                else {
                    journal.add(new JournPaper(flds[0], flds[1], flds[2], flds[3], flds[4], flds[5], flds[6], flds[7]));
                }
            }  
            sc.close();
            Reference references = new Reference(journal, conference);
            System.out.println(references.message());
            /*
             * TODO:
             * Write the instructions to test your program here
             */
        }  
        catch(IOException e) {  
            e.printStackTrace();  
        } 

    }
    
}
