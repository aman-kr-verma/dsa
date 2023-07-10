class Min1 {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums[0]>=target){
            return 1;
        }
        int left =0,right =0,min=Integer.MAX_VALUE,sum=nums[right],temp_sum=0;
        while(right<nums.length){
            temp_sum=sum;
            //System.out.println("left" + left +" right="+ right + " sum="+sum + " min=" + min);
            if(sum>=target){
                min=Math.min(min,right-left+1);
                while(left<right){
                    sum-=nums[left];
                    left++;
                    if(sum>=target){
                        min=Math.min(min,right-left+1);
                        if(min==1) {return min;}
                    }
                }
                right++;
                if(right>=nums.length){return min;}
                left=0;
                sum=temp_sum+nums[right];

            }
            else{
                right++;
                if(right>=nums.length){
                    if(min==Integer.MAX_VALUE) {return 0;}
                    else {return min;}
                }
                sum+=nums[right]; 
            }  
        }
        return min;
        
    }
}
class MinTar{
    public static void main(String[] args) {
        Min1 obj = new Min1();
        int[] array = {1,4,4};
        System.out.println(obj.minSubArrayLen(4, array));
    }
}