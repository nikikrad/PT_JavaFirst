package firstlaba;

public class Administrator extends Person {

    public Administrator(String name) {
        super(name);
    }

    @Override
    public String toString(){
        return "Администратор " + super.getName();
    }

}
