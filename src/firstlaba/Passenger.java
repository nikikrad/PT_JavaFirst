package firstlaba;

public class Passenger extends Person {

    public Passenger(String name) {
        super(name);
    }

    @Override
    public String toString(){
        return "Пассажир " + super.getName();
    }

    private Train train;

    public Train getTrain(){
        return getTrain();
    }

    public void setTrain(Train train){
        this.train = train;
    }

}
