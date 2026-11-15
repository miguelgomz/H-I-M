package JAVA_SOFT_WARE_DEVELOPER;
import java.util.Scanner;


//Imprime tu matric
class Matrices {
    int [][] array =new int [2][3];

    public void matric(){
    for(int i=0;i <2;i++){
     for(int j=0;j<3;j++){
        System.out.print(array[i][j]+ "  ");
     }
    System.out.println();
    }

    
}

////Imprime el valor 
public void matricc(int file , int columne){
    Scanner usuario= new Scanner(System.in);
    if (file >=2 && columne>=3){
        System.out.println("Valor no existe ");
        System.out.println("Hola e que lugar te gustaria sentarte  fila ");
        file=usuario.nextInt();
        System.out.println("Hola e que lugar te gustaria sentarte  columna ");
         columne=usuario.nextInt();
         array[file][columne]=1;
    }else if (array[file][columne]!=0) {
        System.out.println("Asiento ocupado ");
        System.out.println("Hola e que lugar te gustaria sentarte  fila ");
        file=usuario.nextInt();
        System.out.println("Hola e que lugar te gustaria sentarte  columna ");
         columne=usuario.nextInt();
         array[file][columne]=1;
    }else {
            array[file][columne]=1;
    }
  }
}


public class Matricesbidirecionales {
public static void main(String[] args) {
Scanner usuario= new Scanner(System.in);
Matrices cliente = new Matrices();
int [][] asiento = new int [2][3];
System.out.println("Estos son los asientos");
cliente.matric();

System.out.println("Hola e que lugar te gustaria sentarte  fila ");
int file=usuario.nextInt();
usuario.nextLine();
System.out.println("Hola e que lugar te gustaria sentarte  columna ");
int columne=usuario.nextInt();
cliente.matricc(file , columne);
System.out.println("Ahi es tu nuevo valor ");
cliente.matric();
}
}


