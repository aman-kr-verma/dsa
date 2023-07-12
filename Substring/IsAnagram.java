import java.util.Arrays;

class IsAnagram {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        Arrays.sort(s1);
        char[] t1=t.toCharArray();
        Arrays.sort(t1);
        System.out.println("s : " + s1 + " t : " + t1);
        return Arrays.equals(s1,t1);
    }
}
class Anagram {
    public static void main(String[] args) {
       IsAnagram obj = new IsAnagram();
       System.out.println(obj.isAnagram("anagram", "nagaram")); 
    }
}