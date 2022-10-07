///**/ Class Cow is to give information on the specific animal
public class Cow {
    // Variables to hold their names
    String name;
    String image;

    // Public classes to save their information into the array
    public Cow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String _image) {
        this.image = _image;
    }
}
