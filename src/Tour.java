
public class Tour  extends Entertainment {
    private int quantityOfBookings;

    public Tour(String name, double price, float durationOfTour, String languageOfTour, EntertainmentSpec spec, int quantityOfBookings) {
        super(name, price, durationOfTour, languageOfTour, spec);
        this.quantityOfBookings = quantityOfBookings;
    }

    public int getQuantityOfBookings() {
        return quantityOfBookings;
    }
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Price: " + getPrice() + " euro" + "\n" +
                "Duration of Tour: " + getDurationOfTour() + " hour" + "\n" +
                "Quantity of bookings: " + getQuantityOfBookings() +  "\n" +
                "Language of Tour: " + getLanguageOfTour() +"\n"  +
                "The most popular tour: " + getSpec().isMostPopular() + "\n" +
                "Type of tour: " + getSpec().toString() +"\n";
    }

}

