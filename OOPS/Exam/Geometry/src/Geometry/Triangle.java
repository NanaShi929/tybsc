package Geometry;

public class Triangle extends Shapes implements Geometry{
    public int breadth=10;
    public int height=5;

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        area=(breadth*height)/2;
        return area;
    }


@Override
    public int getSides() {
        sides=3;
        return sides;
    }

public Triangle(){

}
    public Triangle(int breadth,int height) {
this.breadth=breadth;
this.height=height;

    }
}
