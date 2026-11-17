package nuevostemas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraSeguro {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        double edad;
        double año=2026;

        try {
            System.out.println("Hola dime por favor tu edad ");
            edad=usuario.nextDouble();
            double total=año-edad;
            System.out.println(total);


        } catch (InputMismatchException e) {
            System.out.println("Oye metlo ene numeros por fa ");
        }

    }
}



//InputMismatchException
//ArithmeticException
//ArrayIndexOutOfBoundsException
//NullPointerException
//NumberFormatException