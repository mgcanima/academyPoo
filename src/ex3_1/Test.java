package ex3_1;

public class Test {

    public static void main(String[] args) {

        // 1 capitale
        Capitale paris = new Capitale("Paris", "France", 20000000, "TourEiffel");
        Capitale london = new Capitale("Londre", "GB", 94000000, "Bigben");

        System.out.println(paris);
        System.out.println(london);
    }

}