class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        load();
    }

    public void load() {
        System.out.println("Loads the Image");
    }

    public void display() {
        System.out.println("Displaying the Image");
    }
}

class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if(realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");
        System.out.println("Proxy created. Image not loaded yet.");

        image.display(); //loads and displays
        image.display(); //just displays
    }
}