package LinkedList;

import java.util.HashSet;

public class RemoveDuplicatesUsingHashSet {
	static LinkedList root;
	public static void main(String[] args) {
		LinkedList[] obj = new LinkedList[7];
		for (int i=0; i<obj.length; i++){
			obj[i] = new LinkedList();
		}
		
		obj[0].data = 1;
		obj[1].data = 5;
		obj[2].data = 8;
		obj[3].data = 2;
		obj[4].data = 1;
		obj[5].data = 5;
		obj[6].data = 3;
		
		obj[0].next = obj[1];
		obj[1].next = obj[2];
		obj[2].next = obj[3];
		obj[3].next = obj[4];
		obj[4].next = obj[5];
		obj[5].next = obj[6];
		obj[6].next = null;
		
		root = obj[0];
		Print(root);
		RemDuplicates(root);
		Print(root);

	}
	private static void RemDuplicates(LinkedList obj) {
		HashSet<Integer> map = new HashSet<Integer>();
		map.add(obj.data);
		while(obj.next!=null){
			if(!map.contains(obj.next.data)){
				map.add(obj.next.data);
				obj = obj.next;
			}
			else{
				obj.next = obj.next.next;
			}
		}
		
	}
	
	public static void Print(LinkedList obj){
		System.out.print(obj.data + " ");
		while(obj.next!=null){
			System.out.print(obj.next.data + " ");
			obj = obj.next;
		}
		System.out.println();
	}

}
