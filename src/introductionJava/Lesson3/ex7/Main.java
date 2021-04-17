package introductionJava.Lesson3.ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueInteger = scanner.nextInt();
        boolean result = valueInteger < 10 && valueInteger > 0;
        System.out.println(result);
    }
}
