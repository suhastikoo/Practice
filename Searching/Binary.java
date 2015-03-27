package Searching;

import java.util.Arrays;

/*Elements must be sorted*/
public class Binary {

	public static void main(String[] args) {
		int[] array = {5,4,9,7,25,6,8};
		
		Arrays.sort(array);
		
		for(int a : array){
			System.out.print(a + " ");
		}
		System.out.println();
		
		int value = 8;
		int count = 0, flag = 0;
		int start = 0, mid = array.length/2, end = array.length-1;
		
		while(flag == 0){
			if(array[mid]==value){
				System.out.println("Found in " + ++count);
				flag = 1;
			}
			else if(array[start]==value){
				System.out.println("Found in " + ++count);
				flag = 1;
			}
			else if(array[start]==value){
				System.out.println("Found in " + ++count);
				flag = 1;
			}
			else{
				count++;
				if(array[mid]>value){
					end = mid - 1;
					mid = (end-start)/2;
				}
				else{
					start = mid + 1;
					mid = (end-start)/2;
				}
			}
		}

	}

}
