package Project1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= scanner.nextInt();
        boolean primeNumber=false;
        for (int i = 0; i < num/2; i++) {
            if (num % i == 0) {
                {
                    primeNumber = true;
                    break;
                }
            }

            if (primeNumber)
                System.out.println(num + " is a prime number");
            else
                System.out.println(num + " is not a prime number");
        }}}