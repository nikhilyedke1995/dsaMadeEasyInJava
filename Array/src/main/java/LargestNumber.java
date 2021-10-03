import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumber {
    public static void main(String[] args) {
//        for (int i : new int[]{getLargest(new int[]{5, 8, 20, 10, 11, 115}),
//                getSecondLargest(new int[]{10,10,10})}) {
//            System.out.println(i);
//        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        reverseInGroups(list,5,3);
        list.forEach(System.out::println);
        //System.out.println("ans ===> " + tribonacci(38));
    }

    private static int getLargest(int[] arr){
        int result = Integer.MIN_VALUE;
        for (int j : arr) result = Math.max(result, j);
        return result;
    }

    private static int getSecondLargest(int[] arr){
        int largest = arr[0];
        int secondLargest = -1;
        for (int i =1; i<arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]!=largest){
                if(secondLargest == -1 || arr[i]>arr[secondLargest])
                    secondLargest = i;
            }
        }
        return secondLargest;
    }
    //40 30 20 10 0
    private static String getNthLargest(String s){
        if(s.length() == 1)
            return "";
        String temp = "a" + s.substring(1);
        System.out.println(temp);
        if(!isPalindrome(temp))
            return temp;

        temp = s;
        for(int i=1; i<s.length()-1; i++){
            temp = temp.substring(0,i) + "a" + temp.substring(i+1);
            System.out.println("replacing at " + i + " temp => " + temp);
            if(!isPalindrome(temp))
                break;
            temp = s;
            System.out.println(temp);
        }
        temp = temp.substring(0,s.length()-1) + "b";
        if(!isPalindrome(temp))
            return temp;
        return "";
    }

    private static boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static int tribonacci(int n) {
        if(n<2)
            return n;
        int[] f = new int[39];
        f[0] = 0; f[1] = 1; f[2] = 1;
        for(int i=3; i<=n+1; i++){
            System.out.println("ith => " + i + " " +  f[i-1] + " " + f[i-2] + " " + f[i-3]);
            f[i] = f[i-1] + f[i-2] + f[i-3];
        }
        return f[n];
    }

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i=0; i<n; i++){
            int start = i, end = Math.min(k + i - 1,n-1);

            while(start<=end){
                int temp = arr.get(start);
                arr.set(start,arr.get(end));
                arr.set(end,temp);
                ++start; --end;
            }

            i = k + i-1;
        }
    }
}
