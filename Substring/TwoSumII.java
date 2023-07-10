import java.util.*;

class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                res[0]=map.get(target-numbers[i])+1;
                res[1]=i+1;
                break;
            }
            else{
                map.put(numbers[i],i);
            }
        }
        return res;
    }
}
class TwoSumII{
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] numbers = {2,7,11,15};
        int[] res = obj.twoSum(numbers, 9);
        for(int i: res){ System.out.print(i + " ");}
        
    }
}
