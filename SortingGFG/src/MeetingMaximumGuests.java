import java.util.Arrays;

public class MeetingMaximumGuests {
    public static void main(String[] args) {
        int[] arr = {900,600,700};
        int[] dep = {1000,800,730};

        MeetingMaximumGuests guests = new MeetingMaximumGuests();
        System.out.println(guests.maxGuest(arr,dep));
    }

    int maxGuest(int[] arr, int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=1,j=0,res=1,curr=1;
        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                curr++; i++;
            }else{
                curr--;j++;
            }
            res = Math.max(res,curr);
        }
        return res;
    }
}
