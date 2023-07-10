class FirstOc {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            System.out.println(haystack.substring(i,i+needle.length()));
            if(haystack.substring(i,i+needle.length()).equals(needle)) {
                //System.out.println(haystack.substring(i,i+needle.length()));
                return i;
            }
        }
        return -1;
    }
}
class FirstOccur {
    public static void main(String[] args) {
        FirstOc obj = new FirstOc();
        System.out.println(obj.strStr("b", "b"));
    }

}