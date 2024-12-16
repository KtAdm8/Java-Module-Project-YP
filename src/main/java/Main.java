import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Введите данные для автомобиля " + (i + 1) + ":");

            System.out.print("Название: ");
            String name = scanner.nextLine();

            int speed;
            while (true) {
                System.out.print("Скорость (от 1 до 250): ");
                speed = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера

                if (speed > 0 && speed <= 250) {
                    break;
                } else {
                    System.out.println("Ошибка: скорость должна быть больше 0 и меньше или равна 250. Повторите ввод.");
                }
            }

            cars[i] = new Car(name, speed);
        }

        Race race = new Race();
        race.findLeader(cars);

        Car leader = race.getLeader();
        System.out.println("Самая быстрая машина: " + leader.getName());

        scanner.close();
    }
}