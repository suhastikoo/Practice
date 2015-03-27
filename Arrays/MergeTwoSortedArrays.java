package Arrays;
/* Given two sorted array, merge them in linear time.*/
public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,3,5,6,7,9};
		int[] array2 = {2,4,8,10,11,15};
		int[] finalArray = new int[array1.length + array2.length];
		int p1=0,p2=0,p3=0;
		int flag = 0;
		while(flag == 0){
			if (p1!=array1.length && p2!=array2.length){
				if (array1[p1]>array2[p2]){
					finalArray[p3] = array2[p2];
					p2++;
					p3++;
				}
				else{
					finalArray[p3] = array1[p1];
					p1++;
					p3++;
				}
			}
			else{
				flag=0;
				break;
			}
			
		}
		if (p1!=array1.length){
			for (int i=p1; i<array1.length; i++){
				finalArray[p3] = array1[i];
				p3++;
			}
		}
		else{
			for (int i=p2; i<array2.length; i++){
				finalArray[p3] = array2[i];
				//p2++;
				p3++;
			}
		}
		Print(finalArray);

	}

	private static void Print(int[] finalArray) {
		// TODO Auto-generated method stub
		for (int a : finalArray){
			System.out.print(a + " ");
		}
	}

}
