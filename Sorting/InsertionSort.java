package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {23,42,4,16,8,15};
			
		for(int i=1; i<array.length; i++){
			if(array[i]>array[i-1]){
				//prev++;
				//next++;
			}
			else{
				int temp = i;
				while(temp>0){
					if(array[temp]<array[temp-1]){
						int temp1 = array[temp-1];
						array[temp-1] = array[temp];
						array[temp] = temp1;
						temp--;						
					}
					else{
						break;
					}
				}
			}
		}
		
		for(int a : array){
			System.out.print(a + " ");
		}

	}

}
