
import java.util.ArrayList;
import java.io.IOException;


public class Main {
    private static final EntertainmentSpec combining= new TourSpec(true, TypeOfTour.COMBINING);


    public static void main (String[]args) {
        ListOfTours<Tour> chosenTour = new ListOfTours<>();

        Tour tour = new Tour("Riga Old Town walking tour",6.16, 1.30f,"English",combining,377);
        chosenTour.addEntertainment(tour);

        tour = new Tour("Ultimate Husky dog sled ride experience in Latvia", 78.84,3.00f, "German",combining,445);
        chosenTour.addEntertainment(tour);

        tour = new Tour("Delicious Food Tasting Adventure in Riga Central Market",32.35,2.30f,"Italian, English", combining,625);
       chosenTour.addEntertainment(tour);


    }


}
