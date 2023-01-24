package Project1;

public class Task11 {
    public static void main(String[] args) {

        String [] cat = {"Camel", "Lion", "Horse", "Camel", "Bear", "Horse"};

        for (int i = 0; i < cat.length; i++) {
            for (int j = i + 1; j < cat.length; j++) {
                if(cat[i].equals(cat[j])){
                    System.out.println(cat[j]);
                }
            }
        }
    }
}

