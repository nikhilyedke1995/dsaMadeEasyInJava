public class CheckIfStringIsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubSeqIterative("ABCDEF","ADF"));
        System.out.println(isSubSeqIterative("ABCDF","ADG"));

    }

    private static boolean isSubSeqIterative(String str1, String str2) {
        int j = 0;
        for(int i=0; i<str1.length() && j<str2.length(); i++){
            if(str1.charAt(i)==str2.charAt(j))
                j++;
        }
        return (j==str2.length());
    }


}
