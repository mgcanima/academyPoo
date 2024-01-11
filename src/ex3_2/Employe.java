package ex3_2;

public class Employe extends Person {

    String entreprise;
    int salaire;

    public Employe(String lastName, String firstName, int age, String adress, City city, String entreprise, int salaire) {
        super(lastName,firstName,age,adress,city);
        setEntreprise(entreprise);
        setSalaire(salaire);
    }

    public Employe(String lastName, String firstName, int age, String adress, City city, String entreprise) {
        super(lastName,firstName,age,adress,city);
        setEntreprise(entreprise);
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise ;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire ;
    }

    public Employe removeCity(Employe employe) {
        City cityWithoutHabitants = employe.getCity();
        cityWithoutHabitants = new City(cityWithoutHabitants.getName(), cityWithoutHabitants.getCountry());
        employe.setCity(cityWithoutHabitants);
        return employe;
    }

    public String toString() {
        return super.getLastName() + ", firstName = " + super.getFirstName() + ", age=" + super.getAge() + ", adress=" + super.getAdress() + ", BornCity : " + super.getCity() + "]" ;
    }

}