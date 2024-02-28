
package guia22;

import java.util.Scanner;


public class Punto1 {

    public void Ppunto1() {
    
      Scanner teclado = new Scanner(System.in);
        MetCal ord = new MetCal();
        int a , b , c , d; 
        boolean salir = false;
        do {
            System.out.println("\t INGRESE OPERACION QUE DESEA REALIZAR ");
            System.out.println("1.Ingresar Matriz 1");
            System.out.println("2.Ingresar Matriz 2");
            System.out.println("3.Sumar las matrices ");
            System.out.println("4.Multiplicar las matrices");
            System.out.println("5.Multiplicar por escalar ");
            System.out.println("6.Transpuesta de matriz");
            System.out.println("7.Salir");

            int opc = teclado.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("# filas de M1: ");
                    a = teclado.nextInt();
                    ord.f1 = a;
                    System.out.println("# Columnas de M1: ");
                    b = teclado.nextInt();
                    ord.c1 = b;
        
                    ord.m1=new int[a][b]; 
                    System.out.println("Ingrese los " + a * b + " Numeros de M1: ");
                    
                    for(int i = 0; i < a; i++) {
                        for (int j = 0; j <b ; j++) {
                            ord.m1[i][j] = teclado.nextInt();
                        }
                    }
                    
                    System.out.println("M1");
                     for(int i = 0; i < a; i++) {
                        for (int j = 0; j < b; j++) {
                            System.out.print(ord.m1[i][j]+"  ");
                        }
                         System.out.println("");
                    }
                    break;
                }

                case 2 -> {
                     
                    System.out.println("# filas de M2: ");
                    c = teclado.nextInt();
                    ord.f2 =c;

                    System.out.println("# Columnas de M2: ");
                    d = teclado.nextInt();
                    ord.c2 = d; 
                    
                    ord.m2=new int[c][d]; 
                    System.out.println("Ingrese los " + c * d + " Numeros de M2: ");
                    
                    for(int i = 0; i < c; i++) {
                        for (int j = 0; j < d; j++) {
                            ord.m2[i][j] = teclado.nextInt();
                        }
                    }
                    
                    System.out.println("M2");
                     for(int i = 0; i < ord.f2; i++) {
                        for (int j = 0; j < ord.c2; j++) {
                            System.out.print(ord.m2[i][j]+" ");
                        }
                         System.out.println("");
                    }
                    break;
                    
                }

                case 3 -> {
                    if (ord.f1 == ord.f2 && ord.c1 == ord.c2) {
                        System.out.println("\tM1");
                     for(int i = 0; i < ord.f1; i++) {
                        for (int j = 0; j < ord.c1; j++) {
                            System.out.print(ord.m1[i][j]+" ");
                        }
                         System.out.println(" ");
                       }System.out.println("  +  " ); 
                         System.out.println("M2");
                         for(int i = 0; i < ord.f2; i++) {
                            for (int j = 0; j < ord.c2; j++) {
                             System.out.print(ord.m2[i][j]+" ");
                            }   
                         System.out.println(" ");
                         }
                   ord.SumaMat();
                        System.out.println("M1+M2");
                        for (int i = 0; i < ord.f1; i++) {
                            for (int j = 0; j < ord.c2; j++) {
                            System.out.print(ord.rta[i][j]+" ");
                            }
                            System.out.println( );
                        }
                    } else {
                        System.out.println("   No es posible sumar las matrices. Deben tener la misma cantidad de filas y columnas.");
                        System.out.println("   Reajuste las matrices o realice otra Operación.");
                    }
                    break;
                }

                case 4 -> {
                    if (ord.f1 == ord.c2) {
                    ord.ProductoMat();
                    System.out.println("M1 * M2 =");
                    for (int i = 0; i < ord.f1; i++) {
                            for (int j = 0; j < ord.c2; j++) {
                            System.out.print(ord.rta[i][j] + " ");
                            }
                            System.out.println();
                        }
                   }
                    else {
                    System.out.println("No es posible multiplicar las matrices. El número de columnas de la matriz 1 debe ser igual al número de filas de la matriz 2.");
                }
                break;
                }

                case 5 -> { 
                    System.out.println("Ingrese el escalar: ");
                    int escalar=teclado.nextInt(); 
                    int sel=0; 
                    do {  
                        System.out.println("Seleccione opcion para multiplicar x"+escalar+": " );
                        System.out.println("1. Para M1");
                        System.out.println("2. Para M2");
                        System.out.println("3. Ninguna");
                    sel= teclado.nextInt();
                    
                    switch (sel) {
                        case 1->{
                            ord.ProductEsc(escalar,ord.m1);
                            System.out.println("M1*"+escalar);
                            for(int i=0; i<ord.f1; i++){
                                for (int j=0; j<ord.c1; j++){
                                    System.out.print(ord.rta[i][j]+ "  ");
                                }
                                System.out.println(" ");
                            }
                        break; 
                        }  
                        case 2->{
                            ord.ProductEsc(escalar,ord.m2);
                            System.out.println("M2*"+escalar);
                            for(int i=0; i<ord.f2; i++){
                                for (int j=0; j<ord.c2; j++){
                                    System.out.print(ord.rta[i][j]+ "  ");
                                }
                                System.out.println(" ");
                            }
                        break;}
                        default->{
                            break; 
                        }
                    }
                    } while (sel<3);
                    break; 
                }
  
                case 6 -> {
                   
                    int sel;
                    boolean ninguna =false; 
                    do {  
                        System.out.println("Seleccione matriz que desea trasponer: " );
                        System.out.println("1. Matriz 1");
                        System.out.println("2. Matriz 2 ");
                        System.out.println("3. Ninguna");
                        sel=teclado.nextInt(); 
                        
                    switch (sel) {
                        case 1->{
                            
                            System.out.println("M1");
                            for(int i=0; i<ord.f1; i++){
                                for (int j=0; j<ord.c1; j++){
                                    System.out.print(ord.rta[i][j]+ " ");
                                }
                                System.out.println(" ");
                            }
                            ord.Traspuesta(ord.m1);
                            System.out.println("M1 traspuesta"); 
                            for(int i=0; i<ord.f1; i++){
                                for (int j=0; j<ord.c1; j++){
                                    System.out.print(ord.rta[i][j]+ " ");
                                }
                                System.out.println(" ");
                            }
                            
                            
                        break; 
                        }  
                        case 2->{
                            System.out.println("M2 = ");
                            for(int i=0; i<ord.f2; i++){
                                for (int j=0; j<ord.c2; j++){
                                    System.out.print(ord.rta[i][j]+ " ");
                                }System.out.println(" ");
                            }
                            ord.Traspuesta(ord.m2);
                            System.out.println("M2 traspuesta"); 
                            for(int i=0; i<ord.f1; i++){
                                for (int j=0; j<ord.c1; j++){
                                    System.out.print(ord.rta[i][j]+ " ");
                                }
                                System.out.println(" ");
                            }
                        break;}
                        case 3->{
                            ninguna=true; 
                        }
                    }                              
                    } while (!ninguna);
                    break;
                }  
                case 7 -> {
                        salir=true; 
                }
                
                default->System.out.println("Operacion no valida. Por favor, seleccione una operacion valida."); 
            }
        }while(!salir); 
    }
}

