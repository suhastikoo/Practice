package Arrays;

public class SegregateEvenAndOdd {

	public static void main(String[] args) {
		int[] array = {12, 34, 45, 9, 8, 90, 3};
		
		int count = 0;
		
		for(int i=0; i<array.length; i++){
			if(array[i]%2==0){
				int temp = array[count];
				array[count] = array[i];
				array[i] = temp;
				System.out.print(array[count] + " ");
				count++;
			}
		}
		
		for(int j=count; j<array.length; j++){
			System.out.print(array[j] + " ");
		}

	}

}
