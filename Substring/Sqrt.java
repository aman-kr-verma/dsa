class Sqrt {
    public int mySqrt(int x) {
        if(x<10){
            if(x==0) return 0;
            if(x==1) return 1;
            if(x<9) return 2;
            if(x<10) return 3;
        }
        for(int i=0;i<=x/2;i++) {
            if((i*i)==x) {
                return i;
                }
            else if(i*i > x){
                return i-1;
            }
        }
        return 0;
    }
}
class Main {
    public static void main(String[] args) {
        Sqrt obj = new Sqrt();
        System.out.println(obj.mySqrt(2147483647));
    }
}