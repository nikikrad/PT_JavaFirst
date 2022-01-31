package firstlaba;

public class Passenger extends Person {

    public Passenger(String name) {
        super(name);
    }

    @Override
    public String toString(){
        return "Пассажир " + super.getName();
    }


}
