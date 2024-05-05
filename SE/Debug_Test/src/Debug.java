public class Debug {
    public static void main(String[] args) {
        Test test1 = new Test();
        int value=test1.getInitialValue();
        test1.doStuff(value);
        System.out.println("Start");
        System.out.println("Incrementing Value");
        value ++;
        value= value-8;
        System.out.println(value);
        System.out.println("Finish");

    }
}
