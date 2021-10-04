public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("square root of 16 is " + getSquareRoot(16));
        System.out.println("square root of 10 is " + getSquareRoot(10));
        System.out.println("square root of 1 is " + getSquareRoot(1));

    }

    private static int getSquareRoot(int x){
        int low = 1, high = x, ans = -1;
        while (low<=high){
            int mid = (low+high)/2;
            int mSq = mid*mid;
            if(x==mSq)
                return mid;
            else if(mSq>x)
                high = mid -1;
            else {
                ans = mid;
                low = mid+1;
            }
        }
        return ans;
    }
}
