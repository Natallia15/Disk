import java.util.Scanner;

public class Oct_3_So_Scanerom_chislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        if (x > 100 && x <= 1000) {
            System.out.println("1000>x>100");
        }

         else {
            System.out.println("другое число");
        }
    }

}


