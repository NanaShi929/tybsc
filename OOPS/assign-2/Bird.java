public class Bird {
    private boolean canFly;
    private boolean isDomestic;

    public Bird(boolean canFly, boolean isDomestic) {
        this.canFly = canFly;
        this.isDomestic = isDomestic;
    }

    public Bird(Bird b) {
        this.canFly = b.canFly;
        this.isDomestic = b.isDomestic;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }
}
