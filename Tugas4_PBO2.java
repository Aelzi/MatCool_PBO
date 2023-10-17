import java.util.Scanner;

public class Tugas4_PBO2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris matriks: ");
        int numRows = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int numCols = input.nextInt();

        int[][] matrix1 = new int[numRows][numCols];
        int[][] matrix2 = new int[numRows][numCols];
        int[][] resultMatrix = new int[numRows][numCols];

        System.out.println("Masukkan elemen-elemen matriks pertama:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Masukkan elemen baris " + (i + 1) + " kolom " + (j + 1) + ": ");
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Masukkan elemen-elemen matriks kedua:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Masukkan elemen baris " + (i + 1) + " kolom " + (j + 1) + ": ");
                matrix2[i][j] = input.nextInt();
            }
        }

        System.out.println("Pilih operasi:");
        System.out.println("1. Penambahan Matriks");
        System.out.println("2. Perkalian Matriks");
        int choice = input.nextInt();

        if (choice == 1) {
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        } else if (choice == 2) {
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    resultMatrix[i][j] = 0;
                    for (int k = 0; k < numCols; k++) {
                        resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        } else {
            System.out.println("Pilihan operasi tidak ada.");
            System.exit(1);
        }

        System.out.println("Hasil:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
