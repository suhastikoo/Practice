package LinkedList;

public class CircularList {

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
		obj[6].next=obj[0];


		FindCircuarLinkedList(obj[0]);
	}

	private static void FindCircuarLinkedList(LinkedList obj) {
		LinkedList first = obj;
		LinkedList second = obj;

		while(second.next != null){
			if (first.equals(second.next)){
				System.out.println("This is a circular List!!!");
				break;
			}
			else{
				System.out.println(second.data);
				second = second.next;
			}
		}

		if (second.next == null){
			System.out.println("This is not a circular List!!!");
		}
	}

}
