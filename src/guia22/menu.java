
package guia22;

import java.util.Scanner;


public class menu {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int sel;
    do {
      System.out.println("Que ejercicio desea realizar:");
      System.out.println("Punto 1. Calculadora");
      System.out.println("Punto 2. Ordenamiento");
      System.out.println("Punto 3. Persona Interfaz");
      System.out.println("Punto 4. Salir");  
      sel=teclado.nextInt();
      
      switch (sel){
          case 1 -> {
               Punto1 punto1 = new Punto1();
               punto1.Ppunto1();
          }
        
          case 2 -> {
               Punto2 punto2 = new Punto2();
               punto2.Ppunto2();
          }
          case 3 -> {
              Punto3 punto3=new Punto3();
              punto3.setVisible(true);
          }
          
          case 4 -> sel=4;
         
      }
        
    } while (sel != 4);

}
}