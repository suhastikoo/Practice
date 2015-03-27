package Arrays;

public class ProductArrayPuzzle {

	public static void main(String[] args) {
		int[] array = {10,3,5,6,2};
		
		int[] left = new int[array.length];
		int[] right = new int[array.length];
		int temp1=1, temp2=1;
		for(int i=0; i<array.length; i++){
			left[i] = temp1;
			temp1 = array[i];
			
			right[array.length-1-i] = temp2;
			temp2 = array[array.length-1-i];
		}

	}

}
