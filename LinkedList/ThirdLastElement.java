package LinkedList;
/*how to find the third last element in a linked list*/

public class ThirdLastElement {

	public static void main(String[] args) {
		LinkedList[] obj = new LinkedList[7];
		for (int i=0; i<6; i++){
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
		obj[5].next=null;
		
		Find(obj[0]);

	}

	private static void Find(LinkedList obj) {
		LinkedList first = obj;
		LinkedList second = obj.next.next;
		
		while(second.next != null){
			first = first.next;
			second = second.next;
		}
		
		System.out.println("Third last element is : " + first.data);
		
	}

}
