package Arrays;

public class SortedAndPivotedArray {

	public static void main(String[] args) {
		int[] array = {8,10,12,14,2,5,7};
		
		int value = 7;
		
		FindElement(array,value);

	}

	public static void FindElement(int[] array, int value){
		int start = 0;
		int end = array.length-1;
		int mid = (end-start)/2;
		int flag = 0;
		
		while(flag == 0){
			if(array[mid] == value){
				System.out.println(value + " present at index " + mid);
				flag = 1;
			}
			else if(array[start] == value){
				System.out.println(value + " present at index " + start);
				flag = 1;
			}
			else if(array[end] == value){
				System.out.println(value + " present at index " + end);
				flag = 1;
			}
			else{
				if(value>array[start] && value<array[mid]){					
					end = mid - 1;
					mid = (end-start)/2 + start;
				}
				else{
					start = mid + 1;
					mid = (end-start)/2 + start;
				}
			}
		}
	}
}
