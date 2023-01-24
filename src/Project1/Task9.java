package Project1;

public class Task9 {
    public static void main(String[] args) {

        int[]num={45,56,7,90,34};
        int maxNum=num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>maxNum){
                maxNum=num[i];

            }

        }
           int minNum=num[0];
           for (int i = 0; i < num.length; i++) {
            if (num[i]<minNum){
                minNum=num[i];
            }

        }
        System.out.println("The maximum number in the array is:"+maxNum);
        System.out.println("The min number in the array is:"+minNum);


    }}







