package supervision;

import java.util.ArrayList;

public class Supervisor extends Faculty {
    ArrayList<ExamDuty> duties;

    public Supervisor(String name, String subjectname, String lecturebasis, ArrayList<ExamDuty> duties) {
        super(name, subjectname, lecturebasis);
        this.duties = duties;
    }

    /*
     * TODO: Write the required api
     */

    @Override
    public String toString() {
        return "\nSupervisor{" +
                "name='" + name + '\'' +
                ",duties=" + duties +'\''+
                ", subjectname='" + subjectname + '\'' +
                '}';
    }
}
