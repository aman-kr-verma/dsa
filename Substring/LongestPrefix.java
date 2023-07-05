class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        String max = "";
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()==0 || strs[i]!=strs[i-1]){
                if(strs[i].length()==0){
                    return "";
                }
                else{
                    int flag=0;
                    if(strs[i].length()>strs[i-1].length()){
                        max=strs[i];
                        flag=1;
                    }
                    else{
                        max=strs[i-1];
                    }
                    if(flag==0){
                        while(max.length()>strs[i].length() || max!=strs[i]){
                            max=max.substring(0,max.length()-1);
                        }
                        if(max.length()==0){
                            return "";
                        }
                    }
                    else{
                        while(max.length()>strs[i-1].length() || max!=strs[i-1]){
                            max=max.substring(0,max.length()-1);
                        }
                        if(max.length()==0){
                            return "";
                        }
                    }

                }
            } 
        }
        return max;     
    }
}

public class Main{

public static void main(String[] args) {
    Solution obj = new Solution();
    String[] str = {"flower","flow","flew"};
    String res = obj.longestCommonPrefix(str);
    System.out.println(res);
}
}