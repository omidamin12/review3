package Class5;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner score = new Scanner(System.in);
        System.out.println("Please Enter quiz,midterm, and final scores");

        number1 = score.nextInt();
        number2 = score.nextInt();
        number3 = score.nextInt();
        if ((number1 + number2 + number3) / 3 >= 90) {

            System.out.println("Grade is A");
        } else if ((number1 + number2 + number3) / 3 >= 70 && (number1 + number2 + number3) / 3 < 90) {
            System.out.println("Grade is B");
        } else if ((number1 + number2 + number3) / 3 >= 50 && (number1 + number2 + number3) / 3 < 70) {
            System.out.println("Grade is C");
        } else if ((number1 + number2 + number3) / 3 < 50) {
            System.out.println("Grade is F");
        }

    }

}




