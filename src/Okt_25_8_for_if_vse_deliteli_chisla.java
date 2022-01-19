import java.util.Scanner;

public class Okt_25_8_for_if_vse_deliteli_chisla {
    // Вывести на экран все положительные делители введенного пользователем числа
    public static void main(String[] args) {
        System.out.println("Введите число");


        int  a;
        int b;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (a = 1; a <= x; a++) {
            if (x%a==0) {
                System.out.println(a);
            }

            }

        }

    }





