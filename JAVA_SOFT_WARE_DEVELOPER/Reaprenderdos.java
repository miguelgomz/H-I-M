package JAVA_SOFT_WARE_DEVELOPER;

import java.util.Scanner;

public class Reaprenderdos {
    public static void main(String[] args) {
        Scanner usuario= new Scanner(System.in);

        int intentos=0;
        int pin;

        do{

            
            System.out.println("Ingrese el pin ");
             pin=usuario.nextInt();

            intentos ++;

        }while (pin!=4321 && intentos <3);

        if(pin ==4321){
            System.out.println("Acceso concedido ");
        }else{
            System.out.println("Acceso negado ");
        }

    }
}
