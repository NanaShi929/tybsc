package research;

public class Paper {
    // Let us assume there is only one supportive author for each paper
    String title, remark, first, supportive, guide, publicationyear;
    String citation;

    public Paper(String title, String remark, String first, String supportive, 
        String guide, String publicationyear, String citation) {
        this.title = title;
        this.remark = remark;
        this.first = first;
        this.supportive = supportive;
        this.guide = guide;
        this.publicationyear = publicationyear;
        this.citation = citation;
    }
}
