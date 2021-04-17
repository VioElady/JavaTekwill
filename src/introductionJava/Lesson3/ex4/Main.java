package introductionJava.Lesson3.ex4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();

        int heightToClimb = height - down;
        int climbPerDay = up - down;

        int result = (heightToClimb + climbPerDay - 1)  / climbPerDay;
        System.out.println(result);
    }
}
