package ex2;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {

    public static void main(String[] args) {
        // 1 : on créé les objets ! Note : bien compter le nombre d'arguments !
        Person macron = new Person("Ducon", "Emannuel", 43, "Elysee de Paris", new City("Amiens", "France"));
        Person sarkozy = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 20000000));
        Person johnson = new Person("Jhonson", "Boris", 56, "Downing Street à London", new City("New York", "Etats-unis"));
        Person depardieu = new Person("Depardieu", "Gerard", 72, "Moscou", new City("Chateauroux", "France"));
        Person kravitz = new Person("Karvitz", "Lenny", 56, "Hotel particulier à Paris", new City("New York", "USA"));
        Person lawrence = new Person("Lawrence", "jennifer", 30, "Louisville aux USA", new City("Indian Hills", "USA"));

        // 2 : on en fait une liste
        Person listePerson [] = {macron,sarkozy,johnson,depardieu,kravitz,lawrence};
        Person listeFiltrePerson [] = {};

        // 3 : On affiche chaques elements de  la liste grace à la methode toString()
        for (int i = 0 ; i < listePerson.length ; i++ ) {
            System.out.println(listePerson[i]);
        }


        // 4 : on fait le filtre, il va chercher dans l'objet personn la ville, en allant chercher dans la ville son nom ou pays
        for (int i = 0 ; i < listePerson.length ; i++ ) {
            if(listePerson[i].getCity().getCountry() == "France" || listePerson[i].getCity().getName() == "Paris") {
                int newIndex = listeFiltrePerson.length;
                listeFiltrePerson[newIndex] = listePerson[i];
            }
        }

        // 3 : On affiche chaques elements de  la seconde liste grace à la methode toString()
        for (int i = 0 ; i < listeFiltrePerson.length ; i++ ) {
            System.out.println(listeFiltrePerson[i]);
        }
    }

}