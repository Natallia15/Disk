import java.util.Scanner;

public class Okt_25_7_Factorial {
    // Факториал введенного пользователем числа
    public static void main(String[] args) {
        System.out.println("Введите число");


        int  a;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (a = 1; a <= x; a++) {
            b=b*a;

            }
        System.out.println(b);
        }

    }





