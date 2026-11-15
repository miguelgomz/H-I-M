package JAVA_SOFT_WARE_DEVELOPER;
import java.util.Scanner;

class Logica { 

    String  [] array = new String[10];
    
    public String [] letras(String leetras, int contador  ){
        if (contador==array.length){
            int contadorr=contador*2;

            String []nuevoArray= new String[contadorr];
            for (int i = 0; i < array.length; i++) {
                nuevoArray[i]=array[i];
                
            }
            array=nuevoArray;
        }
       
           
      array[contador]= (leetras);
     
      
      return array;
    }
 }
public class Carrito {
    public static void main(String[] args) {
        Logica cliente = new Logica();
        Scanner usuario= new Scanner(System.in);
        String letrass;
        int contador=0;
        String []Cachararray= null;
    
       do {
        System.out.println("Por favor digame los elementos de su carrito ");
        letrass=usuario.nextLine();

        cliente.letras(letrass, contador);
        contador++;

       }while(!letrass.equalsIgnoreCase("Para"));

       Cachararray= cliente.letras(letrass, contador);

       if(Cachararray!=null){

         System.out.println("Los elementos de su carrito ");
         int sin_para= contador-1;

        for (int i = 0; i < sin_para; i++) {
           
            System.out.print(Cachararray[i] + ",");
        
            
        }
       }

    }
    
}
