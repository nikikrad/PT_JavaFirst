package firstlaba;

import java.io.Serializable;
import java.util.ArrayList;

public class Station implements Serializable {

   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Station(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
