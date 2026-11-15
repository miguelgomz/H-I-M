package JAVA_SOFT_WARE_DEVELOPER;

import java.util.Scanner;

class Logica { 

    String  [] array = new String[10];
    int contador=0;
    public void letras(String leetras, int contador  ){
        if (contador==array.length){
            int contadorr=contador*2;

            String []nuevoArray= new String[contadorr];
            for (int i = 0; i < array.length; i++) {
                array[i]=nuevoArray[i];
                
            }
        }

       for (int i = 0; i < 10; i++) {
           
      array[i]= (leetras);
       }
        
    }
 }
public class Carrito {
    public static void main(String[] args) {
        Logica cliente = new Logica();
        Scanner usuario= new Scanner(System.in);
        String letrass;
        int contador=0;
    
       // cliente.letras();
       do {
        System.out.println("Por favor digame los elementos de su carrito ");
        letrass=usuario.nextLine();

        contador++;
        cliente.letras(letrass, contador);
       }while(!letrass.equalsIgnoreCase("Para"));


    }
    
}
