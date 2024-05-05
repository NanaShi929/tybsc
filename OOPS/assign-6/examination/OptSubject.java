package examination;

public class OptSubject extends Subject implements ExamInterface {
    String isaI_Marks, isaII_Marks, isaMarks, seeMarks, practMarks, totalMarks, grade;
    int marks;
    public OptSubject(Subject subject, String isaI_Marks, String isaII_Marks, String seeMarks, String practMarks) {
        super(subject);
        this.isaI_Marks = isaI_Marks;
        this.isaII_Marks = isaII_Marks;
        this.seeMarks = seeMarks;
        this.practMarks = practMarks;
        this.isEligible();
        this.computeGrade();
    }

    @Override
    public void computeGrade() {
        // TODO Auto-generated method stub
        if (!totalMarks.equals("AB")) { // Student have valid Student in all components of the subject
            this.marks = Integer.parseInt(isaMarks)+ Integer.parseInt(seeMarks)+Integer.parseInt(practMarks);
            System.out.println(marks+"\t"+maxMarks);
            int percentage=marks/maxMarks*100;
            if(percentage>=40){
                grade="P";
            }
            else {
                grade="F";
            }
            totalMarks = Integer.toString(marks);
        }
        else {
            grade = "F";
        }
    }

    @Override
    public void isEligible() {
        // TODO Auto-generated method stub
        if ((isaI_Marks.equals("AB")) || (isaII_Marks.equals("AB"))) {
            isaMarks = "AB";
            totalMarks = "AB";
        }
        else {
            int marks = Integer.parseInt(isaI_Marks) + Integer.parseInt(isaII_Marks);
            isaMarks = Integer.toString(marks);
            totalMarks =Integer.toString(maxMarks);
        }
    }

    @Override
    public void isValid() {
        // TODO Auto-generated method stub
        if (!isaMarks.equals("AB")) {
            if (seeMarks.equals("AB")) {
                totalMarks = "AB";
            }
            if (!practMarks.equals("")) { // Subject have pract component
                if (practMarks.equals("AB")) {
                    totalMarks = "AB";
                }
            }
        }
    }

    @Override
    public String toString() {

        return "OptSubject{" +"\n"+
                ", name='" + name + '\'' +"\n"+
                ", code='" + code + '\'' +"\n"+
                ", maxMarks=" + maxMarks +"\n"+
                "isaI_Marks='" + isaI_Marks + '\'' +"\n"+
                ", isaII_Marks='" + isaII_Marks + '\'' +"\n"+
                ", isaMarks='" + isaMarks + '\'' +"\n"+
                ", seeMarks='" + seeMarks + '\'' +"\n"+
                ", practMarks='" + practMarks + '\'' +"\n"+
                ", totalMarks='" + totalMarks + '\'' +"\n"+
                ", grade='" + grade + '\'' +"\n"+
                '}';
    }

}
