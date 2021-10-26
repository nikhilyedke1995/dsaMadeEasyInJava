public class RotateAMatrixBy90Degree {
    public static void main(String[] args) {
        /**
         * first take transpose and then reverse the array
         */
        int[][] arr =   {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        new RotateAMatrixBy90Degree().rotateAndPrint(arr);
    }

    public void rotateAndPrint(int[][] arr){
        new TransposeOfMatrix().makeTransposeAndPrint(arr);
        for(int i=0; i<arr.length/2; i++){
            for(int j=0; j<arr[i].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[arr.length-i-1][j];
                arr[arr.length-i-1][j] = temp;
            }
        }
        new MultiDimensionalArray().printMatrix(arr);
    }
}
