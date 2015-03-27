package Sorting;

public class BubbleSort {
	static int flag = 1;
	public static void main(String[] args) {
		int[] array = {6,5,1,3,8,4,7,9,2};
		
		while(flag == 1){
			flag = 0;
			for(int i=0; i<array.length-1; i++){
				if (array[i]>array[i+1]){
					flag = 1;
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		
		for(int a : array){
			System.out.print(a + " ");
		}

	}

}
