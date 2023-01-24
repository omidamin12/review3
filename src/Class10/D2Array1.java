package Class10;

public class D2Array1 {
    public static void main(String[] args) {
        String[][] thomsonTrain=new String [3][3];
        String[] cabin0={"Saliha","Qahir","zuliha"};
        String[] cabin1={"irfan","Mashal","Anees"};
        String[] cabin2={"Shayesta","Khushal","Omid"};

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;

        // in the first [] we specify the address of 1 D ARRAY
        System.out.println(thomsonTrain[2][1]);
}}
