import java.sql.SQLOutput;

public class ConditioningOperator {
    public static void main(String[] args) {
        int a = 12;
        int b = 3434;
        System.out.println( a > b ? a:b);

        double random = Math.random();
        String colour = random < 0.3 ? "rot" :
                        random < 0.6 ? "blau" :
                                "grün";
        System.out.println( colour );
    }
}
