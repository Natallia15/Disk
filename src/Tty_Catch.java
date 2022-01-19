import java.io.IOException;

public class Tty_Catch {

/*
        public static void myMethodWhichThrowsException() throws IOException{
            System.out.println("My operations");
        }

        public static void main(String[] args) {
            try {
                Tty_Catch.myMethodWhichThrowsException();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.exit(0);
                System.out.println("Finally code");
            }

        }*/

    public static void myMethodWhichThrowsException() throws MyOwnExeption {
        System.out.println("My operations");}
    public static void main (String [] args) {
        try {
            Tty_Catch.myMethodWhichThrowsException();
        } catch (MyOwnExeption e) {
            e.printStackTrace();
        }
    }

        }



