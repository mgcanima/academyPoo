package ex1_1;

public class City {
    // 1 : on fait les parametres publics
    public String name;
    public String country;
    public int nbHabitant;

    // 2 : on fait le constructeur, il permet de rentrer les parametres dans l'objet appelé ailleurs
    public City(String name,String country, int nbHabitant) {
        this.name = name;
        this.country = country;
        this.nbHabitant = nbHabitant;
    }

    // 4 : on fait les methodes de l'objet qui seront necessaires
    // Note : les methodes sont comme des fonctions, mais qui ne sont lié que à l'objet   (une fonction peut etre utilisée sans objet, la methode a forcement un objet pour fonctionner , mais c'est la meme chose dans le fonctionnement)
    public void showHabitants() {
        System.out.println(this.name + " " + this.country + " " + this.nbHabitant );
        // note : on aurait pu faire :    this.getName()    à la place de    name    mais sans interet.
    }

}