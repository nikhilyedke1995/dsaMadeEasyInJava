public class NaiveAlgorithmForPatternMatching {
    public static void main(String[] args) {
        //for distinct pattern
        String text = "ABCDABEFABCD";
        String pattern = "ABCD";
        int n = text.length();
        int m = pattern.length();
        for(int i=0; i<=n-m; ){
            int j;
            for(j=0;j<m;j++)
                if(text.charAt(i+j)!=pattern.charAt(j))
                    break;
            if(j==m)
                System.out.print(i + " * ");
            if(j==0)
                i++;
            else
                i = i+j;

        }
    }
}
