package firstlaba;


import java.io.Serializable;
import java.util.Objects;

public class Train implements Serializable {

    private String time;

    public Train(String time) {
        this.setTime(time);
    }

    public String getTime() {
        return time;
    }

    private void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return this.getTime();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return time.equals(train.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time);
    }
}
