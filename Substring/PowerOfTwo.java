class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        
        if(n==0) {return false;}
        if(n==1 || n==-1) {return true;}
        while(n!=0){
            
            System.out.println("n" + n);
            if(n%2==1 || n%2==-1) {return false;}
            n/=2;
        }
        return true;
    }
}
class Power {
    public static void main(String[] args) {
        PowerOfTwo obj =new PowerOfTwo();
        System.out.println(obj.isPowerOfTwo(16));
    }
}