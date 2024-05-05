public class Shelf extends Cupboard{
    public String manuvear;
    public boolean refrigeration;
    String temp;

    public Shelf(String box_no, String location, String content, int no_of_compartments, String type,String manuvear,boolean refrigeration) {
        super(box_no, location, content, no_of_compartments, type);
        this.refrigeration=refrigeration;
        this.manuvear=manuvear;
    }

    public String getManuvear() {
        return manuvear;
    }

    public void setManuvear(String manuvear) {
        this.manuvear = manuvear;
    }


    public void setRefrigeration(boolean refrigeration) {
        this.refrigeration = refrigeration;
    }
    public String refrigeration_type(boolean refrigeration){
        refrigeration=this.refrigeration;
        while(refrigeration=true){
            if(temp=="warm"){
                return "heater";

            } else if (temp=="cold") {
                return "cooler";
            }
            else{
                return "invalid";
            }
        }
        return "";

    }
    public String typeofshelf(String manuvear){
        if(manuvear=="sliding"){
            return "showcase";
        } else if (manuvear=="shutter") {
            return "dropdown";


        }
        else {
            return "ordinary";
        }
    }

    @Override
    public void details() {
        super.details();
        System.out.println("type of shelf\t"+typeofshelf(manuvear));
        System.out.println("refrigeration\t"+refrigeration_type(refrigeration)+"\n");
    }
}
