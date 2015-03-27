package Sorting;

public class QuickSort {
	static int flag = 1;
	public static void main(String[] args) {
		int[] array = {6,5,1,3,8,4,7,9,2};
		
		
		int wall = 0;
		
		while(flag == 1){
			flag = 0;
			int pivot = array.length-1;
			for(int i=wall; i<array.length; i++){
				if(array[i]>array[pivot]){
					flag = 1;
				}
				else{
					int temp = array[i];
					array[i] = array[wall];
					array[wall] = temp;
					wall++;
				}
			}			
		}
		
		
		for(int a : array){
			System.out.print(a + " ");
		}

	}

}
