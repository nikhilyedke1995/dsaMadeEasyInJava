public class RepeatingElement {
    public static void main(String[] args) {
        //0,2,1,3,4,5,6,2
        /**
         * find the repeating element in an array where
         * biggest element in an array is smaller than the (n-2)
         * where n = length of array
         */

    }

    //time complexity O(n) and space complexity O(1)
    public static int findRepeating(int[] arr){
        int slow = arr[0] + 1, fast = arr[0]+1;
        do{
            slow = arr[slow] + 1;
            fast = arr[arr[fast]+1] + 1;
        }while(slow!=fast);
        slow = arr[0] + 1;
        while(slow!=fast){
            fast = arr[fast] + 1;
            slow = arr[slow] + 1;
        }
        return slow - 1;
    }
}
