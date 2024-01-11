package ex1_1;

public class TestCity {

    public static void main(String[] args) {
        // 3 : Grace au constructeur on peut faire un nouvel objet chaques fois
        City toulouse = new City("Toulouse", "France", 450000);
        City schtroumfVille = new City("village des schtroumf", "Espagne", 99);
        City poudlard = new City("Poudlard", "Ecosse", 1000);
        City hyrule = new City("Hyrule", "Royaulme de zelda", 80000);

        // 5 : on appelle la methode
        toulouse.showHabitants();

        // 6 : on ajoute à elle meme 2000
        toulouse.nbHabitant = + 2000;

        toulouse.showHabitants();
    }

}