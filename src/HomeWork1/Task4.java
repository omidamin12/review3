package HomeWork1;

public class Task4 {
    public static void main(String[] args) {
        int sum = 0;
        String[][] Countries = {{"Canada", "Mexico", "Guatemala", "El Salvador"},
                {"Ecuador", "Venezuela", "Suriname", "Aruba"},
                {"Hungary", "Netherlands", "Belgium", "Poland"},
                {"Afghanistan", "India", "Indonesia", "Iraq"},
                {"Ethiopia", "Kenya", "Morocco", "Algeria"},

        };

        for (int i = 0; i < Countries.length; i++) {
            for (int j = 0; j < Countries[i].length; j++) {
                sum++;

                System.out.println(Countries[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for (String[]conut:Countries){
            for (String Coun:conut) {
                System.out.println(conut+" ");


            }
            System.out.println();
    }
        System.out.println("total Countries"+sum);}}









