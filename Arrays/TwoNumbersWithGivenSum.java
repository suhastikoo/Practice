package Arrays;

import java.util.HashMap;

public class TwoNumbersWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,5,9,7,4,3,5};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int a : array){
			if(!map.containsKey(a)){
				map.put(a, 1);
			}
			else{
				Integer temp = map.get(a);
				map.put(a, temp+1);
			}
		}
		
		int value = 10;
		
		FindNumbers(array,map,value);
	}
	
	public static void FindNumbers(int[] array, HashMap<Integer,Integer> map, int value){
		for(int a : array){
			if (map.containsKey(value-a)){
				if(a!=value-a){
					System.out.println("Found!!! " + a + " " + (value-a));
				}
				else{
					if(map.get(a)>1){
						System.out.println("Found!!! " + a + " " + (value-a));
					}
				}
				
			}
		}
	}

}
