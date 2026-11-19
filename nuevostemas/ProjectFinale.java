package nuevostemas;
import java.util.Scanner;

 class Logica_Interna{
    static Scanner usuarioo = new Scanner(System.in);
    public static String[] Datos_objeto_carrtio(){
        String [] array_carrito_fuera = new String[2];
       
        String name;
        double price;
        do{
        System.out.println("Hola favor de decirme el nombre de tu objeto ");
        name=usuarioo.nextLine();
        }while(name.trim().isEmpty());

            array_carrito_fuera[0]=name;
            do {
            System.out.println("Hola favor de decirme el precio de tu objeto ");
            price=usuarioo.nextDouble();

            usuarioo.nextLine();

            array_carrito_fuera[1]=String.valueOf(price);
            }while(price<=0);
        
        return array_carrito_fuera;
    }
    private String Name;
    private String Precio;

    ///////Constructor ///////
    public Logica_Interna(String Name, String Precio ) {
        this.Name=Name;
        this.Precio=Precio;

    }
    //Setters 
    public void setName(String Name){
        this.Name=Name;
    }
    public void setPrecio(String Precio ){
        this.Precio=Precio;
    }
    //Getters 
    public String getName( ){
        return this.Name;
    }
    public String getPrecio(){
        return this.Precio;
    }
    
   

    }
 
public class ProjectFinale {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        String [] cachar_array_carrito_fuera = new String[2];
        Logica_Interna [] array_carrito_fuera_completo= new Logica_Interna[10];
        String Exit;
        String Exitt;
        String Dar_inicio;
        int indice=0;

        String Iniciar_Buscar_producto;
        String nombre_Buscar_producto;
        int contador_para_encotrar_objeto=0;
        String inicar_compra;
        String Guardar_valor_para_conversion;
        double []Guarda_la_cconversion_double=new double[15];
        int indice_carrito=0;
        double sumar_losvalores_del_carrtio=0;

        double Dinero_cliente=0;
        double Dinero_cliente2=0;
        double total_compra=0;
        double unidades=0;
   


