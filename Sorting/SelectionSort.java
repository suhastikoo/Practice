package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {23,42,4,16,8,15};
		
		int point = 0;
		
		while(point<array.length-1){
			int min = array[point];
			int loc = 0;
			for(int i=point; i<array.length; i++){
				if(array[i]<=min){
					min = array[i];
					loc = i;
				}
			}
			int temp = array[loc];
			array[loc] = array[point];
			array[point] = temp;
			point++;
		}
		
		for(int a : array){
			System.out.print(a + " ");
		}

	}

}
