package ex1_7;

import java.util.Scanner;

public class City {

// -------------------------------------- zone de parametres -----------------------------------------------------------

    private String name;
    private String country;
    private int nbHabitant;
    // 1a : on créé une variable instance
    public int instances;

    public City(String name,String country, int nbHabitant) {
        setName(name);
        setCountry(country);
        setNbHabitant(nbHabitant);
        // 1b on la fait evoluer dans le constructeur (elle grandira à chaques constructions)
        instances++;
    }

    public City(String name, int nbHabitant) {
        setName(name);
        setNbHabitant(nbHabitant);
    }

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
        this.name = ctr ;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public void setNbHabitant(int nb) {
        if (nb >= 0) {
            this.nbHabitant = nb;
        }
        else {
            changeCitySize();
        }
    }

// -------------------------------------- zone de methode -----------------------------------------------------------

    public void display() {
        System.out.println("Ville de " + this.name + " en " + this.country + " ayant " + this.nbHabitant + " habitants");
    }

    public void changeCitySize() {
        System.out.println("Entrez un nouveau nombre d'habitant");
        Scanner scan = new Scanner(System.in);
        int nbHab = scan.nextInt();
        setNbHabitant(nbHab);
    }

    // 1 : la methode toString() a un return de type String
    // Elle permet d'empecher l'erreur du 1.5, et affiche comme ca ce qu'on a envie
    public String toString() {
        return "Ville de " + this.name + " en " + this.country + " ayant " + this.nbHabitant + " habitants";
    }



}