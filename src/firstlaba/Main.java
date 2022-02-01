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

        Train train =new Train("01:30") {
            @Override
            public String getTime() {
                return super.getTime();
            }
        };
        ArrayList<String> timeTrain = new ArrayList<>();
        timeTrain.add(train.getTime());
        timeTrain.add("03:14");
        timeTrain.add("07:34");
        timeTrain.add("10:23");
        timeTrain.add("14:33");
        timeTrain.add("16:03");
        timeTrain.add("19:40");
        timeTrain.add("23:17");

        boolean isTrue = true;
        while (isTrue) {

            System.out.println("1. Пассажир");
            System.out.println("2. Администратор");
            System.out.println("0. Выход");
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
                    buf--;
                    System.out.println("Введите дату поездки\nПример - 01.01.2022");
                    String date = scanner.nextLine();
                    date = scanner.nextLine();
                    System.out.println(date);
                    System.out.println("Введите время пездки\nПример - 01:01");
//                    scanner.next();
                    String  time = scanner.nextLine();
//                    int intTime = Integer.parseInt(time.trim());
                    String mmm = "";
                    System.out.println(time);

                    for(int i = 0; i < 5; i++){
                        char qwe = time.charAt(i);
                        String charToString = Character.toString(qwe);
                        if(!charToString.equals(":")){
                            mmm += charToString;
                        }
                    }
                    int intTime = Integer.parseInt(mmm.trim());

//                    Time time1 = Time.valueOf("12:30:30");
//                    Time time2 = Time.valueOf("11:30:00");
//                    System.out.println(time1.after(time2));
//                    Time qwe = time;
//
//                    for(int i = 0; stations.size() > i; i++){
//                        if(stations.get(i) <= time){
//                            ArrayList<String> varTime = new ArrayList<String>();
//
//                            System.out.println(varTime.add(time));
//                        }
//                    }
                    String asd = "";
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    String getTime = "";
                    for(int var = 0; var < timeTrain.size(); var++) {
                        for (int i = 0; i < 5; i++) {
                            getTime = timeTrain.get(var);
                            char qwe = getTime.charAt(i);
                            String charToString = Character.toString(qwe);
                            if(!charToString.equals(":")){
                                asd += charToString;
                            }
                        }
//                        String lll = "123";
//                        int uuu = Integer.parseInt(lll.trim());
//                        System.out.println(uuu);
                        int yuu = Integer.parseInt(asd.trim());
                        arrayList.add(yuu);
                        asd = "";
                    }
                    ArrayList<Integer> varTime = new ArrayList<>();
                    for(int i = 0; arrayList.size() > i; i++){
                        if(intTime <= arrayList.get(i)){
                           varTime.add(i);
//                           System.out.println(timeTrain.get(i));
                        }
                    }
                    System.out.println(person + " выберите время:");
                    for (int i = 0; i < varTime.size(); i++){
                        System.out.println(timeTrain.get(varTime.get(i)));
                    }
                    int variable = scanner.nextInt();
                    variable--;
                    System.out.println(person + " ваша станция назначения - " + stations.get(buf) + ". Дата отправления - " + date + ". Время отправления - " + timeTrain.get(varTime.get(variable)));
                    isTrue = false;
                }
                break;

                case (2): {
                    Administrator admin = new Administrator("Никита");

                }
                break;
                default: {
                    System.out.println("Error!!!Попробуйте корректно ввести!");
                }
                break;
                case 0 :{
                    isTrue = false;
                }
            }
        }

    }

}
