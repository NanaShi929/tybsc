public class Student {
    /*
     * Create a class student details with instance variables student_id, name,
     * marks (M1,m2,m3) in 3 subjects.
     * Create methods to set the values of the instance variables and to compute the
     * average and the grades.
     * Also a method to display all the details including the grade obtained.
     * Grade may be computed as follows:If avg gr than eq 70 - AAvg bet 50 and 70 -
     * BElseFail
     */
    public String Student_id, name, Grade;
    public int M1, M2, M3, Average;

    public Student(String Student_id, String name, int M1, int M2, int M3) {
        this.Student_id = Student_id;
        this.name = name;
        this.M1 = M1;
        this.M2 = M2;
        this.M3 = M3;
        this.Grade = getGrade();
    }

    public int getAverage() {
        Average = (M1 + M2 + M3) / 3;
        return Average;
    }

    public String getGrade() {
        if (getAverage() < 70 && getAverage() > 50) {
            Grade = "B";
        } else if (getAverage() < 100 && getAverage() > 70) {
            Grade = "A";
        } else if (getAverage() < 0 && getAverage() > 100) {
            Grade = "invalid";
        } else {
            Grade = "FAil";
        }
        return Grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Student_id='" + Student_id + '\'' +
                ", name='" + name + '\'' +
                ", M1=" + M1 +
                ", M2=" + M2 +
                ", M3=" + M3 +
                ", Average=" + Average +
                ", Grade='" + Grade + '\'' +
                '}';
    }

}
