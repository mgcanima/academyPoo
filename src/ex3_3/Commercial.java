package ex3_3;

public class Commercial extends Employe {
    double ca;

    public Commercial(String lastName, String firstName, int age, String adress, City city, String entreprise, double ca) {
        super(lastName,firstName,age,adress,city,entreprise);
        setCa(ca);
    }

    public double getCa() {
        return ca;
    }

    public void setCa(double ca){
        this.ca = ca ;
    }
}