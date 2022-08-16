
// Zuweisungsoperator
// Math.random()
// Unäres Minus und Plus
// Aritmethik, Divisionsoperator, Restwert-Operator
// Bitmanipulation
// Vergleiche
// Logische Operatoren
// Kurzschluss
// Verbundoperator
// Präfix-/Postfix-Inkrement und -Dekrement
// Typumwandlung
// Sting-Konkatenation
// Bit Operatoren


public class expressionsOperators {
    public static void main(String[] args) {
        int  age;
        System.out.println(age=90);
        System.out.println(age);

        System.out.println(Math.random() *10);

        int number = 10_000_000;
        System.out.println(10_000_00*number);

        System.out.println(10./3); // durch . zur fliesßkommazahl
        System.out.println(10%3); // Rest

        System.out.println(1<2);
        System.out.println(1>0);
        System.out.println(2.0 <= 1.0 + 1.0); // == funktioniert bei Fließkomma nicht richtig, deswegen kleinergleich oder größer gleich
        System.out.println( 1.0 != 2.0);

        System.out.println(true && true); // and
        System.out.println(true && false);
        System.out.println(true || true); // or
        System.out.println(true || false);
        System.out.println(true ^true); //Xor
        System.out.println(true ^ false);
        System.out.println(false ^true);
        System.out.println(false ^false);

        System.out.println(!true); //umkehren
        System.out.println(!false);

        System.out.println( true || true || true); // Kurzsschluss
        System.out.println( false && true && true);

        System.out.println( true | true | false); // Nicht Kurzschluss
        System.out.println(false & true & true); // Kann zu iungewünschten Seiteneffekten führen

        double random = Math.random();
        random = random * 10;
        random *=10;

        int width = 100;
        width++;
        System.out.println(width);
        int len1 = 100;
        int len2 = 100;
        System.out.println(len1++);
        System.out.println(++len2);

        System.out.println((1+1)+10);

        System.out.println((int)(Math.random()*11)); // (int) 0 <= random < 10.99999 => 0 ... 10

        int nn = 99;
        String hallo = "Hallo ";
        System.out.println(hallo + nn + " Welten");
        System.out.println(2 + "2" ); // sobald String vorhanden wird Zahl zu Text 2 + "2" = 22


        int b1 = 0b10101010;
        int b2 = 0b11010101;

        System.out.println(Integer.toBinaryString(b1));
        System.out.println(Integer.toBinaryString(b2));

        System.out.println(Integer.toBinaryString(~b1)); // Umkehr
        System.out.println(Integer.toBinaryString(~b2));

        System.out.println(Integer.toBinaryString(b1 & b2));
        System.out.println(Integer.toBinaryString(b1 | b2));
        System.out.println(Integer.toBinaryString(b1 ^b2));

        System.out.println(Integer.toBinaryString( 0b10 >> 1));
        System.out.println(Integer.toBinaryString( 0b10 >> 2));
        System.out.println(Integer.toBinaryString( 0b10 << 1));
        System.out.println(Integer.toBinaryString( 0b10 << 2));
    }
}
