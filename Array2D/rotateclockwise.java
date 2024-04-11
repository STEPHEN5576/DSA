package Array2D;

public class rotateclockwise {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int l = arr[0].length;
        int[][] transpose = new int[l][l];
        for(int  i= 0; i< arr[0].length; i++){
            for(int j=0; j< arr[0].length; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        display(arr);
        System.out.println(" ");
        display(transpose);
        System.out.println(" ");

        int[][]rotated = rotate(transpose);
        display(rotated);


    }
    public static int[][] rotate(int[][] transpose) {
        int l = transpose[0].length;
        int[][] rotated = new int[l][l];

        int size=0;
        for (int[] num : transpose) {
            int l1 = l - 1;

                for (int j = 0; j < l; j++) {
                    rotated[size][j] = num[l1];
                    l1--;
                }
                size++;

        }

        return rotated;
    }
    public static void display(int[][] arr){
        for (int[] nums : arr){
            for(int num : nums){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
