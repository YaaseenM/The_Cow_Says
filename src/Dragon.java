// Uses the variable and program from the cow class
public class Dragon extends Cow {
    // Set image was used to show the image of a dragon
    public Dragon(String name, String image) {
        super(name);
        setImage(image);
    }

    // Normal dragons can breathe fire
    public boolean canBreathFire() {
        return true;
    }
}
