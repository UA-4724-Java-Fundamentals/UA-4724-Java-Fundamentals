public abstract class Bird {
    private int feathers;
    private boolean layEggs;

    protected Bird(int feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs  = layEggs;
    }

    public int getFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return String.format("%s{feathers=%d, layEggs=%s}",
                getClass().getSimpleName(),
                feathers,
                layEggs);
    }
}
