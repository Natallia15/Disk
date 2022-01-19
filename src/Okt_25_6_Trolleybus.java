import java.util.Scanner;

public class Okt_25_6_Trolleybus {
    // 3 попытки угадать
    public static void main(String[] args) {
        System.out.println("Что такое синее с усами?");


        int n0 = 1;
        int n1 = 1;
        int n2, a;

        for (a = 1; a < 4; a++) {
            Scanner sc = new Scanner(System.in);
            String x = sc.nextLine();
            if (x.equals("Троллейбус")) {
                System.out.println("Правильно");
                break;
            } else if (x.equals("Сдаюсь")) {
                System.out.println("Правильный ответ : троллейбус");
                break;
            } else {
                System.out.println("Подумай ещё");

            }
        }

    }

}



