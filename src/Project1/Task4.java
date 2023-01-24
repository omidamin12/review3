package Project1;

public class Task4 {
    public static void main(String[] args) {
        int[][]number = new int[][]{{7,45,23,3},
                {80,30,77},
                {1,8,10}};
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {

                if (number[i][j]%2 == 0)
                    System.out.println(number[i][j]);
            }


        }

    }
    }
