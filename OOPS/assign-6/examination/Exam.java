package examination;

public class Exam{
    Student[] students;

    public Exam (Student[] students) {
        super();
        this.students = students;
        //System.out.println(students[0].display());
    }

    /*
     * TODO:
     * Write the required api
     */
    public String Report(){
        String report="";
        for(Student s:students){
            report+=s.display();
        }
        return report;
    }
}
