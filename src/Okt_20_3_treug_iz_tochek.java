import java.util.Scanner;

public class Okt_20_3_treug_iz_tochek {
    public static void main(String[] args) {
        int i;
        int j, n;

        for (i = 1; i<10; i++) {
            for (n = 9; n>0; n--){
                    System.out.print("    ");}
            for (j = 1; j < i+1; j++) {

                System.out.print(".");

            }
            System.out.println();
        }
    }}



