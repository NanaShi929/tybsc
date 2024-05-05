package supervision;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        try  
        {  
            /*
             * TODO:
             * create a comma seperated file named examdata.csv in the current 
             * folder where you will be executing this test program.
             * The file will have first line having startdate and enddate values
             * For the remaining part of the file each line will have
             * name, subjectname, lecturebasis, examsubject, examdate, session, dutyleave, committeemember, sickness
             */
            FileInputStream fis=new FileInputStream("examdata.csv");
            Scanner sc=new Scanner(fis);
            String line;
            String[] flds;
            ArrayList<Supervisor> duties = new ArrayList<Supervisor>();
            ArrayList<Excluded> excludes = new ArrayList<Excluded>();
            String facultyname = "";
            line = sc.nextLine();
            flds = line.split(",");
            String startdate = flds[0];
            String enddate = flds[1];
            ArrayList<ExamDuty> supervision = new ArrayList<ExamDuty>();
            while(sc.hasNextLine()) {
                line = sc.nextLine();
                flds = line.split(",");
                if ((flds[6].equals("TRUE")) || (flds[7].equals("TRUE")) || (flds[8].equals("TRUE"))) {
                    excludes.add(new Excluded(flds[0], flds[1], flds[2], flds[6], flds[7], flds[8]));
                }
                else {
                    if (flds[0].equals(facultyname)) {
                        supervision.add(new ExamDuty(flds[3], flds[4], flds[5]));
                    }
                    else {
                        duties.add(new Supervisor(flds[0], flds[1], flds[2], supervision));
                        supervision.clear();
                    }
                }
            }  
            sc.close();
            Exam examination = new Exam(startdate, enddate, duties, excludes);
            System.out.println(examination.Record());
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
