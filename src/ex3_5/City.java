package ex3_5;

public class City {
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

    public City(String name, String country) {
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

    public int getNbHabitant() {
        return nbHabitant;
    }

    public void setNbHabitant(int nb) {

        this.nbHabitant = nb;
    }

// -------------------------------------- zone de methode -----------------------------------------------------------

    public String toStringWithoutHab() {
        return "[name=" + this.name + ", state=" + this.country + "]";
    }

    public String toString() {
        return "[name=" + this.name + ", state=" + this.country + ", habitants=" + this.nbHabitant +"]";
    }

}