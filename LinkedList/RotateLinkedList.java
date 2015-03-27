package LinkedList;
/*rotate a linked list from a given position in java
 * I/P : 10->20->30->40->50->60
 * O/P : 50->60->10->20->30->40
 * k=4 */

public class RotateLinkedList {

	public static void main(String[] args) {
		LinkedList[] obj = new LinkedList[8];
		for (int i=0; i<7; i++){
			obj[i] = new LinkedList();
		}
		
		obj[0].data=10;
		obj[0].next=obj[1];
		
		obj[1].data=20;
		obj[1].next=obj[2];
		
		obj[2].data=30;
		obj[2].next=obj[3];
	
		obj[3].data=40;
		obj[3].next=obj[4];
		
		obj[4].data=50;
		obj[4].next=obj[5];
		
		obj[5].data=60;
		obj[5].next=obj[6];
		
		obj[6].data=70;
		obj[6].next=null;
		
		int k = 4;
		
		Rotate(obj[0],k);
	}

	private static void Rotate(LinkedList obj, int k) {
		int count = 1;
		LinkedList start = obj;
		LinkedList temp1;
		
		while(count<k){
			start = start.next;
			count += 1;
		}
		
		LinkedList temp = start.next;
		start.next = null;
		temp1 = temp;
		
		while (temp1.next!=null){
			temp1 = temp1.next;
		}
		
		temp1.next = obj;
		
		System.out.print(temp.data + " ");
		while(temp.next != null){
			System.out.print(temp.next.data + " ");
			temp = temp.next;
		}
	}

}
