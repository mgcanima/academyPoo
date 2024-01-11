package ex1_5;

import java.util.ArrayList;
import java.util.List;

public class TestCity {

    public static void main(String[] args) {
        City toulouse = new City("Toulouse", "France", 450000);
        City hyrule = new City("Hyrule", 80000);

        // 1 : test
        System.out.println(toulouse);
        // Ca affiche n'importe quoi, car toulouse est un objet avec plusieurs valeurs mélangées et non des valeurs uniques.

    }

}