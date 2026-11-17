package nuevostemas;
import java.util.Scanner;

public class Finnn {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
       
        String [] array =new String[3];
        int num;
        try {
            System.out.println("Ingrese colores 1 ");
            array[0]=usuario.nextLine();
            System.out.println("Ingrese colores 1 ");
            array[1]=usuario.nextLine();
            System.out.println("Ingrese colores 1 ");
            array[2]=usuario.nextLine();
        System.out.println("Dime que color buscas con un num del 0 al 2");
        num=usuario.nextInt();
   
            System.out.println("Este es el color que buscas "+" " +array[num]);
            
        

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hey la cagaaste ese numero de elemento no lo tenemos ");

        }finally{
            System.out.println("3. Entrando al finally: Limpiando y cerrando el Scanner...");
            usuario.close();
        }
     
}
}