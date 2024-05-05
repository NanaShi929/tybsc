package examination;

import java.util.Arrays;

public class Student {
    String rollno, studentName;
    OptSubject[] optsubjects;

    public Student(String rollno, String studentName, OptSubject[] optsubjects) {
        this.rollno = rollno;
        this.studentName = studentName;
        this.optsubjects = optsubjects;
    }

    public Student() {

    }

    /*
     * TODO: Write the required api
     */
    public String Opsub(OptSubject optSubject){
        return optSubject.toString();
    }


    public String display(){
        String disp="";
        disp+="name:"+this.studentName+"\n";
        disp+="Roll_No:"+this.rollno+"\n";
        for(OptSubject o:optsubjects){
            disp+=o+"\n";
        }
        return disp;
    }
}
