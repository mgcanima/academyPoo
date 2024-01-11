package ex1_2;

import java.util.Scanner;

public class City {

// -------------------------------------- zone de parametres -----------------------------------------------------------

    // 1 : on fait les parametres privés
    private String name;
    private String country;
    private int nbHabitant;

    // 3 : on fait le constructeur, il permet de rentrer les parametres dans l'objet appelé ailleurs
    public City(String name,String country, int nbHabitant) {
        setName(name);
        setCountry(country);
        setNbHabitant(nbHabitant);
    }

    // 2 : on fait les getter et setteur (pour l'encapsulation)
    // note : l'encapsulation permet de securisé les données, par exemple dans la vie peu comme si on demandait notre nom, où rien n'oblige à dire son vrai nom !
    public String getName() {
        return name;
    }

    public void setName(String nm) {
        this.name = nm ;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String ctr) {
        this.country = ctr ;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public void setNbHabitant(int nb) {
        // 7a : par exemple d'encapsulation, on ne peut plus ici dire que les habitants ont une valeur negative !
        if (nb >= 0) {
            this.nbHabitant = nb;
        }
        else {
            // 7b, le else appelle une fonction de verification
            System.out.println("Entrez un nouveau nombre d'habitant");
            Scanner scan = new Scanner(System.in);
            int nbHab = scan.nextInt();
            setNbHabitant(nbHab);
        }
    }

// -------------------------------------- zone de methode -----------------------------------------------------------

    // 5a : on fait les methodes de l'objet qui seront necessaires
    // Note : les methodes sont comme des fonctions, mais qui ne sont lié que à l'objet   (une fonction peut etre utilisée sans objet, la methode a forcement un objet pour fonctionner , mais c'est la meme chose dans le fonctionnement)
    // 5b : Methode d'affichage
    public void showCity() {
        System.out.println(this.getName() + " " + this.getCountry() + " " + this.getNbHabitant());
    }

    // 7c : Methode de verification de la taille
    public void changeCitySize() {
        System.out.println("Entrez un nouveau nombre d'habitant");
        Scanner scan = new Scanner(System.in);
        int nbHab = scan.nextInt();
        setNbHabitant(nbHab);
    }

    // 8 : Methode de reduction de taille de ville
    public void setDownCitySize() {
        System.out.println("Combien d'habitants vont partir");
        Scanner scan = new Scanner(System.in);
        int suppr = scan.nextInt();
        setNbHabitant(this.nbHabitant - suppr);
    }



}