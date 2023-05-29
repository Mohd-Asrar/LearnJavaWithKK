package Arrays;

public class MatrixRotation {
    public static void main(String[] args) {
        int[] []arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate90degree(arr);
    }

    static void rotate90degree(int[][]matrix){

        /*
        1. transpose
        2. swap the column
         */
        System.out.println("Normal matrix without any changes");
        print(matrix);
        System.out.println("MAtrix after transpose");
        transpose(matrix);
        print(matrix);

        System.out.println("Matrix after rotation");
        swapColumn(matrix);
        print(matrix);

    }

    static void transpose(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }

            }

        }
    }

    static void swapColumn(int[][]matrix){

        int start=0;
        int end = matrix[0].length-1;

        while(start<end){
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][start];
                matrix[i][start]= matrix[i][end];
                matrix[i][end] = temp;
            }
            start++;
            end--;
        }
    }

    static void print(int[][]matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
