package firstlaba;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {



    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Пассажир");
        System.out.println("2. Администратор");
        int x = scanner.nextInt();

        ArrayList<String> stations = new ArrayList<>();
        stations.add("Бобруйск");
        stations.add("Минск");
        stations.add("Жлобин");

        Train train =new Train("11:30") {
            @Override
            public String getTime() {
                return super.getTime();
            }
        };
        ArrayList<String> time = new ArrayList<>();
        time.add(train.getTime());
        time.add

        switch (x){
            case (1): {
                System.out.println("Введите ваше имя");
                scanner.next();
                String passenger = scanner.nextLine();
                Passenger person = new Passenger(passenger);
                for(int i = 0; stations.size() > i; i++){
                    System.out.println((i+1) + ". " + stations.get(i));
                }
                System.out.println(passenger + " выберите станцию назначения:");
                int buf = scanner.nextInt();
                System.out.println("Введите дату поездки\nПример - 01.01.2022");
                scanner.next();
                String date = scanner.nextLine();
                System.out.println("Введите время пездки\nПример - 01:00");
                scanner.next();
//                String time = scanner.nextLine();
            }
            break;

            case (2): {
                Administrator admin = new Administrator("Никита");

            }
            break;
        }

    }

}
