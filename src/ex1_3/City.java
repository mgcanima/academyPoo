package ex1_3;

import java.util.Scanner;

public class City {

// -------------------------------------- zone de parametres -----------------------------------------------------------

    private String name;
    private String country;
    private int nbHabitant;

    // 0 : constructeur du precedent exercice
    public City(String name,String country, int nbHabitant) {
        setName(name);
        setCountry(country);
        setNbHabitant(nbHabitant);
    }

    // 1 : constructeur à 2 parametres (name et habitants)
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

    // 3 : On soigne l'affichage
    public void showCity() {
        System.out.println("[ Ville : " + this.name + "] [Pays : " + this.country + "] [Nombre d'habitants : " + this.nbHabitant + "]");
    }

    public void changeCitySize() {
        System.out.print("Entrez un nouveau nombre d'habitant");
        Scanner scan = new Scanner(System.in);
        int nbHab = scan.nextInt();
        setNbHabitant(nbHab);
    }

    public void setDownCitySize() {
        System.out.print("Combien d'habitants vont partir");
        Scanner scan = new Scanner(System.in);
        int suppr = scan.nextInt();
        setNbHabitant(this.nbHabitant - suppr);
    }



}