import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class SalarySlip extends Employee {
    // month year, bp, da, hra, ta as income
    // deduction of minimum 6% gpf and ₹120 insurance. Certain amount is deducted as incomtax.
    public LocalDate now=LocalDate.now();


    public static int base;
    public int Dear_all;
    public int HR_all;
    public int Tr_all;
    public int gpf_percentage;
    public int in_tax;
    public static int ins=120,inc_percentage=3;
    public int salary,inhand_salary;

    public SalarySlip(String Name, String Title, String Post, String institute_Name, int Bp, int da, int hra, int ta, int gpf, int inct) {
        super(Name, Title, Post, institute_Name);
        this.base=Bp;
        this.Dear_all=da;
        this.HR_all=hra;
        this.Tr_all=ta;
        this.gpf_percentage=gpf;
        this.in_tax=inct;
    }

    public int getsalary() {
        salary=base+Dear_all+HR_all+Tr_all;//+calculateYearlyIncrement();
        return salary;
    }

    public int getInhand_salary() {
        inhand_salary=salary-(gpf_percentage*salary/100)-in_tax;
        return inhand_salary;
    }
    public static int calculateYearlyIncrement() {
        Calendar calendar = Calendar.getInstance();
        int totalAmount=0;
        float ince=0;

        for (int year =2002; year <=2023; year++) {
            // Assuming increment happens at the end of every year
            calendar.add(Calendar.YEAR, 1);
            ince+= Math.round((float) (base * inc_percentage) / 100);
            totalAmount=(int)ince;
        }
        return totalAmount;
    }

    @Override
    public String toString() {
        return "SalarySlip {"+"\n" +
                "Name=" + Name+"\n" +
                "Title=" + Title+"\n"  +
                " Post=" + Post +"\n" +
                "institute_Name=" + institute_Name +"\n"+
                "now=" + now +"\n"+
                " Dear_all=" + Dear_all +"\n"+
                "HR_all=" + HR_all +"\n"+
                "Tr_all=" + Tr_all +"\n"+
                "gpf_percentage=" + gpf_percentage +"\n"+
                "in_tax=" + in_tax +"\n"+
                "salary=" + this.getsalary() +"\n"+
                "inhand_salary=" + this.getInhand_salary()+"\n"+
                '}';
    }
}
