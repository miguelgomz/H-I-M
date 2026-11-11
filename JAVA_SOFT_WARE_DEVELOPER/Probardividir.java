package JAVA_SOFT_WARE_DEVELOPER;

import java.util.Scanner;

public class Probardividir {
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

