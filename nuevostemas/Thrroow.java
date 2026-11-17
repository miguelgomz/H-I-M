package nuevostemas;
import java.util.Scanner;

class Logica {
    public void edad(int edad) throws IllegalArgumentException {
        if (edad < 0) {
            throw new IllegalArgumentException("Minche pendejo pon unnumero bien");
        }else if (edad <18){
            throw new IllegalArgumentException("Menor ");

        }
        System.out.println("Eres mayor de edad");
    }
}

public class Thrroow {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        int edd;
        Logica cliente = new Logica();

        try {
            System.out.println("Ingrese edad:");
            edd = usuario.nextInt();
            cliente.edad(edd);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Muestra "Menor de edad"
        } finally {
            System.out.println("Ach ya acabamos, voy a cerrar.");
            usuario.close();
        }
    }
}

//InputMismatchException   este dato disinto 
//ArithmeticException      dividir cero 
//ArrayIndexOutOfBoundsException    un anum qu no esta dentro del array 
//NullPointerException apunta a algo null 
//NumberFormatException     
//IllegalArgumentException    falla la logica 