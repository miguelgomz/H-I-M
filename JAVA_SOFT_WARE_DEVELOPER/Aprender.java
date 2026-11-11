package JAVA_SOFT_WARE_DEVELOPER;
import java.util.Scanner;

class Logica{

    public int Metodo(int[] suma, int longitud ){
        int total=0;

        for (int i = 0; i < longitud; i++) {
            total += suma[i];       
        }
        return total;
        
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

int total=cliente.Metodo(lista, longitud);

System.out.println("Total de las ventas " + total);
}

}
