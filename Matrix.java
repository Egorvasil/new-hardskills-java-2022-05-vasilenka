package entities;

public class Matrix {
    private final double[][] matrix;
    private final int m;
    private final int n;

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        this.matrix = new double[m][n];
    }

    public void printMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mulByNum(int num) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] *= num;
            }
        }
    }

    public void addMatrix(Matrix matrix2) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                this.matrix[i][j]+=matrix2.getMatrix()[i][j];
            }
        }
    }

    public Matrix mulByMatrix(Matrix matrix2){
        Matrix resMatrix = new Matrix(m,n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    resMatrix.getMatrix()[i][j]+=matrix[i][k]+matrix[k][j];
                }
            }
        }
        return resMatrix;
    }

    public double[][]getMatrix(){
        return matrix;
    }
}