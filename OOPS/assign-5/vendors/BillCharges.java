package vendors;

public interface BillCharges {
    double GST = 0.05;
    double INTGST = 0.04;

    void computeGST();
    void computeInterestGST();
}
