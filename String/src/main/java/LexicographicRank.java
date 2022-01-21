import java.util.Arrays;
import java.util.List;

public class LexicographicRank {
    public static void main(String[] args) {
        System.out.println(lexRank("STRING"));
        System.out.println(lexRank("String"));
    }

    //S T R I N G
    public static final int CHAR = 256;

    static int lexRank(String str){
        int res = 1;
        int n = str.length();
        int mul = fact(n);
        int[] count = new int[CHAR];
        for(int i=0; i<str.length(); i++)
            count[str.charAt(i)]++;
        for(int i=1; i<CHAR; i++){
            count[i]+=count[i-1];
        }
        for(int i=0; i<n-1; i++){
            mul = mul/(n-i);
            res = res + count[str.charAt(i)-1]*mul;
            for(int j=str.charAt(i); j<CHAR; j++){
                count[j]--;
            }
        }
        return res;
    }

    static int fact(int n){
        int res = 1;
        while(n>0){
            res *= n;
            n--;
        }
        return res;
    }
}
