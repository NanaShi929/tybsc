package research;

public class ConfPaper extends Paper{
    String conferenceName;

    public ConfPaper(String title, String publicationyear, String first, String supportive,String guide, String citation, String remark,
                     String conferenceName) {
        super(title, remark, first, supportive, guide, publicationyear, citation);
        this.conferenceName = conferenceName;
    }

    @Override
    public String toString() {
        return "ConfPaper{" +
                "conferenceName='" + conferenceName + '\'' +
                ", title='" + title + '\'' +
                ", remark='" + remark + '\'' +
                ", first='" + first + '\'' +
                ", supportive='" + supportive + '\'' +
                ", guide='" + guide + '\'' +
                ", publicationyear='" + publicationyear + '\'' +
                ", citation='" + citation + '\'' +"\n"+
                '}';
    }
}
