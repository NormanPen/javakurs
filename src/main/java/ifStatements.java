public class ifStatements {
    public static void main(String[] args) {
        int a = new java.util.Scanner(System.in).nextInt();
        int b = new java.util.Scanner(System.in).nextInt();
        int area = a * b;

         if (area>10_000) {
             System.out.println(area + " größer als 10.000");
         }
    }
}
