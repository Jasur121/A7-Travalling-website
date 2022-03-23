import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EntertainmentSpec implements java.io.Serializable{
    private boolean isMostPopular;

    public EntertainmentSpec(boolean isMostPopular) {
        this.isMostPopular = isMostPopular;
    }

    public EntertainmentSpec() {
        this.isMostPopular = false;
    }

    public boolean messageTo(FileOutputStream fileOut) {
        try (ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(this);
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean isMostPopular() {
        return isMostPopular;
    }
}
