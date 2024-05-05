import java.util.Scanner;
/**
 * @author ShreYash
 * date:- 11/10/2023
 */
public class Square extends Square_SuperClass implements Square_Interface {
    private final Square_Class square_Class = new Square_Class();


    public static void main(String[] args) {
        Square r =  new Square();
        Scanner l=new Scanner(System.in);
        System.out.println("enter length:");
        Scanner b=new Scanner(System.in);
        System.out.println("enter width:");
        r.length=l.nextInt();
        r.breadth=b.nextInt();
        System.out.println("Area="+r.getArea(r.length ,r.breadth ));
        System.out.println("Perimeter="+r.getPerimeter(r.length,r.breadth ));
    }

    public double getArea(double w, double l){
        return square_Class.getArea(w, l);
    }

    public double getPerimeter(double w, double l){
        return extracted_method(w, l);
    }

    private double extracted_method(double w, double l) {
        return square_Class.getPerimeter(w, l);
    }
}
