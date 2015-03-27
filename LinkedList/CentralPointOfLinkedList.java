package LinkedList;
/*how to find a central point of a linked list*/

public class CentralPointOfLinkedList {

	public static void main(String[] args) {
		LinkedList[] obj = new LinkedList[8];
		for (int i=0; i<7; i++){
			obj[i] = new LinkedList();
		}
		
		obj[0].data=1;
		obj[0].next=obj[1];
		
		obj[1].data=2;
		obj[1].next=obj[2];
		
		obj[2].data=3;
		obj[2].next=obj[3];
	
		obj[3].data=4;
		obj[3].next=obj[4];
		
		obj[4].data=5;
		obj[4].next=obj[5];
		
		obj[5].data=6;
		obj[5].next=obj[6];
		
		obj[6].data=7;
		obj[6].next=null;
		
		Find(obj[0]);

	}

	private static void Find(LinkedList obj) {
		LinkedList end = obj;
		LinkedList middle = obj;
		float length = 1;
		float mid = 1;
		
		while(end.next != null ||  mid < (float) Math.ceil(length/2)){
			if (mid < (float) Math.ceil(length/2)){
				mid = (float) Math.ceil(length/2);
				middle = middle.next;
			}
			if (end.next != null){
				end = end.next;
				length += 1;
			}		
		}		
		
		System.out.println("Middle element is : " + middle.data);
		
	}

}
