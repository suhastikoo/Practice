package Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		
		int pivot = 2;
		
		Print(array);
		Rotate(array,pivot);
		System.out.println("Rotated from position " + pivot);
		Print(array);

	}
	private static void Rotate(int[] array, int pivot) {
		int[] tempArray = new int[pivot];
		for(int i=0; i<pivot; i++){
			tempArray[i] = array[i];
		}
		
		for(int j=pivot; j<array.length; j++){
			array[j-pivot] = array[j];
		}
		
		for(int k=0; k<tempArray.length; k++){
			array[array.length-pivot+k] = tempArray[k];
		}
		
	}
	private static void Print(int[] array) {
		for(int a : array){
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
