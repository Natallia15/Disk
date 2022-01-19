import java.util.Arrays;
import java.util.Random;

//Реверс массива
//Переставить элементы заданного массива в обратном порядке, то есть произвести реверс массива.
public class Massiv_8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        int[] array2= new int [10];

        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(10 + 5) - 5;
             //array2 [i] = array[(array.length-1)-i];
                    }
        for (int u = 0; u < 10; u++) {
            array2 [u] = array[(array.length-1)-u];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

                }
            }















