package Project1;

public class Task5 {
    public static void main(String[] args) {
        int sumEven=0;
        int sumOdd=0;
        int totalSum=0;

        int[][]number=new int[][]{{40, 23, 10},
                               {12,30,89},
                                {1,4,7,}};
        for (int i = 0; i <number.length ; i++)
            for (int j = 0; j < number[i].length; j++)
                if (number[i][j]%2==0)

                    sumEven+=number[i][j];
                    System.out.println("Sum of even number is "+sumEven);

                for (int i = 0; i <number.length ; i++)
                    for (int j = 0; j < number[i].length; j++)
                        if (number[i][j] % 2 != 0)


                            sumOdd += number[i][j];
                        System.out.println("sum of even number is " + sumOdd);
                        totalSum=sumEven+sumOdd;
                        System.out.println("sum of even and odd number is: " +totalSum);
                    }}