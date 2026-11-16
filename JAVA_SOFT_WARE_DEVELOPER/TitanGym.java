package JAVA_SOFT_WARE_DEVELOPER;
import java.util.Scanner;

class Logica_Interna {
     static Scanner usuarioo= new Scanner(System.in);

    public static String [] nuevos_clientes(){
        String []nuevos_clientes= new String[2];
        int meses=0;
        String name;

        System.out.println("Ingrese su nombre ");
         name = usuarioo.nextLine();

        do{
        System.out.println("Dime cuantos meses ");
         meses=usuarioo.nextInt();
        }while(meses<=0);

        usuarioo.nextLine();
        nuevos_clientes[0]=name;
        nuevos_clientes[1]=String.valueOf(meses);

        return nuevos_clientes;
    }

    private String name;
    private int meses=0;

    public Logica_Interna(String name, int meses){
        this.name=name;
        this.meses=meses;

    }
    public void setEdad(String name){
        this.name=name;

    }
    public void setMeses(int meses){
        this.meses=meses;

    }
    public String getname(){
        return this.name;
    }
    public int getMeses(){
        return this.meses;
    }
}
//MAINNNNNN-------------
public class TitanGym {
    public static void main(String[] args) {
         Scanner usuario= new Scanner(System.in);
         String Renovacion;
         int cantidad_meses=0;
         Logica_Interna cliente = new Logica_Interna("Lucas",0);
         Logica_Interna cliente1 = null;
         
         String eres_cliente;
         String cliente_name;
         String nuevos_clientes_inscripcion;
         String [] cahacar_arrayy= new String[2];
         String confirmacion_datos;

         System.out.println("Hola eres cliente ");
         eres_cliente=usuario.nextLine();

            if (eres_cliente.equalsIgnoreCase("si")){

                System.out.println("Dime tu nombre ");
                cliente_name=usuario.nextLine();
                if (cliente_name.equalsIgnoreCase(cliente.getname())){
                    System.out.println("Si eres cliente ");

                    System.out.println(cliente.getname()+ cliente.getMeses());

                    if (cliente.getMeses()<=0){
                       System.out.println("Hola quiere renovar ");
                       Renovacion=usuario.nextLine();
           
                      if( Renovacion.equalsIgnoreCase("si")){
                       do{
                       System.out.println("Digame cuantos meses ");
                       cantidad_meses=usuario.nextInt();
                       }while(cantidad_meses<=0);
                       cliente.setMeses(cantidad_meses);
                       System.out.println("Estos son los nuevos meses agregados "+" "+cliente.getMeses()+cliente.getname());

                }
         }
           }
         }else if(eres_cliente.equalsIgnoreCase("no")){
            System.out.println("Quieres inscribisrte ?");
            nuevos_clientes_inscripcion=usuario.nextLine();
            if(nuevos_clientes_inscripcion.equalsIgnoreCase("si")){
                
                cahacar_arrayy=Logica_Interna.nuevos_clientes();
                System.out.println("Confimameme qu este es tu nombre " + " "+cahacar_arrayy[0]);
                System.out.println("Confirmame que estos son o smeses "+" "+cahacar_arrayy[1]);

                confirmacion_datos=usuario.nextLine();
                if ( confirmacion_datos.equalsIgnoreCase("SI")) {

                    
                    cliente1 = new Logica_Interna(cahacar_arrayy[0], Integer.parseInt(cahacar_arrayy[1]));

                    System.out.println("Asi quedo y ya esta en la bases de datos"+" "+cliente1.getname()+" "+ cliente1.getMeses());   
                }

            }
         
         }
        
    }
}
