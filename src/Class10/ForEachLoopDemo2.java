package Class10;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter numbers");



   int[] number=new int[5];
        for (int i = 0; i < number.length; i++) {
number[i]=scanner.nextInt();

        }

        System.out.println(Arrays.toString(number));
    }}

