package Algosmstr3;
public class Tugas3 {
    public static void main(String[] args) {
        System.out.println("NAMA :FERDI SEYO AMANDA ");
        System.out.println("NIM  :20090159");
        int[][] matriks_a = { // 2x3
            {2,2,}, 
            {2,2,},
            {2,2,}
        };
        int[][] matriks_b = { //3x2
            {11,12,13},
            {14,15,16}
           
        };
        
        if  (matriks_a[0].length == matriks_b.length) {
            int[][] hasilKali = new int[matriks_a.length][matriks_b[0].length];
             for (int i=0; i<matriks_a.length; i++){
                for (int j=0; j<matriks_b[0].length; j++){
                    for (int k=0; k<matriks_a[0].length; k++){
                        hasilKali[i][j] += matriks_a[i][k]*matriks_b[k][j];
                    }
                }
            }
            for (int[] x: hasilKali){
                for (int y: x){
                    System.out.print(y+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("syarat: kolom matriks a = baris mmatriks b");
        
        }

    }
}