package ex1_4;

import java.util.Scanner;

public class City {

// -------------------------------------- zone de parametres -----------------------------------------------------------

    private String name;
    private String country;
    private int nbHabitant;

    public City(String name,String country, int nbHabitant) {
        setName(name);
        setCountry(country);
        setNbHabitant(nbHabitant);
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

    // 3 : On soigne l'affichage, et on verifie si on a deux ou trois arguments
    public void display() {
        if(country != null)
            System.out.println("Ville de " + this.name + " en " + this.country + " ayant " + this.nbHabitant + " habitants");
        else {
            System.out.println("Ville de " + this.name + " ayant " + this.nbHabitant + " habitants");
        }
    }

    public void changeCitySize() {
        System.out.println("Entrez un nouveau nombre d'habitant");
        Scanner scan = new Scanner(System.in);
        int nbHab = scan.nextInt();
        setNbHabitant(nbHab);
    }

    public void setDownCitySize() {
        System.out.println("Combien d'habitants vont partir");
        Scanner scan = new Scanner(System.in);
        int suppr = scan.nextInt();
        setNbHabitant(this.nbHabitant - suppr);
    }



}