public class InheritPeacock extends Bird{
    private boolean isHighflying;

    public InheritPeacock(Bird b) {
        super(b);
        //TODO Auto-generated constructor stub
    }

    public InheritPeacock(boolean canFly, boolean isDomestic, boolean isHighflying) {
        super(canFly, isDomestic);
        this.isHighflying = isHighflying;
    }

    public boolean isHighflying() {
        return isHighflying;
    }

    public void setHighflying(boolean isHighflying) {
        this.isHighflying = isHighflying;
    }
}

