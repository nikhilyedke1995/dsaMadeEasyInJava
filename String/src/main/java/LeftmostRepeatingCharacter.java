import java.util.Arrays;

public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(leftmostRepeatingCharIndex("abccbd"));
    }

    private static int leftmostRepeatingCharIndex(String str) {
        int[] fIndex = new int[256];
        Arrays.fill(fIndex,-1);
        int res = Integer.MAX_VALUE;
        for(int i=0; i<str.length(); i++){
            int fi = fIndex[str.charAt(i)];
            if(fi==-1)
                fIndex[str.charAt(i)]=i;
            else
                res = Math.min(res,fi);
        }
        return res == Integer.MAX_VALUE?-1:res;
    }
}
