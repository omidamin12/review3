package Class5;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter grade");
        char grade =scan.next().charAt(0);
        if (grade=='A') {
            System.out.println(grade + "-Excellent");

        }else if (grade=='B') {
            System.out.println(grade+ "-Good");
        } else if (grade=='C') {
            System.out.println(grade+ "-Average");
        } else if (grade=='D') {
            System.out.println(grade + "-bad");
        } else  {
            System.out.println("Not acceptable");
            
        }

    }

    public static class ArraysDemo2 {
        public static void main(String[] args) {


            double[] arr = {10.5, 12.0, 45, 10.5, 23, 10.5};
            int cont = 0;
            for (int i = 0; i < arr.length; i++) {



                if (arr[i]==10.5){
    cont++;
        }}
            System.out.println(cont);


        }}
}















