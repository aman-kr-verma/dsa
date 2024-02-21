import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,6};
        mergeSor(arr, 5);
        System.out.println(arr);
    }

	public static void mergeSor(int[] arr, int n) {
		// Write your code here.
		divideFunc(0,n-1,arr);

	}

	public static void divideFunc(int low, int high, int[] arr){
        System.out.println("low  "  + low + " high : " + high);
		if(low>=high){
			return;
		}
		int mid = (low+high)/2;
		divideFunc(low, mid, arr);
		divideFunc(mid+1, high, arr);
		merge(low, mid, high, arr);
	}

	public static void merge(int low, int mid, int high, int[] arr){
		int left = low;
		int right = mid+1;
		List<Integer> temp = new ArrayList<>();

		while(left<=mid && right<=high){
			if(arr[left]<=arr[right]){
				temp.add(arr[left]);
                left++;
			}
			else{
				temp.add(arr[right]);
                right++;
			}
		}
		while(left<=mid){
			temp.add(arr[left]);
            left++;
		}
		while(right<=high){
			temp.add(arr[right]);
            right++;
		}

		for(int i =low; i<=high;i++){
			arr[i] = temp.get(i-low);
		}
	}
}