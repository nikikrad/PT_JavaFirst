package firstlaba;

import java.io.Serializable;
import java.util.ArrayList;

public class Repository implements Serializable {

    public ArrayList<Station> stations = new ArrayList<>();

    public ArrayList<Integer> price = new ArrayList<>();
}
