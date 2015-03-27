package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class UnionAndIntersectionOfTwoLists {

	public static void main(String[] args) {
		HashList[] obj1 = new HashList[4];
		for(int i=0; i<4; i++){
			obj1[i] = new HashList();
		}
		
		obj1[0].data = 10;
		obj1[0].next = obj1[1];
		obj1[1].data = 15;
		obj1[1].next = obj1[2];
		obj1[2].data = 4;
		obj1[2].next = obj1[3];
		obj1[3].data = 20;
		obj1[3].next = null;
		
		HashList[] obj2 = new HashList[4];
		for(int i=0; i<4; i++){
			obj2[i] = new HashList();
		}
		
		obj2[0].data = 8;
		obj2[0].next = obj2[1];
		obj2[1].data = 4;
		obj2[1].next = obj2[2];
		obj2[2].data = 2;
		obj2[2].next = obj2[3];
		obj2[3].data = 10;
		obj2[3].next = null;
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		InsertIntoMap(obj1[0],map);
		
		IntersectionList(map,obj2[0]);
		System.out.println();
		UnionList(obj1[0],obj2[0]);

	}

	private static void UnionList(HashList obj1, HashList obj2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		while(obj1!=null){
			if(!map1.containsKey(obj1.data)){
				list.add(obj1.data);
				map1.put(obj1.data, 1);
			}
			obj1 = obj1.next;
		}
		
		while(obj2!=null){
			if(!map1.containsKey(obj2.data)){
				list.add(obj2.data);
				map1.put(obj2.data, 1);
			}
			obj2 = obj2.next;
		}
		
		HashList[] obj3 = new HashList[list.size()];
				
		obj3[0] = new HashList();
		obj3[0].data = list.get(0);
		for(int j=1; j<list.size(); j++){
			obj3[j] = new HashList();
			obj3[j].data = list.get(j);
			obj3[j-1].next = obj3[j];
		}
		obj3[list.size()-1].next = null;

		HashList temp = obj3[0];
		System.out.print("Union List: " + temp.data + " ");
		while(temp.next!=null){
			System.out.print(temp.next.data + " ");
			temp = temp.next;
		}
		
	}

	private static void IntersectionList(HashMap<Integer, Integer> map,	HashList obj) {
		ArrayList<Integer> list = new ArrayList<Integer>();		
		while(obj!=null){
			if(map.containsKey(obj.data)){
				list.add(obj.data);
			}
			obj = obj.next;
		}
		HashList[] obj3 = new HashList[list.size()];
				
		obj3[0] = new HashList();
		obj3[0].data = list.get(0);
		for(int j=1; j<list.size(); j++){
			obj3[j] = new HashList();
			obj3[j].data = list.get(j);
			obj3[j-1].next = obj3[j];
		}
		obj3[list.size()-1].next = null;

		HashList temp = obj3[0];
		System.out.print("Intersection List: " + temp.data + " ");
		while(temp.next!=null){
			System.out.print(temp.next.data + " ");
			temp = temp.next;
		}
	}

	private static void InsertIntoMap(HashList obj, HashMap<Integer, Integer> map) {
		map.put(obj.data, 1);
		while(obj.next!=null){
			map.put(obj.next.data, 1);
			obj = obj.next;
		}
		
		//System.out.println(map.size());
		
	}

}

class HashList{
	int data;
	HashList next;
}
