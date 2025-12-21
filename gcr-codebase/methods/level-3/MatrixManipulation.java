import java.util.Scanner;

public class MatrixManipulation {
    // to get a randomly filled matrix
    public int[][] getMatrix(int rows, int columns) {
        int [][]matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                double randomNumber = Math.random() * 100;
                matrix[row][column] = (int)randomNumber;
            }
        }

        return matrix;
    }

    // to add two matrices
    public int[][] addMatrix(int [][]matrix1, int [][]matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return null;
        }

        int rows = matrix1.length, columns = matrix1[0].length;
        int [][]matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }

        return matrix;
    }

    // to subtract matrices
    public int[][] subtractMatrix(int [][]matrix1, int [][]matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return null;
        }

        int rows = matrix1.length, columns = matrix1[0].length;
        int [][]matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = matrix1[row][column] - matrix2[row][column];
            }
        }

        return matrix;
    }

    // to multiply Matrix
    public int[][] multiplyMatrix(int [][]matrix1, int [][]matrix2) {
        if (matrix1[0].length != matrix2.length) {
            return null;
        }

        int rows = matrix1.length, columns = matrix2[0].length, mediary = matrix2.length;
        int [][]matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                int sum = 0;
                for (int counter = 0; counter < mediary; counter++) {
                    sum += matrix1[row][counter] * matrix2[counter][column];
                }
                matrix[row][column] = sum;
            }
        }

        return matrix;
    }

    // to transpose matrix 
    public int[][] transposeMatrix(int [][]matrix){

        int rows = matrix.length, columns = matrix[0].length;
        int [][]transposedMatrix = new int[columns][rows];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                transposedMatrix[column][row] = matrix[row][column];
            }
        }
        return transposedMatrix;
    }

    // helper method to display a matrix
    public void displayMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Operation not possible");
            return;
        }

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // create  a Scanner object
        Scanner input = new Scanner(System.in);
        MatrixManipulation object = new MatrixManipulation();

        System.out.print("Enter rows and columns: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        int[][] matrix1 = object.getMatrix(rows, columns);
        int[][] matrix2 = object.getMatrix(rows, columns);
        int[][] matrix3 = object.getMatrix(columns, rows);

        System.out.println("Matrix 1:");
        object.displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        object.displayMatrix(matrix2);

        System.out.println("Addition:");
        object.displayMatrix(object.addMatrix(matrix1, matrix2));

        System.out.println("Subtraction:");
        object.displayMatrix(object.subtractMatrix(matrix1, matrix2));

        System.out.println("Multiplication:");
        object.displayMatrix(object.multiplyMatrix(matrix1,matrix3));

        System.out.println("Transpose of Matrix 1:");
        object.displayMatrix(object.transposeMatrix(matrix1));

        input.close();
    }
}
