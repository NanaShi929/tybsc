public class Math extends Number  implements Arithmetic{

    Math[] mat;
    double average;
    double sum;
    int N1,N2,N3,N4,N5;

    public Math() {
        super();
    }

    public int getN5() {
        return N5;
    }

    public void setN5(int n5) {
        N5 = n5;
    }

    public int getN4() {
        return N4;
    }

    public void setN4(int n4) {
        N4 = n4;
    }

    public int getN3() {
        return N3;
    }

    public void setN3(int n3) {
        N3 = n3;
    }

    public int getN2() {
        return N2;
    }

    public void setN2(int n2) {
        N2 = n2;
    }

    public int getN1() {
        return N1;
    }

    public void setN1(int n1) {
        N1 = n1;
    }



public  Math(int N1, int N2,int N3,int N4,int N5){
    this.N1=N1;
    this.N2=N2;
    this.N3=N3;
    this.N4=N4;
    this.N5=N5;

    }



    public Math getSum(){
        sum=getN1()+getN2()+getN3()+getN4()+getN5();

        return new Math();
    }

    public Math getAverage() {
        average=(getN1()+getN2()+getN3()+getN4()+getN5())/2;
        return new Math();
    }
    public String toDouble(){
        String message= String.valueOf(Double.valueOf(""));

        for(Math m:mat) {
            message += "{" +
                    "N1= " + m.N1 +
                    "N2=" + m.N2 +
                    "N3=" + m.N3 +
                    "N4=" + m.N4 +
                    "N5=" + m.N5 +
                    "sum=" + m.getSum() +
                    "avg=" + m.getAverage() +
        '}';

        }
        return message;
    }
}
