package Geometry;

public class Square extends Shapes implements Geometry{
    public int side=10;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        area=side*side;
        return area;
    }

    @Override
    public int getSides() {
        sides=4;
        return sides;
    }
public Square(){

}

    public Square(int side) {
this.side=side;
    }
}
