package guia22;

public class Ordenamiento {
     public void burbuja(int n, double[] array) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= n - i - 2; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void insercion(double[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            double key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public void seleccion(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

   public void mergesort(double[] A, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergesort(A, l, m);
            mergesort(A, m + 1, r);
            merge(A, l, m, r);
        }
    }

    public void merge(double[] arr, int l, int m, int r) {
       
        int n1 = m - l + 1;
        int n2 = r - m;

    
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = (int) arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = (int) arr[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static double[] arregloRandom(int tamano) {
        double[] array = new double[tamano];
        return array;
    }  

    
}
