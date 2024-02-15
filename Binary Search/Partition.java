import java.util.ArrayList;
import java.util.*;

public class Partition 
{


    public static void main(String[] args) {
        //int[] arr = {8,6,10,3,2,7,10}; 
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(8);
        nums.add(6);
        nums.add(10);
        nums.add(3);
        nums.add(2);
        nums.add(7);
        nums.add(10);
        int ans = findLargestMinDistance(nums, 7);
        System.out.println(ans);
    }


    public static int check(ArrayList<Integer> arr, int maxSum){
        int countk = 1;
        long sum = 0;
        for(int i=0;i<arr.size();i++){
            if((sum+arr.get(i))<=maxSum){
                sum +=arr.get(i);
            }
            else{
                //System.out.println("sum : " + sum + " countk : " + countk);
                countk+=1;
                sum = arr.get(i);
            }
        }
        return countk;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        if(k>boards.size()){return -1;}
        int low = boards.get(0);
        int high = 0;
        int ans=0;
        for(int i =0;i<boards.size();i++){
            low = Math.max(low,boards.get(i));
            high+=boards.get(i);
        }
        //System.out.println("high " + high + " low : " + low);
        while(low<=high){
            int mid = (low + high)/2;
            System.out.println("low : " + low + " high : " + high +  " mid : " + mid);
            int m = check(boards,mid);
            if(m==k){
                ans = mid;
                high=mid-1;
            }
            else if(m<k){
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}