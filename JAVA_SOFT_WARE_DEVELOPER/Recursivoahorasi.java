package JAVA_SOFT_WARE_DEVELOPER;
import java.util.Scanner;

class Logic{
    public void metodo(int recursivo ){

        if (recursivo<=0){
            return;
        }
        System.out.println("Hola");
        metodo(recursivo-1);
    }
}

public class Recursivoahorasi{
public static void main(String[] args) {
Scanner usuario= new Scanner(System.in);
Logic objeto = new Logic();

objeto.metodo(3);

}
}