public class ForLoop {
    public static void main(String[] args) {
        for ( int counter = 1; counter < 11;counter++){
            System.out.println(counter);
        }

        int counter2 = 1;
        for ( ; counter2 < 11; counter2++){
            System.out.println(counter2);
        }
        System.out.println(counter2);


        for (int x=1; x <=  10; x++){
            for (int y = 1; y <= 10; y+=x){
                System.out.printf("%3d ", x*y);
            }
            System.out.println();
        }
    }
}
