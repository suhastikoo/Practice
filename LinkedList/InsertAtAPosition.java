package LinkedList;

/*Insert a node at a position in a single LinkedList list.*/

class InsertAtAPosition{

	public static void main(String[] args){
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
		obj[5].next=null;
		
		Insert(3,7,obj[0]);
	}
	
	public static void Insert(int loc, int value, LinkedList obj){	
		LinkedList prev;
		LinkedList temp = obj;
		//LinkedList nxt;
		int count = 0;
		if (loc > 0){
			prev = obj;
			while (prev.next != null && count+1 != loc){
				prev = prev.next;
				count +=1;
			}
			LinkedList nxt = prev.next;
			prev.next = new LinkedList();
			prev.next.data = value;
			prev.next.next = nxt;
		}
		
		else if (loc == 0){
			temp = new LinkedList();
			temp.data = value;
			temp.next = obj;
		}
		
		
		System.out.print(temp.data + " ");
		while(temp.next != null){
			System.out.print(temp.next.data + " ");
			temp = temp.next;
		}
	}
}