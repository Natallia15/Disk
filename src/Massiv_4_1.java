import java.util.Arrays;
import java.util.Random;
//Найти наибольший элемент и его порядковый номер в массиве
//Заполнить одномерный массив случайными числами. Найти и вывести на экран наибольший его элемент и порядковый номер этого элемента.
public class Massiv_4 {
    public static void main (String[] args) {
        Random rand = new Random();
        int[] array= new int[10];
       int max=array[0];
int ind = 0;
        for (int i = 0; i<10; i++) {
            array[i]=rand.nextInt(10+5)-5;
            if (array[i]>max){
                max=array[i];
               ind = i;
            }

        }
        System.out.print(Arrays.toString(array));
        System.out.println("  ");
        System.out.println("Максимальное число - " +max+" "+"с индексом " +ind);
    }

}
