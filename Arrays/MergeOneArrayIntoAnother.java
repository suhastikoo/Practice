package Arrays;

public class MergeOneArrayIntoAnother {

	public static void main(String[] args) {
		int[] array1 = new int[7];
		int[] array2 = new int[4];
		
		array1[0] = 2;
		array1[1] = 7;
		array1[2] = 10;
		
		array2[0] = 5;
		array2[1] = 8;
		array2[2] = 12;
		array2[3] = 14;
		
		int temp = (array1.length - array2.length);
		
		for(int i=0; i<temp; i++){
			array1[temp+1+i] = array1[i];
		}
		
		int i=temp+1, j=0, k=0;
		
		while(j<array2.length && i<array1.length){
			if(array1[i]<array2[j]){
				array1[k] = array1[i];
				i++;
				k++;
			}
			else{
				array1[k] = array2[j];
				j++;
				k++;
			}
		}
		
		if(j<array2.length){
			for(int a=k; a<array1.length; a++){
				array1[a] = array2[j];
				j++;
			}
		}
		
		for(int a : array1){
			System.out.println(a);
		}

	}

}
