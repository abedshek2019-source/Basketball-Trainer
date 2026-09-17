import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basketball Training Tracker");

        System.out.print("How many shots did you make? ");
        int made = scanner.nextInt();

        System.out.print("How many shots did you take? ");
        int attempted = scanner.nextInt();

        double percentage = (double) made / attempted * 100;

        System.out.println("Your shooting percentage is: " + percentage + "%");

        if (percentage >= 70) {
            System.out.println("Great shooting!");
        } else {
            System.out.println("Keep practicing!");
        }

        scanner.close();
    }
}
