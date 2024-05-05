package vendors;

public class Vendor implements BillCharges {
    String name;
    String shopno;
    double bill_amount, license_fee, cgst, sgst,interest, interest_cgst,interest_sgst,paid_amount,balance;

    public Vendor(String name, String shopno, String license_fee,String paid_amount) {
        this.name = name;
        this.shopno = shopno;
        this.license_fee = Double.parseDouble(license_fee);
        this.paid_amount=Double.parseDouble(paid_amount);
        this.setBillamount();
    }

    public Vendor() {

    }

    private void setBillamount() {
        this.bill_amount = license_fee + cgst + sgst + interest + interest_cgst + interest_sgst;
    }

    public double getBillamount() {
        return bill_amount;
    }

    public double getPaid_amount() {return paid_amount;}
    public double getBalance(){
        balance=getBillamount()-getPaid_amount();
        return Math.abs(balance);
    }

    @Override
    public void computeGST() {
        // TODO Auto-generated method stub
        cgst = Math.round(license_fee * GST);
        sgst = cgst;
    }

    @Override
    public void computeInterestGST() {
        // TODO Auto-generated method stub
        interest_cgst = Math.round(interest * INTGST);
        interest_sgst = interest_cgst;
    }


}
