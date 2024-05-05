package divyang;

import java.util.ArrayList;

public class Demography {
    ArrayList<Employed> employ;
    ArrayList<Unemployed> unemploy;
    public Demography(ArrayList<Employed> employ, ArrayList<Unemployed> unemploy) {
        this.employ = employ;
        this.unemploy = unemploy;
    }
    
    /*
     * TODO: Write the required api here
     */
    public String Report(){
        String Report="";
        for (Employed E:employ){
            Report+=E.toString();
        }
        Report+="\n---------------------------------------------------------------------------\n";
        for (Unemployed U:unemploy){
            Report+=U.toString();
        }
        return Report;
    }
}
