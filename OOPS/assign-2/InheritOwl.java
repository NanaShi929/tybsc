public class InheritOwl extends Bird{
    boolean isDaytime;

    public InheritOwl(Bird b, boolean isDaytime) {
        super(b);
        this.isDaytime = isDaytime;
    }

    public InheritOwl(boolean canFly, boolean isDomestic, boolean isDaytime){
        super(canFly, isDomestic);
        this.isDaytime = isDaytime;
    }

    public boolean isDaytime() {
        return isDaytime;
    }

    public void setDaytime(boolean isDaytime) {
        this.isDaytime = isDaytime;
    }
}

