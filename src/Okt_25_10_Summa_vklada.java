import java.util.Scanner;

public class Okt_25_10_Summa_vklada {
    // Вывести на экран все положительные делители введенного пользователем числа
    public static void main(String[] args) {
        System.out.println("Введите сумму вклада ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Введите количество месяцев ");
        Scanner sc1 = new Scanner(System.in);
        int y = sc1.nextInt();
        int  a;
        int b;

        double finalAmount = x;


        for (a = 0; a < y; a++) {
          finalAmount *= 1.07;
            }
        System.out.println(finalAmount);
            }

        }







