package Array2D;

public class Declaring {
    public static void main(String[] args) {

        // Initialize a 3x3 matrix with consecutive numbers from 1 to 9
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Matrix: ");
        printMatrix(matrix);

        int sum = CalculateSum(matrix);
        System.out.println("The Sum of the matrix is: " + sum);
    }
    public static void printMatrix(int[][] matrix){
        for(int[] row: matrix){
            for(int num: row){
                System.out.print(num+ " ");
            }
            System.out.println(" ");
        }
    }
    public static int CalculateSum(int[][] matrix){
        int sum = 0;
        for(int[] row : matrix){
            for(int num : row){
                sum += num;
            }
        }
        return sum;
    }
}
