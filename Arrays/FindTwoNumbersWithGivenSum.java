package Arrays;
import java.util.Hashtable;

/* Find two numbers from an array that sum to 10*/
public class FindTwoNumbersWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,7,4,9,3,6,10,2};
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		for (int a : array){
			table.put(a, 1);
		}
		FindNumbers(array, table);

	}

	private static void FindNumbers(int[] array,
			Hashtable<Integer, Integer> table) {
		for (int a : array){
			if (table.containsKey(10-a) && a!=(10-a)){
				System.out.println(a + " " + (10-a));
				break;
			}
			
		}
		return;
	}

}
