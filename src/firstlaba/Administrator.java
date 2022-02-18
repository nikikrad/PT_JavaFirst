package firstlaba;

public class Administrator extends Person {

    public Administrator(String name) {
        super(name);
    }

    @Override
    public String toString(){
        return "Администратор " + super.getName();
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
