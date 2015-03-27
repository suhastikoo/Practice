package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesWithinGivenDistance {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 4};
		int k = 3;
		int flag = 0;
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();	
		
		for(int i=0; i<array.length; i++){
			if(map.containsKey(array[i])){
				int temp = map.get(array[i]);
				if(i-temp<=k){
					flag = 1;
					break;
				}
			}
			else{
				map.put(array[i], i);
			}
		}
		
		
//		for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
		if(flag==1){
			System.out.println("Duplicate present!!!");
		}
		else{
			System.out.println("Not Present!!!");
		}

	}

}
