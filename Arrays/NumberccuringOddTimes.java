package Arrays;

public class NumberccuringOddTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 2, 3, 1, 3};
		
		FindNumber(array);
	}
	
	public static void FindNumber(int[] array){
		int temp = array[0];
		for(int i=1; i<array.length; i++){
			temp = temp ^ array[i];
		}
		System.out.println(temp);
	}
}
