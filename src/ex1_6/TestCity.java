package ex1_6;

import java.util.ArrayList;
import java.util.List;

public class TestCity {

    public static void main(String[] args) {
        City toulouse = new City("Toulouse", "France", 450000);
        City poudlard = new City("Poudlard", "Ecosse", 1000);
        City schtroumf = new City("village des schtroumf", 99);
        City hyrule = new City("Hyrule", 80000);

        // 2 : Desormais l'affichage marchera car il appelle la methode toString()
        System.out.println(toulouse);
    }

}
