package Project1;

public class Task10 {
    public static void main(String[] args) {

        int numFirst = 0;
        int numSecond = 0;

        int [] num = {46, 72, 3, 24, 19};

        for (int i = 0; i < num.length; i++) {
            if(num[i] > numFirst){
                numSecond = numFirst;
                numFirst = num[i];
            }
        }
        System.out.println(numSecond);
    }
}