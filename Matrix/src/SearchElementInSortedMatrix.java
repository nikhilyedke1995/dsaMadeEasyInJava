public class SearchElementInSortedMatrix {
    public static void main(String[] args) {
        /**
         * begin from top right corner
         * if element is same, print position and return
         * if x is smaller, move left
         * if x is bigger, move down
         */
        int[][] arr = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        new SearchElementInSortedMatrix().findElement(arr,39);
        new SearchElementInSortedMatrix().findElement(arr,50);
        new SearchElementInSortedMatrix().findElement(arr,32);
        new SearchElementInSortedMatrix().findElement(arr,15);

    }

    public void findElement(int[][] arr, int element){
        int right = arr.length-1,top=0;
        while(top<=arr.length && right>=0){
            if(arr[top][right]==element){
                System.out.println("("+top+","+right+")");
                break;
            }
            if(arr[top][right]>element){
                right--;
            }else if(arr[top][right]<element){
                top++;
            }
        }
    }
}
