package Arrays;

public class LeadersInAnArray {

	public static void main(String[] args) {
		int[] array = {16,17,4,3,5,2};
		
		int temp = array[array.length-1];
		
		for(int i=array.length-1; i>=0; i--){
			if(array[i]>=temp){
				System.out.println(array[i]);
				temp = array[i];
			}
			
		}

	}

}
