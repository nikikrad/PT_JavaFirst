package firstlaba;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static public Repository repository = new Repository();


    public static void main(String[] args) throws MyException {

        Scanner scanner = new Scanner(System.in);


//        ArrayList<Station> stations = new ArrayList<>();
        repository.stations.add(new Station("Гомель"));
        repository.stations.add(new Station("Минск"));
        repository.stations.add(new Station("Борисов"));
        repository.stations.add(new Station("Жлобин"));


        Random random = new Random();
//        ArrayList<Integer> prise = new ArrayList<>();
        repository.price.add(random.nextInt(4) + 6);
        repository.price.add(random.nextInt(4) + 10);
        repository.price.add(random.nextInt(4) + 7);
        repository.price.add(random.nextInt(4) + 3);


        ArrayList<Train> timeTrain = new ArrayList<>();
        timeTrain.add(new Train("01:21"));
        timeTrain.add(new Train("02:30"));
        timeTrain.add(new Train("03:14"));
        timeTrain.add(new Train("07:34"));
        timeTrain.add(new Train("10:23"));
        timeTrain.add(new Train("14:33"));
        timeTrain.add(new Train("16:03"));
        timeTrain.add(new Train("19:40"));
        timeTrain.add(new Train("23:17"));

        boolean isTrue = true;
        while (isTrue) {
            try {
                System.out.println("1. Пассажир");
                System.out.println("2. Администратор");
                System.out.println("0. Выход");
                int x = scanner.nextInt();
                if(x > 2 || x < 0){
                    throw new MyException("Неправильный ввод данных!");
                }

                switch (x) {
                    case (1): {
                        System.out.println("Введите ваше имя");
                        scanner.next();
                        String passenger = scanner.nextLine();
                        Passenger person = new Passenger(passenger);
                        for (int i = 0; repository.stations.size() > i; i++) {
                            System.out.println((i + 1) + ". " + repository.stations.get(i).getName());
                        }
                        System.out.println(passenger + "Выберите станцию назначения:");
                        int buf = scanner.nextInt();
                        buf--;
                        System.out.println("Введите дату поездки\nПример - 01.01.2022");
                        String date = scanner.nextLine();
                        date = scanner.nextLine();
                        System.out.println(date);
                        System.out.println("Введите время пездки\nПример - 01:01");
                        String time = scanner.nextLine();
                        String mmm = "";
                        System.out.println(time);

                        for (int i = 0; i < 5; i++) {
                            char qwe = time.charAt(i);
                            String charToString = Character.toString(qwe);
                            if (!charToString.equals(":")) {
                                mmm += charToString;
                            }
                        }
                        int intTime = Integer.parseInt(mmm.trim());

                        String asd = "";
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        String getTime = "";
                        for (int var = 0; var < timeTrain.size(); var++) {
                            for (int i = 0; i < 5; i++) {
                                getTime = timeTrain.get(var).getTime();
                                char qwe = getTime.charAt(i);
                                String charToString = Character.toString(qwe);
                                if (!charToString.equals(":")) {
                                    asd += charToString;
                                }
                            }

                            int yuu = Integer.parseInt(asd.trim());
                            arrayList.add(yuu);
                            asd = "";
                        }
                        ArrayList<Integer> varTime = new ArrayList<>();
                        for (int i = 0; arrayList.size() > i; i++) {
                            if (intTime <= arrayList.get(i)) {
                                varTime.add(i);
                            }
                        }
                        System.out.println(person + " выберите время:");
                        for (int i = 0; i < varTime.size(); i++) {
                            int q = i;
                            System.out.println((q + 1) + ". " + timeTrain.get(varTime.get(i)));
                            q = 0;
                        }
                        int variable = scanner.nextInt();
                        variable--;
                        System.out.println(person + " ваша станция назначения - " + repository.stations.get(buf).getName() + ".\nДата отправления - " + date +
                                ".\nВремя отправления - " + timeTrain.get(varTime.get(variable)) + ". \nЦена поездки - " + repository.price.get(buf) + "р.\n");
                    }
                    break;

                    case (2): {
                        Administrator admin = new Administrator("Никита");
                        System.out.println(admin.toString() + " выберите:");
                        System.out.println("1. Посмотреть все станции");
                        System.out.println("2. Добавить новую станцию");
                        System.out.println("3. Сохранить файл");
                        System.out.println("4. Загрузить из файла");
                        int buf = scanner.nextInt();
                        switch (buf) {
                            case 1: {
                                for (int y = 0; y < repository.stations.size(); y++) {
                                    System.out.println(repository.stations.get(y));
                                }
                            }
                            break;
                            case 2: {
                                System.out.println("Введите новую станцию: ");
                                scanner.nextLine();
                                repository.stations.add(new Station(scanner.nextLine()));
                                System.out.println("Введите минимальную цену: ");
                                int newPrise = scanner.nextInt();
                                repository.price.add(random.nextInt(4) + newPrise);
                                System.out.println("Новая станция успешно добавлена!");

                            }
                            case 3:{
                                FileOutputStream fos = new FileOutputStream("repository.txt");
                                ObjectOutputStream oos = new ObjectOutputStream(fos);
                                oos.writeObject(repository);
                                oos.flush();
                                oos.close();
                            }break;
                            case 4:{
                                FileInputStream fis = new FileInputStream("repository.txt");
                                ObjectInputStream oin = new ObjectInputStream(fis);
                                repository = (Repository) oin.readObject();
                            }break;
                        }
                    }
                    break;
                    case 0: {
                        isTrue = false;
                    }
                }
            } catch (MyException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }catch (Exception e){
                System.out.println(e.getMessage());
                scanner.nextLine();
            }


        }

    }

}
