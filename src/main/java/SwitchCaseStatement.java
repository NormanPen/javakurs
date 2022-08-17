public class SwitchCaseStatement {
    public static void main(String[] args) {
        int random = (int)(Math.random() * 3); // 0, 1, 2
        switch ( random ) {
            case 0 :
                System.out.println("rot");
                break;
            case 1:
                System.out.println("grün");
                break;
            case 2:
                System.out.println("blau");
                break;
        }

        String input = "Ice";
        switch (input) {
            case "Eis" :
            case "Ice" :
                System.out.println("Eis");
                break;
            case "Schokolade" :
                System.out.println("Schoki");
                break;
            default:
                System.out.println("Etwas anderes");
        }
    }
}
