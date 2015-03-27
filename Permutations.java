import java.util.HashSet;
import java.util.Set;
 
/**
 * @author Crunchify.com
 * 
 */
 
public class Permutations {
 
	public static void main(String[] args) {
		String s = "ABC";
		System.out.println("String " + s);
		System.out.println("Permutations: " + CalculatePermutations(s));
	}
 
	public static Set<String> CalculatePermutations(String str) {
		Set<String> res = new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			res.add("");
			return res;
		}
 
		char first = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words = CalculatePermutations(rem);
		for (String entry : words) {
			for (int i = 0; i <= entry.length(); i++) {
				res.add(crunchifyCharAdd(entry, first, i));
			}
		}
		return res;
	}
 
	public static String crunchifyCharAdd(String str, char c, int j) {
		String first = str.substring(0, j);
		String last = str.substring(j);
		return first + c + last;
	}
 
}