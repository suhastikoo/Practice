package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumProductOfTwoNumbers {

	public static void main(String[] args) {
		int[] array = {-8,-9,0,-7,5,6,10,8};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int a : array){
			list.add(a);
		}
		Collections.sort(list);
		
		FindMaxProduct(list);

	}

	private static void FindMaxProduct(ArrayList<Integer> list) {
		int temp1 = list.get(0) * list.get(1);
		int temp2 = list.get(list.size()-1) * list.get(list.size()-2);
		
		if(temp1>=temp2){
			System.out.println("Maximum sum is: " + temp1);
		}
		else{
			System.out.println("Maximum sum is: " + temp2);
		}
	}

}
