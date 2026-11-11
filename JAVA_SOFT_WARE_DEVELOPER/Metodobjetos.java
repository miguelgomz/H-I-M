package JAVA_SOFT_WARE_DEVELOPER;
import java.util.Scanner;

 class Logica {
    double num_noches;
    int precioxnoche=20;
    double desayuno=10;

    public  void nochesxtotal(double noche ){
        this.num_noches=noche;
        double  total= noche*this.precioxnoche;
        
        if (noche >7){
            total= total*0.85;
           System.out.println("Te quedas mas de 7 noches tiene sun duescuento  "+ total);

        
    }else{
        System.out.println("Tu total es de y no tiene descuento "+ total);
    }
    }

    public void Extras(double noches){
        this.num_noches=noches;
        double total_extras=this.desayuno*noches;
        System.out.println("Este es el totla de los desyunos"+ total_extras);
    }
}

public class Metodobjetos{
    public static void main(String[] args) {
        Scanner usuario= new Scanner(System.in);

     double noches;
     String Si_desayuno;
    Logica cliente = new Logica ();

        System.out.println("Cuantas noches te vas a quedar? ");
        noches=usuario.nextDouble();
        usuario.nextLine();
        System.out.println("Vas a quere desyauno ?");
        Si_desayuno=usuario.nextLine();
        
        cliente.nochesxtotal(noches);
        if (Si_desayuno.equalsIgnoreCase("Si")){
            cliente.Extras(noches);
        }
    

    }
}
 

