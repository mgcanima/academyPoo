package ex3_5;

public class Person {
    private String lastName;
    private String firstName;
    private int age;
    private String adress;

    Capitale capital;

    public Person(String lastName,String firstName, int age, String adress, Capitale capital) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
        setAdress(adress);
        setCapitale(capital);
    }

    public Person(String lastName,String firstName, int age, String adress, City city) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
        setAdress(adress);
    }

    public Person(String lastName,String firstName, int age, String adress) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
        setAdress(adress);
    }

    public Person(String lastName,String firstName, int age) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
    }

    public Person(String lastName,String firstName) {
        setLastName(lastName);
        setFirstName(firstName);
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName ;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress ;
    }

    public City getCapitale() {
        return capital;
    }

    public void setCapitale(Capitale capital) {
        this.capital = capital ;
    }


    public String toString() {
        return "[LastName =" + this.lastName + ", firstName = " + this.firstName + ", age=" + this.age + ", adress=" + this.adress  + "]" ;
    }
}