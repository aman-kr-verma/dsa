class LastW {
    public int lengthOfLastWord(String s) {
        s.trim();
        //System.out.println(s);
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}
class LastWord{
    public static void main(String[] args) {
        LastW obj = new LastW();
        System.out.println(obj.lengthOfLastWord("   fly me   to   the moon  "));
    }
}