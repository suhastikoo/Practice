package LinkedList;

/*Delete a node from a linked list based on the position.*/

public class DeleteAtAGivenPosition {

	public static void main(String[] args) {
		LinkedList[] obj = new LinkedList[6];
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
		
		Delete(3,obj[0]);

	}

	private static void Delete(int i, LinkedList obj) {
		LinkedList temp = obj;
		int count = 0;
		if (i>0){
			LinkedList prev = obj;
			while (prev.next != null && count+1 != i){
				prev = prev.next;
				count+=1;
			}
			prev.next = prev.next.next;
		}
		
		else if (i==0){
			temp = obj.next;
			obj.next=null;
		}
		System.out.print(temp.data + " ");
		while(temp.next != null){
			System.out.print(temp.next.data + " ");
			temp = temp.next;
		}
	}

}
