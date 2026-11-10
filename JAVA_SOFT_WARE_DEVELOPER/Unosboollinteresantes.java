
package JAVA_SOFT_WARE_DEVELOPER;

import java.util.Scanner;

public class Unosboollinteresantes {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Ingrese su correo: ");
        String email = usuario.nextLine();

        // 1. Regla: No debe contener espacios en blanco
        boolean tieneEspacios = email.contains(" ");

        // 2. Regla: Debe contener '@'
        boolean tieneArroba = email.contains("@");

        // 3. Regla: Debe terminar en '.com'
        boolean terminaEnCom = email.endsWith(".com");

        // Evaluamos que se cumplan las 3 reglas al mismo tiempo
        if (!tieneEspacios && tieneArroba && terminaEnCom) {
            System.out.println("Correo válido registrado exitosamente.");
        } else {
            System.out.println("Error: El correo no tiene un formato válido.");
        }

        usuario.close();
    }
}