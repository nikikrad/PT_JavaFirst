package firstlaba;

public abstract class Person {

    public Person (String name){
        this.setName(name);
    }

    private String name;

    private void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    private Train train;

    public Train getTrain(){
        return getTrain();
    }

    public void setTrain(Train train){
        this.train = train;
    }
}
