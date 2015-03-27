package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BinaryTreeInVerticalOrder {

	public static void main(String[] args) {
		Hash[] obj = new Hash[10];
		for (int i=0; i<9; i++){
			obj[i] = new Hash();
		}
		
		obj[0].data = 1;
		obj[0].left = obj[1];
		obj[0].right = obj[2];
		
		obj[1].data = 2;
		obj[1].left = obj[3];
		obj[1].right = obj[4];
		
		obj[2].data = 3;
		obj[2].left = obj[5];
		obj[2].right = obj[6];
		
		obj[3].data = 4;
		obj[4].data = 5;
		
		obj[5].data = 6;
		obj[5].right = obj[7];		
		
		obj[6].data = 7;
		obj[6].right = obj[8];
		
		obj[7].data = 8;
		obj[8].data = 9;
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count = 0;
		
		ConvertToMap(map,count,obj[0]);
		
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
			public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
	            Integer ent1 = entry1.getValue();
	            Integer ent2 = entry2.getValue();
				return ent1.compareTo(ent2);
	        }});
		int temp1 = 0;
		
		for (Map.Entry<Integer, Integer> entry : list){
			if(temp1!=entry.getValue()){
				System.out.println();
				temp1=entry.getValue();
				System.out.print(entry.getKey() + "   ");
			}
			else{
				System.out.print(entry.getKey() + "   ");
			}
			
			//System.out.println(" --> " + entry.getValue());
		}
		
		
//		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//			System.out.print(entry.getKey() + " " + entry.getValue());
//			System.out.println();
//		}

	}

	private static void ConvertToMap(HashMap<Integer, Integer> map, int count, Hash obj) {
		if(obj.left!=null){
			//count -= 1;
			ConvertToMap(map,count-1,obj.left);
		}
		map.put(obj.data, count);
		if(obj.right!=null){
			//count += 1;
			ConvertToMap(map,count+1,obj.right);
		}
		
	}

}

class Hash{
	Hash left;
	Hash right;
	int data;
}
