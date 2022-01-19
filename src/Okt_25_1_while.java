import java.util.Scanner;

public class Okt_25_1_while {
   // программа, где пользователь вводит любое целое положительное число, апрограмма суммирует от 1 до введенного пользователем числа.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
                int x = sc.nextInt();
        int i=1;
        int sum=0;
        while (i <= x) {
            sum= sum+i;
            i=i+1;
        }

            System.out.println(sum);}

}



