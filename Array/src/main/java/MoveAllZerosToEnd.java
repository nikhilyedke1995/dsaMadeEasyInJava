import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        //8, 0, 0, 10, 0, 20
        //8,0,10,0,20,0
        //8,10,20,0,0,0
        System.out.println(Arrays.toString(moveZerosToEnd(new int[]{0, 0, 0, 40, 0, 20})));
    }

    private static int[] moveZerosToEnd(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr;
    }
}

