package JAVA_SOFT_WARE_DEVELOPER;
import java.util.Scanner;

public class Reaprendertres {

public static void main(String[] args) {

    Scanner usuario= new Scanner(System.in);
    String email;
    String arroba= "@";
    String com ="com";
  

    

    System.out.println("Ingrese su correo ");
    email=usuario.nextLine();
  email = email.replaceAll(" ", "");

   String agregados= email+arroba+com;
   System.out.println(agregados);
    

   
}
}