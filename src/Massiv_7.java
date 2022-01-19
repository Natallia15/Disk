import java.util.Arrays;
import java.util.Random;

//В массиве найти элементы, которые в нем встречаются
// только один раз, и вывести их на экран. То есть найти и вывести уникальные элементы массива.
public class Massiv_7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        int[] array1 = new int[10];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = rand.nextInt(10 + 5) - 5;
            for (int p = i + 1; p < array.length; p++) {
                if (array[i] != array[p]) {

                }

            }
        }
        System.out.println(Arrays.toString(array));

    }
}



























