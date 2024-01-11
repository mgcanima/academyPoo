package ex3_6;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Employe gate = new Employe("Gate","Bill",65,"USA",new Capitale("Washington","USA",7600000, "W-M"), "Fondation B&M", 100000);
        Employe musk = new Employe("Musk" , "Elon" , 49 , "palo alto" , new City("Pretoria" , "Afrique du Sud" , 800000) , "Tesla" , 150000);

        Commercial dupont = new Commercial("Dupont" , "robert" , 50 , "rue des rosiers à Toulouse", new City("Limoges" , "France" , 133000), "brico", 5.0);

        List employes = new ArrayList<Employe>();
        List commercial = new ArrayList<Commercial>();
        List total = new ArrayList();

        employes.add(gate);
        employes.add(musk);

        commercial.add(dupont);

        total.add(gate);
        total.add(musk);
        total.add(dupont);

    }

    public void showList(ArrayList liste) {
        for(int i = 0 ; i < liste.size() ; i ++) {
            System.out.println(liste.get(i));
        }
    }

}