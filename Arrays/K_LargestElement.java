package Arrays;

import java.util.Arrays;

public class K_LargestElement {

	public static void main(String[] args) {
		int[] array = {1,2,5,6,4};
		int k = 3;
		
		if(array.length>0 && k<=array.length){
			Arrays.sort(array);
			System.out.println("Element is: " + array[array.length - k]);
		}

	}

}
