import java.util.Scanner;

public class Okt18_2_if_else_scaner_chetnoe_chislo {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число ");
       int a = scanner.nextInt();
        if (a%2 == 0) {
            System.out.println("Число четное");
            } else {
                System.out.println("Нечетное");
            }

        }

    }


