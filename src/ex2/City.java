package ex2;

import java.util.Scanner;

public class City {

    private String name;
    private String country;
    private int nbHabitant;

    public City(String name,String country, int nbHabitant) {
        setName(name);
        setCountry(country);
        setNbHabitant(nbHabitant);
    }

    public City(String name,String country) {
        setName(name);
        setCountry(country);
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
        this.country = ctr ;
    }

    public int setNbHabitant() {
        return nbHabitant;
    }

    public void setNbHabitant(int nbHabitant) {
        this.nbHabitant = nbHabitant ;
    }


    public String toString() {
        return "[name=" + this.name + ", state=" + this.country + "]";
    }



}