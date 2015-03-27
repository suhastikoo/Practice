package LinkedList;

/*Insert a node at the first position in a single LinkedList list.*/

class InsertAtBeginning{

	public static void main(String[] args){
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
		
		Insert(7,obj[0]);
	}

	private static void Insert(int i, LinkedList obj) {
		LinkedList temp = new LinkedList();
		temp.data = i;
		temp.next = obj;
		
		System.out.print(temp.data + " ");
		while(temp.next != null){
			System.out.print(temp.next.data + " ");
			temp = temp.next;
		}
		
	}
}