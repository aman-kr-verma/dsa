class MaxProd {
    public int maxProduct(int[] nums) {
        int curr_prod=nums[0],max_prod = nums[0];
        for(int i=1;i<nums.length;i++){
            
            curr_prod*=nums[i];
            if(curr_prod<nums[i]){
                curr_prod=nums[i];
            }
            if(max_prod<curr_prod){
                max_prod = curr_prod;
            }
        }
        return max_prod;
    }
}

class Max{
    public static void main(String[] args) {
        MaxProd obj = new MaxProd();
        int[] nums = {-2,3,-4};
        System.out.println(obj.maxProduct(nums));
    }
}