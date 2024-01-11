package ex3_2;

public class Test {

    public static void main(String[] args) {

        Employe gate = new Employe("Gate","Bill",65,"USA",new Capitale("Washington","USA",7600000, "W-M"), "Fondation B&M", 100000);
        Employe musk = new Employe("Musk" , "Elon" , 49 , "palo alto" , new City("Pretoria" , "Afrique du Sud" , 800000) , "Tesla" , 150000);

        System.out.println(gate);
        System.out.println(musk);
    }

}