package ex3_4;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Commercial dupont = new Commercial("Dupont" , "robert" , 50 , "rue des rosiers à Toulouse", new City("Limoges" , "France" , 133000), "brico", 5.0);

        System.out.println(dupont);

        Scanner scan = new Scanner(System.in);
        System.out.println("Saisissez le nouveau Ca");
        double ca = scan.nextDouble();
        dupont.setCa(ca);
        scan.close();

        System.out.println("Le nouveau CA es de " + dupont.getCa());

    }

}