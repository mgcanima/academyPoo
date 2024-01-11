package ex1_4;

import java.util.ArrayList;
import java.util.List;

public class TestCity {

    public static void main(String[] args) {
        // 0 : objets city à constructeur avec 3 param
        City toulouse = new City("Toulouse", "France", 450000);
        City poudlard = new City("Poudlard", "Ecosse", 1000);

        // 2 : objets city à constructeur avec 2 param
        City schtroumf = new City("village des schtroumf", 99);
        City hyrule = new City("Hyrule", 80000);

        // 4 : on fait une liste de villes
        List<City> cityList = new ArrayList();
        cityList.add(toulouse);
        cityList.add(poudlard);
        cityList.add(schtroumf);
        cityList.add(hyrule);

        // 5 : on affiche la liste avec la methode showCity()
        for (int i = 0 ; i < cityList.size() ; i++) {
            cityList.get(i).display();
        }
    }

}
