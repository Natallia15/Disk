import java.util.Arrays;
import java.util.Random;

//    В массиве случайных целых чисел поменять местами минимальный и максимальный элементы.
public class Massiv_5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        int max = array[0];
        int min = array[0];
        int indMin = 0;
        int indMax = 0;

        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(10 + 5) - 5;
            System.out.print(array[i] + " ");
            if (array[i] > max) {
                max = array[i];
                indMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indMin = i;
            }

        }
        int nov = array[indMax];
        array[indMax] = array[indMin];
        array[indMin] = nov;

        System.out.println("  ");
        System.out.println("Максимальное число : " + max + " " + "с индексом " + indMax);
        System.out.println("Минимальное число : " + min + " " + "с индексом " + indMin);
        System.out.println("Новый массив" + Arrays.toString(array));
    }

}
