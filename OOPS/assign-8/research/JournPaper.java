package research;

public class JournPaper extends Paper{
    String journalName;

    public JournPaper(String title, String publicationyear, String first, String supportive, 
            String guide, String citation, String remark, String journalName) {
        super(title, remark, first, supportive, guide, publicationyear, citation);
        this.journalName = journalName;
    }

    @Override
    public String toString() {
        return "JournPaper{" +
                "journalName='" + journalName + '\'' +
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
