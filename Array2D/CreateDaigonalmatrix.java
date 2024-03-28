package Array2D;

public class CreateDaigonalmatrix {
    public static void main(String[] args) {
        int[][] matrix = createDaigonal(4);
        display(matrix);
    }
    public static int[][] createDaigonal(int n){
        int[][] matrix = new int[n][n];

        for(int i=0; i< n; i++){
            matrix[i][i] = 1;
        }
        return matrix;
    }
    public static void display(int[][] matrix){
        for(int[] row: matrix){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println(" ");
        }
    }
}
