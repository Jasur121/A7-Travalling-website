
import java.io.*;
import java.util.ArrayList;


public class  ListOfTours <A extends Entertainment> {
    private ArrayList<A> tourList = new ArrayList<>();



    public boolean addEntertainment(A entertainment) {
        if (!findEntertainment(entertainment)) {
            tourList.add(entertainment);
            return true;
        }
        return false;
        }


    public A getTour(int tour) {
        try {
            return this.tourList.get(tour);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }



    public boolean findEntertainment(A entertainment) {
        for (A t : tourList) {
            if (entertainment.equals(t)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<A> findEntertainment(EntertainmentSpec spec) {
        ArrayList<A> list = new ArrayList<>();
        for (A t : tourList) {
            if (spec.equals(t.getSpec())) {
                list.add(t);
            }
        }
        return list;
    }

//    public void savingTheObject(String directFile) throws IOException {
//
//        try (ObjectOutputStream localFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(directFile)))) {
//            for (Tour tour : tourList) {
//                localFile.writeObject(tour);
//            }
//        }
//    }



    public void printListOfChosenTours() {
        System.out.println("I have " + tourList.size() + " tours in bag");
        for (int i = 0; i < tourList.size(); i++) {
            System.out.println((i + 1) + ". " + tourList.get(i));
        }
    }
    }



