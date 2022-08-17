public class WhileLoop {
    public static void main(String[] args) {
        // while (Math.random()>0.1){
        //    System.out.println("Rumpf");
        // }

        int number = 123456789;
        int digit = 0;
        while ( number>0){
            digit ++;
            number /= 10;
            System.out.println(number);
        }
        System.out.println(digit);

        int counter = 0;
        final int LIMIT = 100;
        while ( counter < LIMIT&& Math.random()>0.01){

            System.out.println("Rump" + counter);
            counter++;
        }


        int number2 = 5;
        while (true){
            if ( number2 % 1111 == 0) {
                break;
            }
            number2--;

            if ( number2 % 2 == 0){
                continue;
            }
            System.out.println(number);
        }


    }
}
