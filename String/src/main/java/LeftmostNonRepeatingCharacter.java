import java.util.Arrays;

public class LeftmostNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(leftmostNonRepeatingCharIndex("abccbd"));
    }

    private static int leftmostNonRepeatingCharIndex(String str) {
        int[] count = new int[256];
        Arrays.fill(count,0);
        for(int i=0; i<str.length(); i++)
            count[str.charAt(i)]++;
        for(int i=0; i<str.length(); i++)
            if(count[str.charAt(i)]==1)
                return i;
        return -1;
    }

    private static int leftMostNonRepeatingCharacterEfficient(String str){
        int[] fiChar = new int[256];
        Arrays.fill(fiChar,-1);
        for(int i=0; i<str.length(); i++){
            if(fiChar[str.charAt(i)]==-1)
                fiChar[str.charAt(i)]=i;
            else
                fiChar[str.charAt(i)]=-2;
        }
        int res = Integer.MAX_VALUE;
        for(int i=0;i<256; i++){
            if(fiChar[i]>=0)
                res = Math.min(res,fiChar[i]);
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}
