package introductionJava.Lesson3.ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int value3 = scanner.nextInt();
        boolean result = value1 != value2 && value1 != value3 && value2 != value3;
        System.out.println(result);
    }
}
