package JAVA_SOFT_WARE_DEVELOPER;
import java.util.Scanner;

class Logica_Interna {
    static Scanner usuarioo = new Scanner(System.in);

    public static String[] nuevos_clientes() {
        String[] nuevos_clientes = new String[2];
        int meses = 0;
        String name;

        System.out.println("Ingrese su nombre ");
        name = usuarioo.nextLine();

        do {
            System.out.println("Dime cuantos meses ");
            meses = usuarioo.nextInt();
        } while (meses <= 0);

        usuarioo.nextLine();
        nuevos_clientes[0] = name;
        nuevos_clientes[1] = String.valueOf(meses);

        return nuevos_clientes;
    }

    private String name;
    private int meses = 0;

    public Logica_Interna(String name, int meses) {
        this.name = name;
        this.meses = meses;
    }

    public void setEdad(String name) {
        this.name = name;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public String getname() {
        return this.name;
    }

    public int getMeses() {
        return this.meses;
    }
}

// MAINNNNNN-------------
public class TitanGym {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        Logica_Interna[] clientes = new Logica_Interna[10];

        String Renovacion;
        int cantidad_meses = 0;
        Logica_Interna cliente = new Logica_Interna("Lucas", 0);
        Logica_Interna cliente3 = new Logica_Interna("Inar", 2);

        // Array de clientes
        clientes[0] = cliente;
        clientes[1] = cliente3;
        int indeice = 2;
        int indice_actual = -1;

        String eres_cliente;
        String cliente_name;
        String nuevos_clientes_inscripcion;
        String[] cahacar_arrayy = new String[2];

        System.out.println("Hola eres cliente ");
        eres_cliente = usuario.nextLine();

        if (eres_cliente.equalsIgnoreCase("si")) {

            System.out.println("Dime tu nombre ");
            cliente_name = usuario.nextLine();

            for (int i = 0; i < indeice; i++) {
                if (cliente_name.equalsIgnoreCase(clientes[i].getname())) {
                    System.out.println("Mira si te encotramos " + clientes[i].getname() + " " + clientes[i].getMeses());
                    indice_actual = i;
                    break;
                }
            }

            if (indice_actual != -1) {
                if (clientes[indice_actual].getMeses() >= 0) {
                    System.out.println("Quieres pagar tu mensualidad ??");
                    Renovacion = usuario.nextLine();
                    if (Renovacion.equalsIgnoreCase("Si")) {
                        System.out.println("Cuantos meses deseas pagar ");
                        cantidad_meses = usuario.nextInt();
                        if (cantidad_meses <= 0) {
                            do {
                                System.out.println("Cuantos meses deseas pagar ");
                                cantidad_meses = usuario.nextInt();
                            } while (cantidad_meses <= 0);
                            usuario.nextLine();

                            clientes[indice_actual].setMeses(cantidad_meses);
                            System.out.println("Okey entoces se te queda asi " + clientes[indice_actual].getname() + " " + clientes[indice_actual].getMeses());
                        } else {
                            usuario.nextLine();
                            clientes[indice_actual].setMeses(cantidad_meses);
                            System.out.println("Okey entoces se te queda asi " + clientes[indice_actual].getname() + " " + clientes[indice_actual].getMeses());
                        }
                    }
                }
            } else {
                System.out.println("Nombre invalido, no estas registrado.");
            }

        /// En caso de no ser cliente
        } else if (eres_cliente.equalsIgnoreCase("no")) {
            System.out.println("Quieres inscribisrte ?");
            nuevos_clientes_inscripcion = usuario.nextLine();
            if (nuevos_clientes_inscripcion.equalsIgnoreCase("si")) {

                cahacar_arrayy = Logica_Interna.nuevos_clientes();
                clientes[indeice] = new Logica_Interna(cahacar_arrayy[0], Integer.parseInt(cahacar_arrayy[1]));
                indeice++;
                System.out.println("Estos si son tus datos " + " " + clientes[indeice - 1].getname() + " " + clientes[indeice - 1].getMeses());
            }
        }

        System.out.println("Solo para checra nuestra lista d clientes ");
        for (int i = 0; i < indeice; i++) {
            System.out.println(clientes[i].getname() + " " + clientes[i].getMeses());
        }
    }
}