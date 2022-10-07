// Gives the Ice Dragon his name and image which are used previous classes.
public class IceDragon extends Dragon {
    public IceDragon(String name, String image) {
        super(name, image);
    }

    // Ice Dragons cannot breathe fire
    public boolean canBreathFire() {
        return false;
    }
}
