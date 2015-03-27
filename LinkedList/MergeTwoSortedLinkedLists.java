package LinkedList;

public class MergeTwoSortedLinkedLists {
	static LinkedList root;
	static LinkedList prev;
	static LinkedList next;
	public static void main(String[] args) {
		LinkedList[] obj1 = new LinkedList[3];
		for (int i=0; i<3; i++){
			obj1[i] = new LinkedList();
		}

		LinkedList[] obj2 = new LinkedList[3];
		for (int i=0; i<3; i++){
			obj2[i] = new LinkedList();
		}

		obj1[0].data=5;
		obj1[0].next=obj1[1];

		obj1[1].data=10;
		obj1[1].next=obj1[2];

		obj1[2].data=15;
		obj1[2].next=null;

		obj2[0].data=2;
		obj2[0].next=obj2[1];

		obj2[1].data=3;
		obj2[1].next=obj2[2];

		obj2[2].data=20;
		obj2[2].next=null;

		Print(obj1[0]);
		System.out.println();
		Print(obj2[0]);

//		LinkedList[] obj3 = new LinkedList[6];
//		for (int i=0; i<6; i++){
//			obj3[i] = new LinkedList();
//		}
		Merge(obj1[0],obj2[0]);
		System.out.println();
		Print(root);

	}

	private static void Merge(LinkedList obj1, LinkedList obj2) {
		//root = obj3;
		while(obj1!=null && obj2!=null){
			if(obj1.data>obj2.data){
				if(root == null){
					root = obj2;
					prev = obj2;
					obj2 = obj2.next;
				}
				else{
					next = obj2;
					prev.next = next;
					obj2 = obj2.next;
					prev = next;
					//prev = next;
				}
			}
			else{
				if(root == null){
					root = obj1;
					prev = obj1;
					obj1 = obj1.next;
				}
				else{
					next = obj1;
					prev.next = next;
					obj1 = obj1.next;
					prev = next;
					//next = prev.next;
				}
			}
		}
		if(obj1 == null){
			prev.next = obj2;
		}
		else{
			prev.next = obj1;
		}

	}

	private static void Print(LinkedList obj) {
		System.out.print(obj.data + " ");
		while(obj.next!=null){
			System.out.print(obj.next.data + " ");
			obj = obj.next;
		}

	}

}
