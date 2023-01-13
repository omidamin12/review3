package Class5;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your Country");
        String language= scan.nextLine();
        switch (language.toLowerCase()){
            case "afghanistan":
                System.out.println("You speak Pashto");
                break;
            case "Russia":
                System.out.println("You speak russian");
                break;
            case "india":
                System.out.println("You speak hindi");
                break;
            case "Pakistan":
                System.out.println("urdu");
                break;
            case "Qatar":
                System.out.println("arabic");
                break;
            default:
                System.out.println("other language");{
                    scan.close();
            }



        }

        }
    }









