import java.util.Arrays;
import java.util.Random;

//Число, чаще всего встречающееся в массиве
//Определить, какое число в массиве встречается чаще всего.
public class Massiv_10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        int[] array2 = new int[10];
        int x = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(10 + 5) - 5;
           //

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array));
    }
}















