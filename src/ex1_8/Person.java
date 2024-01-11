package ex1_8;

import java.util.Scanner;

public class Person {

// -------------------------------------- zone de parametres -----------------------------------------------------------

    // 1 : on reconstruit lobjet avec variables puis constructeur
    private String lastName;
    private String firstName;
    private int age;
    private String adress;

    public Person(String lastName,String firstName, int age, String adress) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
        setAdress(adress);
    }

    // 5 : On fait des constructors pour eviter les pieges du point 4
    public Person(String lastName,String firstName, int age) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
    }

    public Person(String lastName,String firstName) {
        setLastName(lastName);
        setFirstName(firstName);
    }


    // 2 : on encapsule
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


// -------------------------------------- zone de methode -----------------------------------------------------------

    // 3 : on met la methode toString ( !!! avec un return !!!)
    public String toString() {
        return "[LastName =" + this.lastName + ", firstName = " + this.firstName + ", age=" + this.age + ", adress=" + this.adress + "]" ;
    }



}