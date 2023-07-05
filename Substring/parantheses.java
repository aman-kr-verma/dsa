import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

class Paran {
    public boolean isValid(String s) {
        Map<Character,ArrayList<Integer>> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(map.containsKey('(')){
                    map.remove('(');
                }
                else{
                    return false;
                }
            }
            if(s.charAt(i)=='}'){
                if(map.containsKey('{')){
                    map.remove('{');
                }
                else{
                    return false;
                }
            }
            if(s.charAt(i)==']'){
                if(map.containsKey('[')){
                    map.remove('[');
                }
                else{
                    return false;
                }
            }


        }
        return true;
    }
}
class parantheses {
    public static void main(String[] args) {
        Paran obj = new Paran();
        System.out.println(obj.isValid("({{[null]}})"));
    }
}
