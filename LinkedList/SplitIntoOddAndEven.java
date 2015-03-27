package LinkedList;
//import java.util.ArrayList;

/*Given a LinkedList list, reverse alternate nodes and append at the end.*/
/*Input List: 1->2->3->4->5->6*/
/*Output List: 1->3->5->6->4->2*/

class SplitIntoOddAndEven{
	static LinkedList root1, root2, first1, first2, second1, second2;
	public static void main(String[] args){	
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

		Traverse(obj[0]);
		Print(root1);
	}
	
	private static void Traverse(LinkedList obj) {
		first1 = obj;
		first2 = obj.next;
		root1 = first1;
		root2 = first2;
		
		while(first2.next!=null){
			if(first2.next.next!=null){
				second1 = first2.next;
				second2 = second1.next;
				first1.next = second1;
				first2.next = second2;
				first1 = second1;
				first2 = second2;
			}
			else{
				second1 = first2.next;
				first1.next = second1;
				first2.next = null;
			}			
		}
		first2.next = null;
		second1.next = root2;
		
		
	}

	public static void Print(LinkedList obj){		
		System.out.print(obj.data + " ");
		while(obj.next != null){
			System.out.print(obj.next.data + " ");
			obj = obj.next;
			
		}
		
		

	}
}

