package Geometry;

public class Reactangle extends Shapes implements Geometry{
    public int length=10;
    public int breadth=5;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        area= length*breadth;
        return area;
    }
@Override
    public int getSides() {
        sides=4;

        return sides;

    }
    public Reactangle(){

    }
    public Reactangle(int length,int breadth) {
this.length=length;
this.breadth=breadth;
    }


}
