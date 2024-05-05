public class Cupboard extends Box{
    int no_of_compartments;
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Cupboard(String box_no, String location, String content, int no_of_compartments,String type ) {
        super(box_no, location, content);
        this.no_of_compartments=no_of_compartments;
        this.type=type;
    }

    public int getNo_of_compartments() {
        return no_of_compartments;
    }

    public void setNo_of_compartments(int no_of_compartments) {
        this.no_of_compartments = no_of_compartments;
    }

    public String doortype(String type){
        if(type=="supermarket"){
            return "glass sliding";
        }
        else if (type=="bookshelf") {
            return "no door";
        }
        else{
            return "enclosed";
        }
    }

    @Override
    public void details() {
        super.details();
        System.out.println("enclosure:\t"+doortype(type)+"\n");
    }
}
