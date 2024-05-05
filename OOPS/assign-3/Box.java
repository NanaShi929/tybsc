public class Box {
    /*box is the base class with content , box_no , and location*/
    public String box_no,location,content;
    public Box(String box_no,String location, String content){
        this.box_no=box_no;
        this.location=location;
        this.content=content;
    }
    public void setContent(String content1){
        this.content=content1;
    }

    public String getContent() {
        return content;
    }

    public String getBox_no() {
        return box_no;
    }

    public void setBox_no(String box_no) {
        this.box_no = box_no;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String box_state(){
        content=this.content;
        if(this.content==null){
            return "empty";
        }
        else {
            return "true";
        }
    }


    public void details(){
        System.out.println("details"+"\t"+getBox_no()+"\t"+getContent()+"\t"+getLocation()+"\t"+box_state()+"\n");
    }
}
