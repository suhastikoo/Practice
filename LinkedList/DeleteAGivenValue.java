package LinkedList;

/*Delete a node from a linked list based on the position.*/

public class DeleteAGivenValue {

	public static void main(String[] args) {
		LinkedList[] obj = new LinkedList[7];
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
		
		obj[6].data = 6;
		obj[6].next = null;
		
		Delete(6,obj[0]);

	}

	private static void Delete(int value, LinkedList obj) {
		LinkedList temp = obj;
		LinkedList prev = obj;
		if (obj.data != value){
			while(prev.next!=null)
				if (prev.next.data != value){
					prev = prev.next;
				}
				else{
					prev.next = prev.next.next;
				}		
		}
		else{
			temp = obj.next;
		}
		System.out.print(temp.data + " ");
		while(temp.next != null){
			System.out.print(temp.next.data + " ");
			temp = temp.next;
		}
	}

}
