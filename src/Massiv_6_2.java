import java.util.Arrays;
import java.util.Random;

//    Сдвинуть элементы массива в указанном направлении (влево или вправо) и на указанное число шагов.
// Освободившиеся ячейки заполнить нулями. Выводить массив после каждого шага.
public class Massiv_6_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        int max = array[0];
        int min = array[0];

        int b;

        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(10 + 5) - 5;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int s = 0; s < 5; s++) {
            for (int a = array.length - 1; a > 0; a--) {
                array[a] = array[a - 1];
            }
            array[s] = 0;
            System.out.println(Arrays.toString(array));
        }

        }
    }









