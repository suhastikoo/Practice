package BinarySearchTree;

public class InorderPredecessorAndSuccessor {
	static int prev;
	static int next;
	static int flag1 = 0;
	static int flag2 = 0;
	public static void main(String[] args) {
		BST[] obj = new BST[10];
		for (int i=0; i<9; i++){
			obj[i] = new BST();
		}
		
		obj[0].data = 8;
		obj[0].left = obj[1];
		obj[0].right = obj[2];
		obj[1].data = 3;
		obj[1].left = obj[3];
		obj[1].right = obj[4];
		obj[2].data = 10;
		obj[2].right = obj[5];
		obj[3].data = 1;
		obj[4].data = 6;
		obj[4].left = obj[6];
		obj[4].right = obj[7];
		obj[5].data = 14;
		obj[5].left = obj[8];
		obj[6].data = 4;
		obj[7].data = 7;
		obj[8].data = 13;
		
		int value = 1;
		InorderPreSuc(obj[0], value);
		
		if(flag1!=0){
			System.out.println("Predessor :" + prev);
		}
		else{
			System.out.println("No Predessor present");
		}
		
		if(flag2!=0){
			System.out.println("Successor: " + next);
		}
		else{
			System.out.println("No successor present");
		}
		

	}

	private static void InorderPreSuc(BST obj, int value) {
		if(obj.left!=null){
			InorderPreSuc(obj.left, value);
		}
		if(obj.data<value){
			prev = obj.data;
			flag1=1;
		}
		else if(obj.data>value && flag2 == 0){
			next = obj.data;
			flag2 = 1;
		}
		if(obj.right!=null){
			InorderPreSuc(obj.right,value);
		}
		
	}

}
