public class Square_Class implements Square_Interface {
    public Square_Class() {
    }

    @Override
    public double getArea(double w, double l) {
        double area = w * l;
        return area;
    }

    @Override
    public double getPerimeter(double w, double l) {
        double perimeter = (2 * (w + l));
        return perimeter;
    }
}