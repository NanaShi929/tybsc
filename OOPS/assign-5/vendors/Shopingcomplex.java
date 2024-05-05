package vendors;

import java.util.Arrays;

public class Shopingcomplex extends Vendor {
    Vendor[] vendors;


    public Shopingcomplex(Vendor[] vendors) {
        this.vendors = vendors;
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
        return balance;
    }

    /*
     * TODO:
     * Write the api for the required reportsIf this amount(License fee + cgst + sgst) is not paid then on the balance amount the Interest is charged at
     * certain percents and int cgst, int sgst on the interest.
     * The total amount is considered as Bill amount(License fee, cgst, sgst, Interest, int cgst, int sgst).
     */
    @Override
    public String toString() {
        String message = "";
        for (Vendor v : vendors) {
            message += "\nVendor{" +
            	   
                    "name='" + v.name + '\'' +
                    ", shopno='" + v.shopno + '\'' +
                    ", bill_amount=" + v.getBillamount() +
                    ", license_fee=" + v.license_fee +
                    ", balance=" +v.getBalance() + "\n"+
                    '}';
        }
        return message;
    }

}

