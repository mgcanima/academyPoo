package ex1_7;

import java.util.ArrayList;
import java.util.List;

public class TestCity {

    public static void main(String[] args) {
        City paris = new City("Paris", "France", 20000000);
        City nice = new City("Nice", "France", 340000);

        // 2 : on vise le dernier objet construit et on recupere son parametre instance
        int count = nice.instances;
        System.out.println("Nombre de instances : " + count);
    }

}