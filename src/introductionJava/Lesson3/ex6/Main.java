package introductionJava.Lesson3.ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        double difference = number2 - number1;
        System.out.println(difference);
    }
}
