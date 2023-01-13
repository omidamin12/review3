package Class5;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your date of brith");
        String month= scan.nextLine();
        if (month.equals("june")||month.equals("july")||month.equals("August")) {
            System.out.println("you were born in Summer");
        }else if (month.equals("September")||month.equals("October")||month.equals("November")) {
            System.out.println("you were born in fall");
        }else  if (month.equals("December")||month.equals("January")||month.equals("February")) {
            System.out.println("you were born in Winter");
        }    else  if (month.equals("march") || month.equals("April") || month.equals("May")) {
                        System.out.println("you were born in Spring");

                    }scan.close();
                }}




