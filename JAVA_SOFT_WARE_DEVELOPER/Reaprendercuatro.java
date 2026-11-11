package JAVA_SOFT_WARE_DEVELOPER;
import java.util.Scanner;

 class Gym {

double mensaulidad_original=150;
double edad;

    public double caso_base(double edad){
        
       double mensaulidad=this.mensaulidad_original;
        this.edad=edad;

        if(edad<18){
            mensaulidad=mensaulidad*.80;
            
            return mensaulidad;
            
        }
        else if(edad>=60){
            mensaulidad=mensaulidad*.70;
            return mensaulidad;
            
        }else{
            return mensaulidad;
        }
    }
}


public class Reaprendercuatro {
    public static void main(String[] args) {
         Scanner usuario= new Scanner(System.in);
         Gym cliente= new Gym();
         double dato;

         System.out.println("Hola dime tu edad para saber cuanto vas a pagar ");
         dato=usuario.nextDouble();
         cliente.caso_base(dato);
         double res= cliente.caso_base(dato);
         double precio_total;
         System.out.println("Total a pagar "+res );



         

    }
}
