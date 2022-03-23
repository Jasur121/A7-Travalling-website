import com.sun.javafx.scene.EnteredExitedHandler;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

enum TypeOfTour {SIGHTSEEING, SHOREEXCURSION, ADVENTURE, SPORTING, COMBINING, SOME}

    public class TourSpec extends EntertainmentSpec {
        private TypeOfTour typeOfTour;

        public TourSpec (boolean isMostPopular, TypeOfTour typeOfTour) {
            super(isMostPopular);
            this.typeOfTour = typeOfTour;
        }


        public TourSpec() {
            super();
            this.typeOfTour = TypeOfTour.SOME;
        }

      public TypeOfTour getTypeOfTour() {
            return typeOfTour;
      }




}
