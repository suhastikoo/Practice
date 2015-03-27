package LinkedList;
import java.util.Hashtable;

/*Linked list. Remove duplicates. */

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		RemDuplicates(obj[0]);

	}

	private static void RemDuplicates(LinkedList linkedList) {
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		table.put(linkedList.data, 1);
		System.out.print(linkedList.data + " ");
		LinkedList node = linkedList;
		while(node.next != null){
			if (!table.containsKey(node.next.data)){
				table.put(node.next.data, 1);
				System.out.print(node.next.data + " ");
				node = node.next;				
			}
			else{
				node.next = node.next.next;
				node = node.next;
			}			
		}		
	}
}

class LinkedList{
	LinkedList next;
	int data;
}