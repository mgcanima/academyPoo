package ex3_6;

public class Capitale extends City {
    private String monument;

    public Capitale(String name,String country, int nbHabitant, String monument) {
        super(name,country,nbHabitant);
        setMonument(monument);
    }

    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument ;
    }

}
