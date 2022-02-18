package firstlaba;

import java.io.Serializable;
import java.util.Objects;

public abstract class Person implements Serializable {

    public Person (String name){
        this.setName(name);
    }
    protected String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
