package nuevostemas;
import java.util.Scanner;

class NombreUsuarioInvalidoException extends Exception{
    public NombreUsuarioInvalidoException(String mensaje ){
        super(mensaje);
    }

}
class Logica {
     public void Validad (String Apodo )throws NombreUsuarioInvalidoException{
        if(Apodo == null || Apodo.trim().isEmpty()){
            throw new NombreUsuarioInvalidoException("No pusiste nada nigger ");
        }else if (Apodo.trim().length() < 4){
            throw new NombreUsuarioInvalidoException("No puede ser menor de 4 bitch ");
        }
        System.out.println("Okey nombre valido ");

    }

}

public class Practhroow {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        String name;
        Logica objeto = new Logica ();

        try{
        System.out.println("Hola perro ya te la sabestruz dime your name");
        name=usuario.nextLine();
        objeto.Validad(name);
        }catch(NombreUsuarioInvalidoException e ){
            
            System.out.println("Hola perro al chile esa madre etsaba incoprrecat ");
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Voy a limpiar y cerrar");
            usuario.close();
        }

        }

    }

