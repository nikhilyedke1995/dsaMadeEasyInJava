
public class MajorityElement {
    public static void main(String[] args) {
        //moore's voting algorithm
        // 8,8,6,6,6,4,6
        //6,8,4,8,8
        System.out.println(findMajority(new int[]{8,8,6,6,6,4,6}));
        System.out.println(findMajority(new int[]{6,8,4,8,8}));
        System.out.println(findMajority(new int[]{8,1,8,2,8,3}));

    }

    private static int findMajority(int[] arr){
        int res = 0, count = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[res]==arr[i])
                count++;
            else
                count--;
            if(count==0){
                res = i;
                count = 1;
            }
        }

        count = 0;
        for (int j : arr) {
            if (arr[res] == j)
                ++count;
        }
            if(count<=arr.length/2)
                return -1;
        return arr[res];
    }
}
