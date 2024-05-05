package divyang;

public class Employed extends Divyang {
    int salary;
    String jobpost;
    
    public Employed(String name, String locality, String udidno, String divyangpercent, String hasSkillcertificate,
            String salary, String jobpost) {
        super(name, locality, udidno, divyangpercent, hasSkillcertificate);
        this.salary = Integer.parseInt(salary);
        this.jobpost = jobpost;
    }

    /*
     * TODO : Write the required api here
     */

    @Override
    public String toString() {
        return
                "\n\nEmployee:\n"+
                "name='" + name + '\'' +
                ", locality='" + locality + '\'' +
                ", udidno='" + udidno + '\'' +
                ", divyangpercent=" + divyangpercent +
                ", hasSkillcertificate=" + hasSkillcertificate +
                ",salary=" + salary +
                ", jobpost='" + jobpost + '\'' +
                '}';
    }
}
