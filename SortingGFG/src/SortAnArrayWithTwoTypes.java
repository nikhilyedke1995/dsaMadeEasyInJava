import java.util.Arrays;

public class SortAnArrayWithTwoTypes {

    /**
     * Need to sort an array according to different conditions
     * ex1. segregate positive and negative
     * arr[] = {15,-2,-3,18}
     *
     * ex2. segregate even and odd
     * arr[] = {15,14,13,12}
     *
     * ex3. sort a binary array
     * arr[] = {0,1,1,1,0,0,1,0,1}
     */

    public static void main(String[] args) {
        int[] arr = {15,-2,-3,18};
        SortAnArrayWithTwoTypes twoTypes = new SortAnArrayWithTwoTypes();
        twoTypes.segregatePosNeg(arr);
        twoTypes.segregatePosNeg(new int[]{1,-2,3,4,-90,-55,55,78,-69});
        twoTypes.segregateOddAndEven(new int[] {15,14,13,12});
        twoTypes.segregateOnesAndZeros(new int[]{0,1,1,1,0,0,1,0,1});
    }

    /**
     * variation of quicksort
     * @param arr
     */
    private void segregatePosNeg(int[] arr){
        int pIndex = 0;
        int i = 0;
        while(i<arr.length){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    private void segregateOddAndEven(int[] arr){
        int pIndex = 0;
        int i = 0;
        while(i<arr.length){
            if(arr[i]%2==0){
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    private void segregateOnesAndZeros(int[] arr){
        int pIndex = 0;
        int i = 0;
        while(i<arr.length){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
