import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Entertainment implements java.io.Serializable {
    private String name;
    private double price;
    private float durationOfTour;
    private String languageOfTour;
    private EntertainmentSpec spec;


    public Entertainment(String name, double price,
                         float durationOfTour,
                         String languageOfTour, EntertainmentSpec spec) {
        this.name = name;
        this.price = price;
        this.durationOfTour = durationOfTour;
        this.languageOfTour = languageOfTour;
        this.spec = spec;
    }


    public Entertainment() {
        this.name = "";
        this.price = 0;
        this.durationOfTour = 0;
        this.languageOfTour = "";
        this.spec = null;
    }


    public void messageTo(FileOutputStream fileOut) {
        try (ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(this);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public float getDurationOfTour() {
        return durationOfTour;
    }
    public String getLanguageOfTour() {
        return languageOfTour;
    }
    public EntertainmentSpec getSpec() {
        return  spec;
    }


}