        System.out.println("Comenzamos ");
        Dar_inicio=usuario.nextLine();
        if ( Dar_inicio.equalsIgnoreCase("Si")){
            
            //Este do no sayuda a re petir el codigo hasta que llenemos el array de objetos 
            do{
        //////AQUI ATRAPAMOS EL ARRAY DE LA CLAS EXTERAN EN NUESTTRO ARRAY INTERNO///
        cachar_array_carrito_fuera=Logica_Interna.Datos_objeto_carrtio();
        //Este sout solo esta para que veas que tiene dentro del array qu elo atrapa
        //System.out.println("Mira esto esta en tu array"+cachar_array_carrito_fuera[0]+" "+cachar_array_carrito_fuera[1]);
        
        //Aqui le metemos los datos al constructor y lo sguardamos en un array ///
        array_carrito_fuera_completo[indice]=new Logica_Interna(cachar_array_carrito_fuera[0],cachar_array_carrito_fuera[1]);
        indice++;

        System.out.println("Quieres seguri si si pulsa enter, si no escribe exit  ?");
        Exit=usuario.nextLine();
        if (Exit.equalsIgnoreCase("Exit")){
            break;
        }
            }while(indice<array_carrito_fuera_completo.length);
        }
        //Este do es la poya es la que nos repite todo esto 
        do{
        System.out.println("Productos"+" "+"@ Producto"+" "+"$ Precio");
    
        for (int i = 0; i <indice; i++) {
        System.out.println("num"+"-"+i+" "+array_carrito_fuera_completo[i].getName()+" - "+ array_carrito_fuera_completo[i].getPrecio());
        }

         //Aqui se inicia el buscador para nuestro producto por el num
        System.out.println("Buscas algun producto si si escribe SI , si NO solo pusla enter  ");
        Iniciar_Buscar_producto=usuario.nextLine();
        if (Iniciar_Buscar_producto.equalsIgnoreCase("SI")){

            //Aqui hacer el buscador para nuestro producto por el num
            System.out.println("Dimem el nombre de tu producto ");
            nombre_Buscar_producto=usuario.nextLine();
            //Se pone paar que en cada bucle el contador baje a un numero inacesible
            //Osea se pone para que no se traba entre cada iteracion
            contador_para_encotrar_objeto = -1;
            
            for (int i = 0; i < indice; i++) {
                if(nombre_Buscar_producto.equalsIgnoreCase(array_carrito_fuera_completo[i].getName())){
                    contador_para_encotrar_objeto=i;
                    break;
                
                }
            
        }
             if (contador_para_encotrar_objeto != -1) {
             System.out.println("Encotramos tu producto "+ array_carrito_fuera_completo[contador_para_encotrar_objeto].getName()+" "+ " - "+ array_carrito_fuera_completo[contador_para_encotrar_objeto].getPrecio());
             System.out.println("Quieres meterlo a tu carrtio  ");
             inicar_compra=usuario.nextLine();

        if(inicar_compra.equalsIgnoreCase("SI")){
            System.out.println("Okey mira tu producto es"+array_carrito_fuera_completo[contador_para_encotrar_objeto].getName());
            System.out.println("Cunatas unidades quiere llevar ");
            unidades=usuario.nextDouble();
            if(unidades>0){
                
               
                Guardar_valor_para_conversion=array_carrito_fuera_completo[contador_para_encotrar_objeto].getPrecio();
                Guarda_la_cconversion_double[indice_carrito]=Double.parseDouble(Guardar_valor_para_conversion);

                Guarda_la_cconversion_double[indice_carrito]= unidades*Guarda_la_cconversion_double[indice_carrito];
                indice_carrito++;
            
           
            }else if (unidades==1){
                Guardar_valor_para_conversion=array_carrito_fuera_completo[contador_para_encotrar_objeto].getPrecio();
                Guarda_la_cconversion_double[indice_carrito]=Double.parseDouble(Guardar_valor_para_conversion);
                indice_carrito++;

            }else{
                System.out.println("SE  uiere llevar cero o no puso nada por favor ingrese un dato real  ");
                do { 
                    System.out.println("Dime un valor real ");
                    unidades=usuario.nextDouble();

                    if(unidades>0){
                            
                       
                        Guardar_valor_para_conversion=array_carrito_fuera_completo[contador_para_encotrar_objeto].getPrecio();
                        Guarda_la_cconversion_double[indice_carrito]=Double.parseDouble(Guardar_valor_para_conversion);
        
                        Guarda_la_cconversion_double[indice_carrito]= unidades*Guarda_la_cconversion_double[indice_carrito];
                        indice_carrito++;
                    
                   
                    }else if (unidades==1){
                        Guardar_valor_para_conversion=array_carrito_fuera_completo[contador_para_encotrar_objeto].getPrecio();
                        Guarda_la_cconversion_double[indice_carrito]=Double.parseDouble(Guardar_valor_para_conversion);
                        indice_carrito++;
        
                    }
                } while (unidades<=0);
            }
        }else{
            System.out.println("Ese item no esta");
            System.out.println("Oye esto continua amenos de que quieras salir escribe COMPLETE para pasar a la compra o escribe exti para salir de todo");
            Exitt=usuario.nextLine();
            if (Exitt.equalsIgnoreCase("complete")){
                break;
        }
        else if ( Exitt.equalsIgnoreCase("Exit")){
            System.exit(0);

        }
        }
    }while(true);
    
        ///Aqui sumamos el total de la compra
            for (int i = 0; i < indice_carrito; i++) {
                sumar_losvalores_del_carrtio=Guarda_la_cconversion_double[i]+sumar_losvalores_del_carrtio;
            }
            
            System.out.println("Entonces su total es  "+" "+ sumar_losvalores_del_carrtio+" "+" pague");

            System.out.println("Ingrese su dinero ");
            Dinero_cliente=usuario.nextDouble();
            usuario.nextLine();
            total_compra= sumar_losvalores_del_carrtio-Dinero_cliente;

            if (total_compra==0) {
                System.out.println("Muchas gracias no hay cambio hasta la Proxima  ");
                
            }else if (total_compra>0){
                do{
                System.out.println("Falta por abonar "+" "+total_compra);
                System.out.println("Ingrese el faltante ");
                Dinero_cliente2=usuario.nextDouble();
                usuario.nextLine();
    
                total_compra=total_compra-Dinero_cliente2;
                if (total_compra<0){
                    System.out.println("Nos dio dinero de mas este es su cmabio "+" "+(total_compra*-1));
                }else if (total_compra==0){
                    System.out.println("Cuenta saldada y no hay cambio ");
                }   
                }while(total_compra>0);

            }else if (total_compra<0){
                System.out.println("Nos dio dinero de mas este es su cmabio "+" "+(total_compra*-1));
            }
        } 
     }
    
    
    }
}
