package HomeWork1;

public class Task1 {
    public static void main(String[] args) {



        String[][] Grade= {{"Sahil", "Mashal", "Zubair", "Omid"}, {"A","B","C","D"}};
        for (int i = 0; i < Grade[0].length; i++) {
            for (int j = 0; j< Grade[1] .length; j++) {
                if (i == 0 & j == 2) {


                System.out.println(Grade[i][j] + " " + "Your grade is A");
            }else if (i==0 & j ==3){
                    System.out.println(Grade[i][j]+" "+ "Your grade is B");
                }

            }  }
    }}