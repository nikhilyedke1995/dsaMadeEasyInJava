public class RabinKarpPatternMatching {

    //d is the number of characters in the input alphabet
    public static final int d = 256;

    /**
     *
     * @param pat pattern
     * @param txt text
     * @param q A prime number
     */
    static void search(String pat, String txt, int q){
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; //hash value for pattern
        int t = 0; //hash value for text
        int h = 1;

        //h = pow(d, M-1)%q
        for(i=0; i<M-1; i++)
            h = (h*d)%q;

        //Calculate the hash value of pattern and first window of text
        for(i=0; i<M; i++){
            p = (d*p + pat.charAt(i))%q;
            t = (d*t + txt.charAt(i))%q;
        }

        //slide pattern over text one by one
        for(i=0; i<=N-M; i++){
            //check the hash value of current window of text and pattern
            // If the hash value match then only check for characters one by one
            if(p==t){

                //check for characters one by one
                for(j=0; j<M; j++){
                    if(txt.charAt(i+j)!=pat.charAt(j))
                        break;
                }

                if(j==M)
                    System.out.println("Pattern found at index " + i);
            }

            // calculate hash value for next window of text
            // Remove leading character and add trailing character
            if(i < N-M){
                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q;
                // if t is negative
                if(t<0)
                    t = t+q;
            }
        }
    }

    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";

        //PRIME NUMBER
        int q = 101;

        search(pat,txt,q);
    }

}
