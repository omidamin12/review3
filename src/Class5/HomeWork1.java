package Class5;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner height=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        double number = height.nextDouble();
        if (number<60) {
            System.out.println("Short");
        } else if(number>60&&number<72) {
            System.out.println("medium");
        }else if (number>72);
        System.out.println("tall");

            }

        }

