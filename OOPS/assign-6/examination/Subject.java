package examination;

public class Subject {
    String name, code;
    int maxMarks;

    public Subject(String name, String code, String maxMarks) {
        this.name = name;
        this.code = code;
        this.maxMarks = Integer.parseInt(maxMarks);
    }

    public Subject(Subject subj) {
        name = subj.name;
        code = subj.code;
        maxMarks = subj.maxMarks;
    }
}
