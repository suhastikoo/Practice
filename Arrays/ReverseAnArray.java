package Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		
		Print(array);
		Reverse(array);
		Print(array);

	}
	
	private static void Print(int[] array) {
		for(int a : array){
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static void Reverse(int[] array){
		int temp;
		for(int i=0; i<array.length/2; i++){
			temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
	}
}
