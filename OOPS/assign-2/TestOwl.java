public class TestOwl {

    static void showOwl (Owl o) {
        System.out.println("Displaying Owl now...");
        System.out.println(o);
        System.out.println(o.isDaytime());
    }

    static void showInheritowl (InheritOwl o) {
        System.out.println("Displaying Inherited Owl now...");
        System.out.println(o);
        System.out.println(o.isDaytime());
    }

    public static void main(String[] args) {
        Owl owl = new Owl(false, false, false);
        InheritOwl iowl = new InheritOwl(false, false, false);
        showOwl(owl);
        showInheritowl(iowl);
    }
}
