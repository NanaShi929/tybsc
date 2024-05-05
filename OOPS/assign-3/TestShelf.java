public class TestShelf {
    public static void main(String[] args) {
        Shelf s1=new Shelf("1001","B1","ice cream",3,"horizontal","sliding",true);
        Cupboard c1=new Cupboard("002","room 1","clothes",4,"metal ");
        s1.details();
        c1.details();

    }
}
