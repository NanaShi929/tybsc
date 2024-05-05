package supervision;

import java.util.ArrayList;

public class Exam {
    String startDate, endDate;
    ArrayList<Supervisor> supervisors;
    ArrayList<Excluded> staff;
    public Exam(String startDate, String endDate, ArrayList<Supervisor> supervisors, ArrayList<Excluded> staff) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.supervisors = supervisors;
        this.staff = staff;
    }
    /*
     * TODO: Write the required api here
     */
    //faculty wise list, date-wise faculty list, faculty on duty leave, faculty that are sick, faculty-wise supervision count
    public String Record(){
        String Record="";
        for(Supervisor S:supervisors){
            Record+=S.toString();
        }
        Record+="\t";
        for (Excluded E:staff){
            Record+=E.toString();
        }
        return Record;
    }



}
