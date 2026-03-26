import java.util.Scanner;

class RotateMatrixNTimesClockwiseorAnticlockwise {
    
    static int[][] rotateClockwise90(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][rows - 1 - i] = matrix[i][j];
            }
        }
        return result;
    }

    static int[][] rotateAnticlockwise90(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[cols - 1 - j][i] = matrix[i][j];
            }
        }
        return result;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] xyz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows of matrix");
        int rows = sc.nextInt();
        System.out.println("Enter the no of columns of matrix");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the no of times to rotate");
        int times = sc.nextInt();
        System.out.println("Enter the direction of rotation (clockwise/anticlockwise)");
        String direction = sc.next();

        int[][] currentMatrix = matrix;
        int rotationCount = times % 4; // Optimization: every 4 rotations is back to original

        for (int k = 0; k < rotationCount; k++) {
            if (direction.equalsIgnoreCase("clockwise")) {
                currentMatrix = rotateClockwise90(currentMatrix);
            } else {
                currentMatrix = rotateAnticlockwise90(currentMatrix);
            }
        }

        System.out.println("Matrix after " + times + " " + direction + " rotations:");
        printMatrix(currentMatrix);
        
        sc.close();
    }
}