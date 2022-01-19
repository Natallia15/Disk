import java.util.Arrays;
import java.util.Random;

//Сумма четных положительных элементов массива
//В массиве, содержащем положительные и отрицательные целые числа, вычислить сумму четных положительных элементов
public class Massiv_9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        int s=0;
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(10 + 5) - 5;
            if ( array[i] > 0){
                if (array[i]%2==0){
                    s = s+array[i];
                }
            }

                    }

        System.out.println(Arrays.toString(array));
        System.out.println("сумма чётных положительных чисел =  "+s);

                }
            }















