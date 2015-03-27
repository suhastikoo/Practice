package Sorting;
/*Two lists have to be sorted*/
public class MergeSort {

	public static void main(String[] args) {
		int[] array1 = {4,15,16,25};
		int[] array2 = {8,23,42,50,108};
		int p1 = 0, p2 = 0;
		int[] finalArray = new int[array1.length+array2.length];
		
		for(int i = 0; i<finalArray.length; i++){
			if(p1<array1.length && p2<array2.length){
				if(array1[p1] > array2[p2]){
					finalArray[i] = array2[p2];
					p2++;
				}
				else{
					finalArray[i] = array1[p1];
					p1++;
				}
			}
			else{
				if(p1<array1.length){
					finalArray[i] = array1[p1];
					p1++;
				}
				else{
					finalArray[i] = array2[p2];
					p2++;
				}
			}
		}
		
		for(int a : finalArray){
			System.out.print(a + " ");
		}

	}

}
