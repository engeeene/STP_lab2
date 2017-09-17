import java.util.Random;
import java.util.Scanner;

public class Matrix {
    private int[][] arr;
    private int n;

    public Matrix() {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter matrix order");
        int n = in.nextInt();
        this.n = n;
        arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = rand.nextInt(99);
            }
        }
    }

    public Matrix(int n) {
        Random rand = new Random();
        this.n = n;
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(99);
            }
        }
    }

    public void rowSums() {
        int above = 0;
        int on = 0;
        int below = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i == j) {
                    on += arr[i][j];
                } else if (i+1 == j) {
                    above += arr[i][j];
                } else if (i-1 == j) {
                    below += arr[i][j];
                }
            }
        }
        System.out.println("Sum of elements above main diagonal: " + above);
        System.out.println("Sum of elements on main diagonal: " + on);
        System.out.println("Sum of elements below main diagonal: " + below);
        System.out.println();
    }

    public void binariMatrix() {
        int[][] biArr = new int[n][n];
        System.out.println("Binary matrix: ");
        for (int i=0; i<n; i++) {
            int meanElem = arr[i][i];
            for (int j=0; j<n; j++) {
                if (arr[i][j] > meanElem) {
                    biArr[i][j] = 1;
                } else {
                    biArr[i][j] = 0;
                }
                System.out.format("%2d ", biArr[i][j]);
            }
            System.out.println();
        }
    }

    public void print() {
        System.out.println("Matrix: ");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.format("%2d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
