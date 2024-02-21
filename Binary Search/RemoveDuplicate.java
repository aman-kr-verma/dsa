import java.util.Collections;
import java.util.Comparator;

public class RemoveDuplicate {

    public static void main(String[] args) {
       String reString  = removeConsecutiveDuplicates("aaabbbzzz");
       System.out.println(reString);


       String s=  "vehvsfdvhfhhhhhhhh";
       char[] arr = s.toCharArray();
       s.chars().mapToObj(e->(char)e).filter(e->Collections.frequency(s, e)!=1).sorted().forEach(System.out::println);

    }


	public static String removeConsecutiveDuplicates(String s) {

        
		int n = s.length();
		StringBuilder sb = new StringBuilder(s);
		int i=1;
		remove(sb, i,n );
		return sb.toString();
	}

	public static void remove(StringBuilder sb, int i, int n){
        System.out.println("i : " + i);
		if(i>=sb.length()){
			return;
		}
		if(sb.charAt(i)==sb.charAt(i-1)){
            System.out.println("inside");
			sb.deleteCharAt(i-1);
            System.out.println("s : " + sb + " i : " + i);
            remove(sb, i, n);
		}
		else{
            System.out.println("else block");
            remove(sb, i+1, n);
        }
	}

}
