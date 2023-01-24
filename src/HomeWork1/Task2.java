package HomeWork1;

public class Task2 {
    public static void main(String[] args) {
        int[][] Numbers = {{20, 25, 33},
                {45, 35, 31},
                {10, 15, 44}};
        int sum = 0;
        for (int i = 0; i < Numbers.length; i++) {
            for (int j = 0; j < Numbers[i].length; j++) {
                sum = sum +Numbers [i][j];}}
        System.out.println(sum);

    }
}


