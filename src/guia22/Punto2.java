
package guia22;

import java.util.Scanner;


public class Punto2 {

      public void Ppunto2() {
      
      Scanner teclado = new Scanner(System.in);
      int sel;
      int tam;
      Ordenamiento Punto2=new Ordenamiento();
      do{
      System.out.println("ORDENAMIENTO DE ARREGLOS");
      System.out.println("Seleccione el arreglo que desea ver el ordenamiento");
      System.out.println("1. 100");
      System.out.println("2. 500");
      System.out.println("3. 1000");
      System.out.println("4. 5000");
      System.out.println("5. 10000");
      System.out.println("6. SALIR");
      sel = teclado.nextInt();
      switch (sel) {
            case 1 -> {
                tam = 100;
                double[] arrays100 = Ordenamiento.arregloRandom(tam);
                long tin100, tfin100;
                tin100 = System.nanoTime();
                Punto2.burbuja(tam,arrays100);
                tfin100 = System.nanoTime();
                System.out.println("BURBUJA: "+ (tfin100 - tin100) + " ns");
                tin100 = System.nanoTime();
                Punto2.insercion(arrays100);
                tfin100 = System.nanoTime();
                System.out.println("INSERCION: " + (tfin100 -tin100) + " ns");
                tin100 = System.nanoTime();
                Punto2.seleccion(arrays100);
                tfin100 = System.nanoTime();
                System.out.println("SELECCION: "+ (tfin100 - tin100) + " ns");
                tin100 = System.nanoTime();
                Punto2.mergesort(arrays100, 0,arrays100.length - 1);
                tin100 = System.nanoTime();
                System.out.println("MERGESOT: "+ (tfin100 - tin100) + " ns");
                System.out.println("El mejor metodo de ordenamiento es: INSERCION ");
              }

            case 2 -> {
                tam = 500;
                double[] arrays500 = Ordenamiento.arregloRandom(tam);
                long tin500, tfin500;
                tin500= System.nanoTime();
                Punto2.burbuja(tam,arrays500);
                tfin500 = System.nanoTime();
                System.out.println("BURBUJA: "+ (tfin500- tin500) + " ns");
                tin500 = System.nanoTime();
                Punto2.insercion(arrays500);
                tfin500 = System.nanoTime();
                System.out.println("INSERCION:" + (tfin500 - tin500) + " ns");
                tin500 = System.nanoTime();
                Punto2.seleccion(arrays500);
                tfin500 = System.nanoTime();
                System.out.println("SELECCION: "+ (tfin500 -tin500) + " ns");
                tin500 = System.nanoTime();
                 Punto2.mergesort(arrays500, 0, arrays500.length - 1);
                tfin500= System.nanoTime();
                System.out.println("MERGESOT "+ (tfin500-tin500) + "ns");
                System.out.println("El mejor metodo de ordenamiento es: INSERCION ");
              }
            case 3 -> {
                tam = 1000;
                double[] arrays1000 = Ordenamiento.arregloRandom(tam);
                long tin1000, tfin1000;
                tin1000 = System.nanoTime();
                Punto2.burbuja(tam,arrays1000);
                tfin1000= System.nanoTime();
                System.out.println("BURBUJA: "+ (tfin1000 - tin1000) + " ns");
                tin1000 = System.nanoTime();
                Punto2.insercion(arrays1000);
                tfin1000 = System.nanoTime();
                System.out.println("INSERCION: " + (tfin1000- tin1000) + " ns");
                tin1000 = System.nanoTime();
                Punto2.seleccion(arrays1000);
                tfin1000 = System.nanoTime();
                System.out.println("SELECCION: "+ (tfin1000- tin1000) + "ns");
                tin1000 = System.nanoTime();
                 Punto2.mergesort(arrays1000, 0, arrays1000.length - 1);
                tfin1000 = System.nanoTime();
                System.out.println("MERGESOT: "+ (tfin1000 - tin1000) + "ns");
              }
            case 4 -> {
                tam = 5000;
                double[] arrays5000 = Ordenamiento.arregloRandom(tam);
                long tin5000, tfin5000;
                tin5000 = System.nanoTime();
                Punto2.burbuja(tam,arrays5000);
                tfin5000 = System.nanoTime();
                System.out.println("BURBUJA: "+ (tfin5000 - tin5000) + "ns");
                tin5000 = System.nanoTime();
                Punto2.insercion(arrays5000);
                tfin5000 = System.nanoTime();
                System.out.println("INSERCION: " + (tfin5000 - tin5000) + "ns");
                tin5000 = System.nanoTime();
                Punto2.seleccion(arrays5000);
                tfin5000 = System.nanoTime();
                System.out.println("SELECCION: "+ (tfin5000 -tin5000) + "ns");
                tin5000= System.nanoTime();
                 Punto2.mergesort(arrays5000, 0, arrays5000.length - 1);
                tfin5000= System.nanoTime();
                System.out.println("MERGESOT: "+ (tfin5000 - tin5000) + "ns");
              }
            case 5 -> {
                tam = 10000;
                double[] arrays10000 = Ordenamiento.arregloRandom(tam);
                long tin10000, tfin10000;
                tin10000 = System.nanoTime();
                Punto2.burbuja(tam,arrays10000);
                tfin10000 = System.nanoTime();
                System.out.println("BURBUJA: "+ (tfin10000 - tin10000) + "ns");
                tin10000 = System.nanoTime();
                Punto2.insercion(arrays10000);
                tfin10000 = System.nanoTime();
                System.out.println("INSERCION: " + (tfin10000- tin10000) + "ns");
                tin10000= System.nanoTime();
                Punto2.seleccion(arrays10000);
                tfin10000 = System.nanoTime();
                System.out.println("SELECCION: "+ (tfin10000 - tin10000) + "ns");
                tin10000= System.nanoTime();
                Punto2.mergesort(arrays10000, 0, arrays10000.length - 1);
                tfin10000= System.nanoTime();
                System.out.println("MERGESOT: "+ (tfin10000 - tin10000) + "ns");
              }
            case 6 -> sel=6;
                        }
                        
    }while (sel != 6);

    
}

    
}            
      

