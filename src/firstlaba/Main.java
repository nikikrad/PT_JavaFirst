package firstlaba;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {



    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        ArrayList<String> stations = new ArrayList<>();
        stations.add("Бобруйск");
        stations.add("Минск");
        stations.add("Жлобин");
        stations.add("Борисов");

        Train train =new Train("11:30") {
            @Override
            public String getTime() {
                return super.getTime();
            }
        };
        ArrayList<String> timeTrain = new ArrayList<>();
        timeTrain.add(train.getTime());
        timeTrain.add("10:23");
        timeTrain.add("03:14");
        timeTrain.add("07:34");
        timeTrain.add("14:33");
        timeTrain.add("16:03");
        timeTrain.add("19:40");
        timeTrain.add("23:17");

        boolean isTrue = true;
        while (isTrue) {

            System.out.println("1. Пассажир");
            System.out.println("2. Администратор");
            int x = scanner.nextInt();

            switch (x) {
                case (1): {
                    System.out.println("Введите ваше имя");
                    scanner.next();
                    String passenger = scanner.nextLine();
                    Passenger person = new Passenger(passenger);
                    for (int i = 0; stations.size() > i; i++) {
                        System.out.println((i + 1) + ". " + stations.get(i));
                    }
                    System.out.println(passenger + "Выберите станцию назначения:");
                    int buf = scanner.nextInt();
                    System.out.println("Введите дату поездки\nПример - 01.01.2022");
                    scanner.next();
                    String date = scanner.nextLine();
                    System.out.println("Введите время пездки\nПример - 01:01");
                    scanner.next();
                    String  time = scanner.nextLine();

//                    Time time1 = Time.valueOf("12:30:30");
//                    Time time2 = Time.valueOf("11:30:00");
//                    System.out.println(time1.after(time2));
//                    Time qwe = time;
//
                    for(int i = 0; stations.size() > i; i++){
                        if(stations.get(i) <= time){
                            ArrayList<String> varTime = new ArrayList<String>();

                            System.out.println(varTime.add(time));
                        }
                    }

//                    String getTime = "";
//                    for(int var = 0; var < timeTrain.size(); var++) {
//                        for (int i = 0; i < 5; i++) {
//                            getTime = timeTrain.get(var);
//                            char qwe = getTime.charAt(i);
//                            String charToString = Character.toString(qwe);
//                            if(!charToString.equals(":")){
//                                String asd = "";
//                                asd += charToString;
//                            }
//                        }
//
//                    }
//                }
                break;

                case (2): {
                    Administrator admin = new Administrator("Никита");

                }
                break;
                default: {
                    System.out.println("Error!!!Попробуйте корректно ввести!");
                }
                break;
            }
        }

    }

}
