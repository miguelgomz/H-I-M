package JAVA_SOFT_WARE_DEVELOPER;
import java.util.Scanner;

public class Reaprenderuno {
    public static void main(String[] args) {
    Scanner usuario= new Scanner(System.in);
  
  int ticket;
  int age;
  String day;


  System.out.println("Hola por favor diagame que dia es ");
  day = usuario.nextLine();

  if (day.equalsIgnoreCase("Miercoles")){
    ticket=4;
    System.out.println("Tu entrada cuesta "+ ticket);
  }else{
    System.out.println("Hola por favor ingrese su edad ");
    age = usuario.nextInt();

  if(age<12){
    ticket= 5;
    System.out.println("Tu entrada cuesta "+ ticket);
  }else if (age>12&& age <65){
    ticket=10;
    System.out.println("Tu entrada cuesta "+ ticket);
  }else{
    ticket =6;
    System.out.println("Tu entrada cuesta "+ ticket);
   
  }
}

}
}