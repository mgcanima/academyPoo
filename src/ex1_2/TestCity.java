package ex1_2;

public class TestCity {

    public static void main(String[] args) {
        // 4 : Grace au constructeur on peut faire un nouvel objet chaques fois
        City toulouse = new City("Toulouse", "France", 450000);
        City schtroumfVille = new City("village des schtroumf", "Espagne", 99);
        City poudlard = new City("Poudlard", "Ecosse", 1000);
        City hyrule = new City("Hyrule", "Royaulme de zelda", 80000);

        // 6 : on appelle la methode
        toulouse.showCity();

        int habitantsToulouse = toulouse.getNbHabitant();
        toulouse.setNbHabitant(habitantsToulouse+2000);
        toulouse.showCity();

        // appelle methode du 7
        toulouse.changeCitySize();
        toulouse.showCity();

        // appelle methode du 8
        toulouse.setDownCitySize();
        toulouse.showCity();
    }

}