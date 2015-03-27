package Arrays;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		int[] array = {1,1,2,3,1,4,7,1,9,1,1,1,1,1};
		
		FindMajorityElement(array);
	}

	private static void FindMajorityElement(int[] array) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int flag = 0;
		for(int a : array){
			if(!map.containsKey(a)){
				map.put(a, 1);
			}
			else{
				Integer temp = map.get(a);
				map.put(a, temp+1);
				//System.out.println(array.length/2);
				if(map.get(a)>array.length/2){
					System.out.println(a);
					flag=1;
					break;
				}
			}
		}
		
		if (flag==0){
			System.out.println("NONE");
		}
		
		
	}

}
