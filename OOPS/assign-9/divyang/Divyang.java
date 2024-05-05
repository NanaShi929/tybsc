package divyang;

public class Divyang {
    String name, locality, udidno;
    int divyangpercent;
    boolean hasSkillcertificate;

    public Divyang(String name, String locality, String udidno, String divyangpercent, String hasSkillcertificate) {
        this.name = name;
        this.locality = locality;
        this.udidno = udidno;
        this.divyangpercent = Integer.parseInt(divyangpercent);
        this.hasSkillcertificate = Boolean.parseBoolean(hasSkillcertificate);
    }

    /*
     * TODO: Write the required api here
     */

    @Override
    public String toString() {
        return "Divyang{" +
                "name='" + name + '\'' +
                ", locality='" + locality + '\'' +
                ", udidno='" + udidno + '\'' +
                ", divyangpercent=" + divyangpercent +
                ", hasSkillcertificate=" + hasSkillcertificate +
                '}';
    }
}
