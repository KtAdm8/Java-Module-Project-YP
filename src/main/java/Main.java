import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Введите данные для автомобиля " + (i + 1) + ":");

            String name;
            while (true) {
                System.out.print("Название: ");
                name = scanner.nextLine().trim();

                if (!name.isEmpty()) {
                    break;
                } else {
                    System.out.println("Ошибка: название не может быть пустым. Повторите ввод.");
                }
            }

            int speed;
            while (true) {
                System.out.print("Скорость (от 1 до 250): ");
                try {
                    String input = scanner.nextLine();
                    speed = Integer.parseInt(input);

                    if (speed > 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Ошибка: скорость должна быть больше 0 и меньше или равна 250. Повторите ввод.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите целое число от 1 до 250. Повторите ввод.");
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
