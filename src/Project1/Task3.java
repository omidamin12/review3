package Project1;

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] matrix = new int[][]{{9, 10, 4,},
                {5, 6, 7},
                {3, 8, 1}};
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)

                sum+=matrix[i][j];
        System.out.println(sum);

    }}

