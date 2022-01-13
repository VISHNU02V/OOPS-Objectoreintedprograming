import java.io.*;

class Matrixmul {
    public static void main(String[] args) {
        int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int c[][] = new int[3][3];
        System.out.println("********** M A T R I X    M U L T I P L I C A T I O N *********");
        System.out.println("//// 1st array ////");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + a[i][j]);
            }
            System.out.println();
        }
        System.out.println("//// 2nd array ////");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + b[i][j]);
            }
            System.out.println();
        }
        System.out.println("//// product of the 2 array ////");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print("  " + c[i][j]);
            }
            System.out.println();
        }
    }
}
