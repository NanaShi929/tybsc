package supervision;

public class Faculty {
    String name, subjectname;
    boolean lecturebasis;

    public Faculty(String name, String subjectname, String lecturebasis) {
        this.name = name;
        this.subjectname = subjectname;
        this.lecturebasis = Boolean.parseBoolean(lecturebasis);
    }
    
}
