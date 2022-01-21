public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ABBA"));
        System.out.println(isPalindrome("ABBC"));

        System.out.println(isPal("ABBA"));
        System.out.println(isPal("ABBC"));
    }

    private static boolean isPalindrome(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        return str.equals(builder.toString());
    }

    private static boolean isPal(String str){
        int begin = 0;
        int end = str.length() - 1;
        while(begin<end){
            if(str.charAt(begin)!=str.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }
}
