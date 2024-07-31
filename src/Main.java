import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    NumberManager  manager = new NumberManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введіть ціле число (або 'exit' для завершення): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                manager.addNumber(number);
            } catch (NumberFormatException e) {
                System.out.println("Невірний ввід. Будь ласка, введіть ціле число.");
            }
        }


        manager.printResults();
    }

    }
