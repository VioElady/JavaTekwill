package introductionJava.Lesson3.ex9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int value3 = scanner.nextInt();

        boolean onlyFirstIsPositive = value1 > 0 && value2 <= 0 && value3 <= 0;
        boolean onlySecondIsPositive = value1 <= 0 && value2 > 0 && value3 <= 0;
        boolean onlyThirdIsPositive = value1 <= 0 && value2 <= 0 && value3 > 0;

        boolean result = onlyFirstIsPositive || onlySecondIsPositive || onlyThirdIsPositive;
        System.out.println(result);


    }
}
