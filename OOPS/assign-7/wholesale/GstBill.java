package wholesale;

public class GstBill extends Bill implements GstComputation{
    String billNumber;
    double  saleAmount, billAmount, cgst, sgst, gst;
    public GstBill(String tin, String billdate, String customer_name, String billNumber, String saleAmount, String gst, String narration) {
        super(narration, billdate, tin, customer_name);
        this.billNumber = billNumber;
        this.saleAmount = Double.parseDouble(saleAmount);
        this.gst = Double.parseDouble(gst);
        this.computeGst();
        this.computeTotal();
    }

    @Override
    public void computeGst() {
        // TODO Auto-generated method stub
        cgst = Math.round((saleAmount *gst)/100);
        sgst = cgst;
    }
    public double computeGstpaid(){
        return cgst*2;
    }

    @Override
    public void computeTotal() {
        // TODO Auto-generated method stub
        billAmount = saleAmount +computeGstpaid();
    }
    @Override
    public String toString() {
        return "\nGstBill{" +
                "billNumber='" + billNumber + '\'' +
                ", saleAmount=" + saleAmount +
                ", billAmount=" + billAmount +
                ", cgst=" + cgst +
                ", sgst=" + sgst +
                ", narration='" + narration + '\'' +
                ", billdate='" + billdate + '\'' +
                ", tin='" + tin + '\'' +"\n"+
                '}';
    }

}
