
package guia22;



public class MetCal {
 
    public int i, j,f1,c1,f2,c2; 
    public int [][]m1= new int[f1][c1];;
    public int [][]m2= new int[f2][c2];
    public int [][]rta; 
 

    public void SumaMat() {
   rta= new int[f1][c1]; 
        for (i = 0; i <f1 ;i++) {
            for (j = 0; j <c1; j++) {
                rta[i][j]=m1[i][j] + m2[i][j];
            }
        }
    }

    public void ProductoMat() {
        rta= new int[f1][c2];
        if (c1 == f2) {
            for (i = 0; i < f1; i++) {
                for (j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        rta[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }
        }
    }

    public void ProductEsc(int Escalar,int[][]matriz) {
        rta= new int[f1][c1];
        for (i = 0; i < f1; i++) {
            for (j = 0; j < c1; j++) {
                rta[i][j] = m1[i][j] * Escalar;
            }
        }
        
        rta= new int[f2][c2];
        for (i = 0; i < f2; i++) {
            for (j = 0; j < c2; j++) {
                rta[i][j] = m2[i][j] * Escalar;
            }
        }
        
    }

    public void Traspuesta(int [][]matriz) {
        rta= new int[f1][c1];
        for (i = 0; i < f1; i++) {
            for (j = 0; j < c1; j++) {
                rta[i][j] = m1[j][i];
            }
        }
        rta= new int[f2][c2];
        for (i = 0; i < f2; i++) {
            for (j = 0; j < c2; j++) {
             rta[i][j] = m2[j][i];
            }
        }
    }
}
