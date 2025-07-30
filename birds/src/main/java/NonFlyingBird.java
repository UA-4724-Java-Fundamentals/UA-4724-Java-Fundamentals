public class NonFlyingBird extends Bird {
    public NonFlyingBird(int feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " can't fly.");
    }
}
