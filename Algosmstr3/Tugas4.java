package Algosmstr3;
public class Tugas4 {
    public static void main(String[] args) {
        System.out.println("NAMA :FERDI SETYO AMANDA ");
        System.out.println("NIM  :20090159");
        int[][] matriks_a = {
            {2,1,-5},
            {3,4,2}
        };
        int[][] transpose = new int[5][5];
        for (int i=0; i<matriks_a.length; i++){
            for (int j=0; j<matriks_a[0].length; j++){
                transpose[j][i] = matriks_a[i][j];
            }
            System.out.println();
        }
        for (int i=0; i<matriks_a[0].length; i++){
            for (int j=0; j<matriks_a.length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }//Ferdi Setyo Amanda
}
