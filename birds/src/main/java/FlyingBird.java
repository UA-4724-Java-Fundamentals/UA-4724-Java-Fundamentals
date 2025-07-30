public class FlyingBird extends Bird {
    public FlyingBird(int feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying!");
    }
}
