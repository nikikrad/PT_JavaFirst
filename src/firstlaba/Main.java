package firstlaba;

import java.util.ArrayList;
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


        switch (x){
            case (1): {
                System.out.println("Введите ваше имя");
                String passenger = scanner.nextLine();
                passenger = scanner.nextLine();
                Passenger person = new Passenger(passenger);
                for(int i = 0; stations.size() > i; i++){
                    System.out.println((i+1) + ". " + stations.get(i));
                }
                System.out.println( passenger + " выберите станцию назначения:");
                int buf = scanner.nextInt();
            }
            break;

            case (2): {
                Administrator admin = new Administrator("Никита");

            }
            break;
        }

    }

}
