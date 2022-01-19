public class Okt_25_5_Fibonachi {
    // вывести на экран первые 11 членов последовательности Фибоначи 1 1 2 3 5 8 13 21 34 55 89
    public static void main(String[] args) {

        int n0 = 1;
        int n1 = 1;
        int n2, a;
        System.out.print(n0+"  "+n1+ "  ");
        for (a = 1; a < 10; a++) {
            n2 = n0 + n1;
            System.out.print(n2 + "  ");
                        n0=n1;
                        n1=n2;
        }

    }

}



