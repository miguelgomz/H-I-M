package JAVA_SOFT_WARE_DEVELOPER;
import java.util.Scanner;

//class Logica {}

public class Reaprendercinco {
    public static void main(String[] args) {
        Scanner usuario= new Scanner(System.in);


       

        System.out.println("Ingresa de favor la longitud de tu lista ");
        int longitud=usuario.nextInt();
        int[] lista= new int[longitud];

        int suma=0;
        System.out.println("Ingresa de favor los valores de tu ary");
        for(int i=0;i <longitud;i++){

            lista[i]=usuario.nextInt();
        }
        for(int i=0;i <longitud;i++){
        suma += lista[i];
        }
        System.out.println("Estos son lo svalore sde tu array estas la suma de tu array "+ suma);

        

    }
}


