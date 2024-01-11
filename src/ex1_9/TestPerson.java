package ex1_9;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {

    public static void main(String[] args) {
        Person macron = new Person("Ducon", "Emannuel", 43, "Elysee de Paris");
        Person poutine = new Person("Poutine", "Vladimir", 68);        // piege : constructeur à  3 param !!!
        Person biden = new Person("Biden", "Joe");                    // piege : constructeur à  2 param !!!

        // 2 : Desormais l'affichage marchera car il appelle la methode toString()
        System.out.println(macron);
        System.out.println(poutine);
        System.out.println(biden);
    }

}