
public class StockBuyAndSell {
    public static void main(String[] args) {
        //efficient solution
        int[] arr = {1,5,3,8,12};
        int profit = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1])
                profit += arr[i] - arr[i-1];
        }

        System.out.println(profit);
    }
}
