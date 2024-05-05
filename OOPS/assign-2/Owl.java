public class Owl {
    private Bird b;
    private boolean isDaytime;

    Owl(boolean canFly, boolean isDomestic, boolean isDaytime) {
        this.b = new Bird(canFly, isDomestic);
        this.isDaytime = isDaytime;
    }

    public Bird getB() {
        return b;
    }

    public void setB(Bird b) {
        this.b = b;
    }

    public boolean isDaytime() {
        return isDaytime;
    }

    public void setDaytime(boolean isDaytime) {
        this.isDaytime = isDaytime;
    }
}

