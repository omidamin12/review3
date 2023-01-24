package Class12;

import java.util.Scanner;

public class StringDemo8 {

    public static void main(String[] args) {


        Scanner s=new Scanner(System.in);
        System.out.println("please enter numbers");
        int sum=0;

        int[]numbers=new int[5];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=s.nextInt();

        }

        for (int i = 0; i < numbers.length; i++) {
            sum= sum+numbers[i];

        }
        System.out.println(sum);


             }}


