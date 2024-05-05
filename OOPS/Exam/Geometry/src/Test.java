import Geometry.Reactangle;
import Geometry.Shapes;
import Geometry.Square;
import Geometry.Triangle;

public class Test {
    public static void main(String[] args) {
        Shapes s=new Shapes();
        s.setArea(10);
        s.setSides(4);


        Square s1= new Square();
        Square s2=new Square();
        Square s3=new Square(10);
        System.out.println("Area and sides of square:- ");
        s2.setSide(10);
        System.out.println("side="+s2.side);
        System.out.println("Area="+s1.getArea() +"\nSides="+s1.getSides());


        Reactangle r1=new Reactangle();
        Reactangle r2=new Reactangle();
        Reactangle r3=new Reactangle(10,5);
        r2.setBreadth(10);
        r2.setLength(5);
        System.out.println("\nArea and sides of Reactangle:- ");
        System.out.println("Length="+r2.length+",Breadth="+r2.breadth);

        System.out.println("Area"+r1.getArea() +"\nSides="+r1.getSides());

        Triangle t1=new Triangle();
        Triangle t2=new Triangle();
        Triangle t3=new Triangle(10,5);
        t2.setBreadth(10);
        t2.setHeight(5);
        System.out.println("\nArea and Sides of Triangle:-");
        System.out.println("Breadth="+t2.breadth+",Height="+t2.height);
        System.out.println("Area="+t1.getArea()+"\nSides="+t1.getSides());




    }
}
