package Arrays;

public class AllZeroesAtTheEnd {

	public static void main(String[] args) {
		int[] array = {1,0,2,0,5,0,6};
		
		int count = 0;
		
		Print(array,count);
	}
	
	public static void Print(int[] array, int count){
		for(int i=0; i<array.length; i++){
			if(array[i] != 0){
				int temp = array[count];
				array[count] = array[i];
				array[i] = temp;
				count++;
			}
		}
		
		for(int a : array){
			System.out.print(a + " ");
		}
	}

}
