package research;

import java.util.ArrayList;

public class Reference {
    ArrayList<JournPaper> journpapers;
    ArrayList<ConfPaper> confpapers;
    public Reference(ArrayList<JournPaper> journpapers, ArrayList<ConfPaper> confpapers) {
        this.journpapers = journpapers;
        this.confpapers = confpapers;
    }

    /*
     * TODO: Write the required api
     */
    public String message(){
        String message="";
        for(JournPaper J:journpapers){
        
            message+="\n"+J.toString()+"\n";
        }
        for (ConfPaper C:confpapers){
            message+="\n"+C.toString()+"\n";
        }
        return message;
    }


}
