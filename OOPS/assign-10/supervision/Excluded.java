package supervision;

public class Excluded extends Faculty {
    String dutyleave, committeemember, sickness;

    public Excluded(String name, String subjectname, String lecturebasis, String dutyleave, String committeemember,
            String sickness) {
        super(name, subjectname, lecturebasis);
        this.dutyleave = dutyleave;
        this.committeemember = committeemember;
        this.sickness = sickness;
    }

    @Override
    public String toString() {
        return   ",\nname='" + name + '\'' +
                ", subjectname='" + subjectname + '\'' +
                "Excluded{\t" +
                "dutyleave=\t" + dutyleave +
                "\treason for exclusion\t"+display_sickleave()+
                '}';
    }
    public String display_sickleave(){
        String Disp="";
        if(this.dutyleave!="TRUE"){
          Disp="\t is a comitee memeber";

        }
        else {
            if(this.sickness=="TRUE"){
                Disp="\ton a sick leave";
            }
            else {
                Disp="\ton a leave";
            }
        }

        return Disp;
    }
}
