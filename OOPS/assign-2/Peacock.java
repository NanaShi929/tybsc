public class Peacock {
    private Bird b;
    private boolean isHighflying;

    Peacock(boolean canFly, boolean isDomestic, boolean isHighflying) {
        this.b = new Bird(canFly, isDomestic);
        this.isHighflying = isHighflying;
    }

    public Bird getB() {
        return b;
    }

    public void setB(Bird b) {
        this.b = b;
    }

    public boolean isHighflying() {
        return isHighflying;
    }

    public void setHighflying(boolean isHighflying) {
        this.isHighflying = isHighflying;
    }

}
