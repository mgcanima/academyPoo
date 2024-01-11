package ex1_9;

import java.util.Scanner;

public class Person {

    // -------------------------------------- zone de parametres -----------------------------------------------------------
    // 2 : On l'ajoute en objet City dans le constructeur + variable + get + set
    private String lastName;
    private String firstName;
    private int age;
    private String adress;
    private City city;

    public Person(String lastName,String firstName, int age, String adress, City city) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
        setAdress(adress);
        setCity(city);
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city ;
    }


// -------------------------------------- zone de methode -----------------------------------------------------------

    // 3 : on l'ajoute à la fin du toString()
    public String toString() {
        return "[LastName =" + this.lastName + ", firstName = " + this.firstName + ", age=" + this.age + ", adress=" + this.adress + ", BornCity : " + this.city + "]" ;
    }



}