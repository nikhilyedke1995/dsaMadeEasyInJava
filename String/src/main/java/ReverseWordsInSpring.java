public class ReverseWordsInSpring {
    public static void main(String[] args) {
        String str = "Welcome to \"jumanji!!\"";
        System.out.println(reverseWords(str));
    }

    private static String reverseWords(String str){
        char[] chs = str.toCharArray();
        int start = 0;
        for(int i=0; i<str.length(); i++){
            if(chs[i]==' '){
                reverse(chs,start,i-1);
                start = i+1;
            }
        }
        reverse(chs,start,str.length()-1);
        reverse(chs,0,str.length()-1);
        return new String(chs);
    }

    private static void reverse(char[] chars, int low, int high){
        while(low<=high){
            char temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;
            low++;
            high--;
        }
    }
}
