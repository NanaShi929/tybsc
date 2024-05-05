package wholesale;

import java.util.Arrays;

public class Distributor {
    GstBill[] gstBills;

    public Distributor(GstBill[] gstBills) {
        this.gstBills = gstBills;
    }
    /*
     * TODO: Write the required api
     */

    @Override
    public String toString() {
        String message = "";
        for (GstBill b :gstBills) {
            message+=b.toString();


        }
        return message;
    }
}
