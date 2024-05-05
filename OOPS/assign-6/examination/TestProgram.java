package examination;

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
             * create 2 comma seperated files named subjectdata.csv 
             * and studentdata.csv in the current 
             * folder where you will be executing this test program.
             * Each line of subjectdata.csv will be having subjectname, subjectcode and maximummarks values 
             * Every 2 lines of studentdata.csv will be having
             * rollno, studentname, subject_index, isaI_Marks, isaII_Marks, isaMarks, seeMarks, practMarks,totalMarks, grade  values
             */
            Path file = Paths.get("subjectdata.csv");
            int count = (int)(Files.lines(file).count());
            Subject[] subjects = new Subject[count];
            FileInputStream fis=new FileInputStream("subjectdata.csv");
            Scanner sc=new Scanner(fis);
            String line;
            int iter = 0;
            String[] flds;
            while(sc.hasNextLine()) {
                line = sc.nextLine();
                flds = line.split(",");
                subjects[iter] = new Subject(flds[0], flds[1], flds[2]);
                ++iter;
            }  
            sc.close();
            file = Paths.get("studentdata.csv");
            count = (int)(Files.lines(file).count())/2;
            Student[] students = new Student[count];
            fis = new FileInputStream("studentdata.csv");
            sc = new Scanner(fis);
            iter = 0;
            /*
             * Assume that each student answers only 2 subjects
             *
             */
            int loc;

            OptSubject[] opts;
            while (sc.hasNextLine()) {
                opts = new OptSubject[2];
                line = sc.nextLine();
                flds = line.split(",");
                loc =2;

                opts[0] =new OptSubject(subjects[loc], flds[4], flds[5], flds[6], flds[7]);
                line = sc.nextLine();
                flds = line.split(",");

                opts[1] = new OptSubject(subjects[loc], flds[4], flds[5], flds[6], flds[7]);
                students[iter] = new Student(flds[0], flds[1], opts);
               // System.out.println(students[iter].display());
                ++iter;
            }
            sc.close();
            Exam exam = new Exam(students);
            System.out.println(exam.Report());
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
