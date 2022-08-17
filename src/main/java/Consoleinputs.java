public class Consoleinputs {

    public static void main(String[] args) {

        System.out.println("Bitte Produktname eingeben:");
        String name = new java.util.Scanner(System.in).nextLine();

        System.out.println("Bitte kcal eingeben:");
        double kcal = new java.util.Scanner(System.in).nextDouble();

        System.out.println("Bitte Anzahl der Produkte eingeben:");
        int number = new java.util.Scanner(System.in).nextInt();

        System.out.println("Name:" + name);
        System.out.printf("Gesamtzahl kcal: %f%n", number*kcal);
    }
}
