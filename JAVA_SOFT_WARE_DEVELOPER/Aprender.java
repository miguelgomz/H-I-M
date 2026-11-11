package JAVA_SOFT_WARE_DEVELOPER;
import java.util.Scanner;

class Logica{

    public int Metodo(int[] suma, int longitud ){
       

        int mayor=suma[0];

        for (int i = 0; i < longitud; i++) {
            if(mayor<suma[i]){
                mayor =suma[i];
            }
        }
        return mayor;

        
        
        
    }

}


public class Aprender {
public static void main(String[] args) {
Scanner usuario= new Scanner(System.in);
Logica cliente = new Logica();

System.out.println("Ingresas cuantas ventas hiciste ");
int longitud=usuario.nextInt();
int[] lista =new int[longitud];


System.out.println("Ingresa de favor los valores de tu ary");
for(int i=0;i <longitud;i++){

    lista[i]=usuario.nextInt();
}


int mayor = cliente.Metodo(lista, longitud);

System.out.println("Venta mas alta " + mayor);
}

}
