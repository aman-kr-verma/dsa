import java.util.ArrayList;
import java.util.Arrays;

public class MatrixMedian
{

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(25)));
        // matrix.add(new ArrayList<>(Arrays.asList(1,4,7)));
        // matrix.add(new ArrayList<>(Arrays.asList(6,8,9)));
        int median = getMedian(matrix);
        System.out.println(median);
    }

	public static int upperbound(ArrayList<Integer> arr,int key){
		int low = 0;
		int high = arr.size()-1;
		int ans = arr.size()-1;
		while(low<=high){
			int mid = (low+high)/2;
			if(arr.get(mid)>key){
				ans = mid;
				high=mid-1;
			}
			else{
				low = mid+1;
			}
		}
		//System.err.println(ans);
		return ans;
	}

	public static int check(ArrayList<ArrayList<Integer>> matrix, int key){

		int count = 0;
		for(int i =0;i<matrix.size();i++){
			count += upperbound(matrix.get(i),key);

		}
		return count;
	}


	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		// Write your code here.
		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;
		for(int i=0;i<matrix.size();i++){
			low = Math.min(low, matrix.get(i).get(i));
			high = Math.max(high, matrix.get(i).get(matrix.get(i).size()-1));
		}
        
		int req = (matrix.size() * matrix.get(0).size())/2;
        System.out.println(low + " " + high + " " + req);
		// int ans = low;
		while(low<=high){
			int mid = (low+high)/2;
			System.out.println("low : " + low + " high : " + high + " mid : " + mid);
			int res = check(matrix,mid);
            System.out.println("check " + res + " mid : " + mid);
			if(res<=req){
				low = mid+1;
			} 
			else{
				high = mid-1;
			}
		}
		return low;
	}

}