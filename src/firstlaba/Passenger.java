package firstlaba;

public class Passenger extends Person {

    public Passenger(String name) {
        super(name);
    }

    @Override
    public String toString(){
        return "Пассажир" + super.getName();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

}
