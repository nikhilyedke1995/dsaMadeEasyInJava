public class AnagramSearch {

    private static final int CHAR = 256;

    public static void main(String[] args) {
        System.out.println(isPresent("geeksforgeeks","frog"));
    }

    static boolean isPresent(String text, String pat){
        int[] CT = new int[CHAR];
        int[] CP = new int[CHAR];

        for(int i=0; i<pat.length();i++){
            CT[text.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }

        for(int i = pat.length(); i<text.length(); i++){
            if(areSame(CT,CP))
                return true;
            CT[text.charAt(i)]++;
            CP[text.charAt(i-pat.length())]++;
        }
        return false;
    }

    private static boolean areSame(int[] ct, int[] cp) {
        for(int i=0; i<ct.length; i++)
            if(ct[i]!=cp[i])
                return false;
        return true;
    }
}
