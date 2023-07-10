
class CharDiff {
    public char findTheDifference(String s, String t) {
        int sum1=0,sum2=0;
        for(int i=0;i<s.length();i++){
            
            sum1+=(int) s.charAt(i);
            //System.out.println("sum1 " + sum1);
        }
        for(int i=0;i<t.length();i++){
            
            sum2+=(int) t.charAt(i);
            //System.out.println("sum2 " + sum2);
        }
        //System.out.println(sum2 + " " + sum1);
        char res = (char) (sum2-sum1);
        return res;
    }
}
class CharDifference{
    public static void main(String[] args) {
        CharDiff obj = new CharDiff();
        System.out.println(obj.findTheDifference("er", "ert"));
    }
}