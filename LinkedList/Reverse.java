package LinkedList;

/*Reverse a linked list*/
public class Reverse {

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
		
		//ReverseUsingList(obj[0]);
		Print(obj[0]);
		ReverseWithoutList(obj[0]);
		

	}

	private static void Print(LinkedList linkedList) {
		System.out.print(linkedList.data + " ");
		while(linkedList.next != null){
			System.out.print(linkedList.next.data + " ");
			linkedList = linkedList.next;
		}
		System.out.println();		
	}

	private static void ReverseWithoutList(LinkedList obj) {
		LinkedList current = obj.next;
		LinkedList prev = obj;
		LinkedList temp = obj;
		
		obj.next = null;
		while(current.next != null){
			prev = current;
			current = current.next;
			prev.next = temp;
			temp = prev;
		}
		current.next = prev;
		
		Print(current);		
	}

	/*private static void ReverseUsingList(LinkedList obj) {
		ArrayList<LinkedList> list = new ArrayList<LinkedList>();
		list.add(obj);
		while(obj.next!=null){			
			obj = obj.next;
			list.add(obj);
		}
		
		LinkedList[] obj1 = new LinkedList[7];
		obj1[list.size()] = new LinkedList();
		obj1[list.size()].data = list.get(list.size()-1).data;
		for(int i=list.size()-1; i>0; i--){
			obj1[i] = new LinkedList();
			obj1[i].data = list.get(i-1).data;
			obj1[i+1].next = obj1[i];
		}
		
		obj1[1].next = null;
		
		LinkedList temp = obj1[list.size()];
		
		System.out.println(temp.data);
		while(temp.next != null){
			temp = temp.next;
			System.out.println(temp.data);
			
		}
		
	}*/

}
