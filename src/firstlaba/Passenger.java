package firstlaba;

public class Passenger extends Person {

    public Passenger(String name) {
//        this.setName(name);
        super(name);
    }

    @Override
    public String toString(){
        return "Пассажир" + super.getName();
    }

    private String name;

    private void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
