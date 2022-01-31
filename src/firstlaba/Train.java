package firstlaba;


public class Train {

    public Train(String time){
        this.setTime(time);
//        this.setDate(date);
    }

    private String time;

    public String getTime() {
        return time;
    }

    private void setTime(String time) {
        this.time = time;
    }

//
//
//    private String date;
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }

    @Override
    public String toString(){
        return "Ваше время " + this.getTime();
    }

}
