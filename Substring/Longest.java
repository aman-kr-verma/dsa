class Solution {
    public boolean isPalindrome(String in){
        
        int i=0,j=in.length()-1;
        //System.out.println(in + " " + i+ " " +j);
        while (i < j) {
        if (in.charAt(i) != in.charAt(j)) {
            return false; // Characters at indices i and j do not match, not a palindrome
        }
        i++;
        j--;
    }
    return true;  
    }
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        else{
            int left=0,right=s.length()-1;
            int max=0;
            String max_string="";
            while(left<=right && (right-left+1)>max){
            String temp = s.substring(left,right+1);
            while(!isPalindrome(temp)){
                right--;
                temp=s.substring(left, right+1);
            }
            max=Math.max(max,right-left+1);
            //System.out.println("substring = " + temp + " max = " + max + " left =" + left + " right="+right );
            if(temp.length()==max){
                max_string = temp;
            }
            right=s.length()-1;
            left++;
            //System.out.println(" left =" + left + " right="+right );
        }
        return max_string;
        }
        
    }
}
class Longest{
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.longestPalindrome("hhfbdfzbzzzzdfbnjnzdfbtt"));
    }
}