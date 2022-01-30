package firstlaba;

import java.util.ArrayList;

public class Station {

    public Station(ArrayList<String > name){
        this.setName(name);
    }

    private ArrayList<String> name;
    public ArrayList<String> stations = new ArrayList<>();

    private void setName(ArrayList<String> name){
        this.name = name;
    }

    public ArrayList<String> getName(){
        return stations;
    }

}
