
public class LeadersInAnArray {
    public static void main(String[] args) {
        //number will be a leader only if all the elements to the right side of it are smaller
        leaderInAnArray(new int[]{7,10,4,10,6,5,2});
    }

    private static void leaderInAnArray(int[] arr){
        int curr_leader = arr[arr.length - 1];
        System.out.println(curr_leader);
        for(int i=arr.length - 2; i>=0; i--){
            if(curr_leader<arr[i]){
                curr_leader = arr[i];
                System.out.println(curr_leader);
            }
        }
    }
}
