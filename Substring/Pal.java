class C {
    public boolean isPalindrome(int x) {
        //System.out.println(x);
        if(x<=0){
            return false;
        }
        else{
        int rem=0,rev=0,n=x;
        while(n>0){
            rem = n%10;
            rev = rev*10 + rem;
            n=n/10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
        
    }
}
class Pal{
    public static void main(String[] args) {
        C obj = new C();
        System.out.println(obj.isPalindrome(22));
    }
}