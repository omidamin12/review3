package HomeWork1;

public class PhoneTester {


    public static void main(String[] args) {

        Phone iphone=new Phone();
    iphone.name="IPhone 14 ProMax";
    iphone.color="Silver";

    iphone.capacity="120 GB";
    iphone.weight="205 G";
    iphone.price=1300;

    iphone.Communication();
    iphone.Authentication();
    iphone.faceId();
        System.out.println("________________________");

        Phone pixel=new Phone();
        iphone.name="pixel7";
        iphone.color="Black";
        iphone.capacity="128 GB";
        iphone.weight="190";
        iphone.price=550;

        iphone.Communication();
        iphone.Authentication();
        iphone.faceId();
        System.out.println("__________________________");

        Phone samsung=new Phone();
        iphone.name="samsung";
        iphone.color="white";
        iphone.capacity="128";
        iphone.weight="180";
        iphone.price=350;

        iphone.Communication();
        iphone.Authentication();
        iphone.faceId();
        System.out.println("----------------------------");






    }}