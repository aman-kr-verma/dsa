class ValidP {
    public boolean isPalindrome(String s) {
        String temp="";
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                temp+=s.charAt(i);
            }
        }
        temp=temp.toLowerCase();
        System.out.println(temp);
        int i=0,j=temp.length()-1;
        while(i<j){
            if(temp.charAt(i)!=temp.charAt(j)) return false;
            i++;j--;
        }
        return true;

    }
}

class ValidPalindrome {
    public static void main(String[] args) {
        ValidP obj = new ValidP();
        System.out.println(obj.isPalindrome("0P"));
    }
}