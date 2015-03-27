package Hashing;

import java.util.HashMap;

public class ArraySubsetOfAnotherArray {
	static int flag = 0;
	public static void main(String[] args) {
		int[] array1 = {10, 5, 2, 23, 19,3};
		int[] array2 = {19, 5, 3,3};
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int a : array1){
			if(map.containsKey(a)){
				int temp = map.get(a);
				map.put(a, temp+1);
			}
			else{
				map.put(a, 1);
			}			
		}
		
		CheckSubset(map,array2);
		if(flag==1){
			System.out.println("Not a subset!!!");
		}
		else{
			System.out.println("Its's a subset!!!");
		}

	}
	private static void CheckSubset(HashMap<Integer, Integer> map, int[] array2) {
		for(int a : array2){
			if(map.containsKey(a)){
				int temp = map.get(a);
				if(temp<=0){
					flag = 1;
					return;
				}
				else{
					map.put(a, temp-1);
				}
			}
			else{
				flag = 1;
				return;
			}
		}
		
	}

}
