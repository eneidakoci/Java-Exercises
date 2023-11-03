package perseritje;

import java.util.Scanner;

public class Matricat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Shkruani numrin e rreshtave: ");
        int rows = input.nextInt();
        System.out.print("Shkruani numrin e kolonave: ");
        int cols = input.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] resultMatrix = new int[rows][cols];

        System.out.println("Jepni vlerat e matrices A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }

        System.out.println("Jepni vlerat e matrices B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = input.nextInt();
            }
        }

        // Mbledhja e dy matricave
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Rezultati i mbledhjes së dy matricave është:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

