package divyang;

public class Unemployed extends Divyang {
    int statehonararium, centerhonararium;
    boolean schooling;

    public Unemployed(String name, String locality, String udidno, String divyangpercent, String hasSkillcertificate, String statehonararium,
            String centerhonararium, String schooling) {
        super(name, locality, udidno, divyangpercent, hasSkillcertificate);
        this.statehonararium = Integer.parseInt(statehonararium);
        this.centerhonararium = Integer.parseInt(centerhonararium);
        this.schooling = Boolean.parseBoolean(schooling);
    }

    /*
     * TODO: Write the required api here
     */

    @Override
    public String toString() {
        return "\n\njobseeker:"+"\n"+
                ", name='" + name + '\'' +
                ", locality='" + locality + '\'' +
                ", udidno='" + udidno + '\'' +
                ", divyangpercent=" + divyangpercent +
                "statehonararium=" + statehonararium +
                ", centerhonararium=" + centerhonararium +
                ", schooling=" + schooling +
                ", hasSkillcertificate=" + hasSkillcertificate +
                '}';
    }
}
