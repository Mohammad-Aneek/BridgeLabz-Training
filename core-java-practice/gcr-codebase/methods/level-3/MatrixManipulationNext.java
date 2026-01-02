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

    // determinant of 2*2 matrix
    public int getDeterminant(int [][]matrix) {
        if (matrix[0].length != matrix.length) {
            return -1;
        }

        if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        } else {
            int determinant1 = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
            int determinant2 = matrix[1][0] * (matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
            int determinant3 = matrix[2][0] * (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]);

            return determinant1 - determinant2 + determinant3;
        }
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

        int[][] matrix = object.getMatrix(rows, columns);

        System.out.println("Transpose of Matrix 1:");
        object.displayMatrix(object.transposeMatrix(matrix1));

        
        input.close();
    }
}

