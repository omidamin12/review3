package Class11;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {

        Dog Husky=new Dog();
        Husky.name="Jack";
        Husky.color="Black";
        Husky.age=8;

        Husky.bark();
        Husky.eat();
        Husky.Aggressive();
        System.out.println("------------------------------");

        Dog Bulldog=new Dog();
        Bulldog.name="Henry";
        Bulldog.color="Merle";
        Bulldog.age=10;

        Bulldog.bark();
        Bulldog.eat();
        Bulldog.Aggressive();
        System.out.println("");
        System.out.println("----------------------------------");

        Dog GermanShepherd=new Dog();
        GermanShepherd.name="Finn";
        GermanShepherd.color="White";
        GermanShepherd.age=9;

        GermanShepherd.bark();
        GermanShepherd.eat();
        GermanShepherd.Aggressive();



        }
    }

