public class NthRoot {

    public static void main(String[] args) {
        int a = NthRoot(9,1953125);
        System.out.println(a);
    }


    public static long checkPow(int mid, int n, int m){
        long ans=1;
            for(int i=0;i<n;i++){
                ans=ans*mid;
                //System.out.println("ans : " + ans);
                if(ans>m){
                    //System.out.println(" exceeded ans : " + ans);
                    return -1;
                }
            }
            return ans;
        }
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int low = 1;
        int high = m;
        while(low<=high){
            int mid = (low+high)/2;
            //System.out.println("low : " + low + " high : " + high + " mid : " + mid);
            long ans = checkPow(mid,n,m);
            if(ans ==m){
                return mid;
            }
            else if(ans>m || ans==-1){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
