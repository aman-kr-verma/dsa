import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

class subsequences {


    public static void main(String[] args) {
        ArrayList<String> outList = subsequences("abc");

        for(String i : outList){
            System.out.print(i + " ");
        }
    }


    public static void createSubseq(int i, int n, String str, ArrayList<Character> arr, ArrayList<String> res){

        if(i>=n){
            //System.out.println("i : " + i +  " ,n : " + n);
            System.out.println(arr.toString());
            res.add(arr.toString());
            //System.out.println("res : " + res);
            return;
        }
        arr.add(str.charAt(i));
        createSubseq(i+1, n, str, arr, res);
        System.out.println("i : " + i + " arr : " + arr.toString());
        arr.remove(arr.size()-1);
        //System.out.println("failed here, i : " + i + " n : " + n);
        createSubseq(i+1, n, str, arr, res);
        //System.out.println("failed here also, i : " + i + " n : " + n);
    }


    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        int n = str.length();
        ArrayList<String> res = new ArrayList<>();
        ArrayList<Character> arr = new ArrayList<>();
        createSubseq(0,n,str,arr,res);
        return res;
    }
}