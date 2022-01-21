public class RotationsOfEachOther {
    public static void main(String[] args) {
        System.out.println(areRotation("ABCD","CDAB"));
        System.out.println(areRotation("ABAB","ABBA"));
    }

    //concatenate 2 strings, and then try to find the index of rotated string
    //if index is there, it means other string is rotation of first one
    static boolean areRotation(String s1, String s2){
        if(s1.length()!=s2.length())
            return false;
        return (s1 + s1).contains(s2);
    }
}
