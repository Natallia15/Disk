import java.util.Scanner;

public class Okt_20_2_switch {
    public static void main(String[] args) {
        System.out.println("введи число");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
                       switch (x){
                   case 1:
                       System.out.println(1);
                       break;
                   case 2:
                       System.out.println (2);
                       break;
                   case 3:
                       System.out.println (3);
                       break;
                   case 4:
                       System.out.println (4);
                       break;
                   case 5:
                       System.out.println (5);
                       break;
                   default:
                       System.out.println("неправильное число");

            }

        }

    }


