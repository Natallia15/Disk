import java.util.Scanner;

public class Okt18_if_else_idem_guliat {
    public static void main(String[] args) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Солнце светит?");
        String a = scanner.nextLine();
        if (a.equals("да")) {
            if (b) {
                System.out.println("Идём гулять");
            } else {
                System.out.println("не идём");
            }
        } else {
            if (b) {
                System.out.println("не идём");
            }
            else {
            System.out.println("Сработал else");
            System.out.println("Остаемся дома");
        }
        System.out.println("Вернулись в главный поток");
    }
}}

