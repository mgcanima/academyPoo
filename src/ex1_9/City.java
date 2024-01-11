package ex1_9;

import java.util.Scanner;

public class City {

    // -------------------------------------- zone de parametres -----------------------------------------------------------
    private String name;
    private String country;
    private int nbHabitant;

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
        this.name = ctr ;
    }


// -------------------------------------- zone de methode -----------------------------------------------------------

    public String toString() {
        return "[name=" + this.name + ", state=" + this.country + "]";
    }



}