package LinkedList;

public class PairwiseLinkSwap {
	static LinkedList root;
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

		
		root = obj[0];
		Print(root);
		LinkSwap(root);
		Print(root);
	}
	private static void Print(LinkedList obj) {
		System.out.print(obj.data);
		while(obj.next!=null){
			System.out.print(" --> " + obj.next.data);
			obj = obj.next;
		}
		System.out.println();
		
	}
	private static void LinkSwap(LinkedList obj) {
		LinkedList prev = obj;
		LinkedList next = prev.next;	
		LinkedList temp1;
		root = next;
		temp1 = next.next;
		root.next = prev;
		
		
		while(temp1 != null){			
			if(temp1.next != null){	
				prev.next = temp1.next;
				next = prev.next;
				prev = temp1;			
				
				temp1 = next.next;
				next.next = prev;
				
			}
			else{
				prev.next = temp1;
				break;
			}
			if(temp1 == null){
				prev.next = null;
			}
//			else{
//				temp1 = next.next;
//				next.next = prev;
//				prev.next = temp1;
//			}
			
		}
		
	}

}
