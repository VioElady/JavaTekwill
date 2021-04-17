package introductionJava.Lesson3.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = scanner.nextInt(); //476

        int number1 = numberInput / 100;
        int number2 = (numberInput % 100) / 10;
        int number3 = (numberInput % 10 );

        System.out.println(number1+number2+number3);


    }
}
