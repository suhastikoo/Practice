package BinaryTree;

import java.util.ArrayList;

public class TreeToDLL {
	static Tree root;
	static int flag = 0,count;
	static DLL root1, first, second;
	static DLL[] obj1 = new DLL[9];
	public static void main(String[] args) {
		Tree[] obj = new Tree[10];
		for (int i=0; i<9; i++){
			obj[i] = new Tree();
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
		
//		DLL[] obj1 = new DLL[9];
//		for (int i=0; i<9; i++){
//			obj1[i] = new DLL();
//		}
		
		root = obj[0];
		
		Print(root);
		System.out.println();
		Convert(root);
		
		PrintDLL(root1);

	}

	private static void PrintDLL(DLL obj) {
		System.out.print(obj.data);
		while(obj.next!=null){
			System.out.print(" --> " + obj.next.data);
			obj = obj.next;
		}
		System.out.println();
		
	}

	private static void Convert(Tree obj) {
		if(obj.left!=null){
			Convert(obj.left);
		}
		if(flag == 0){
			obj1[count] = new DLL();
			obj1[count].data = obj.data;
			root1 = obj1[count];
			obj1[count].prev = null;
			flag = 1;
			count++;
		}
		else{
			obj1[count] = new DLL();
			obj1[count].data = obj.data;
			obj1[count-1].next = obj1[count];
			obj1[count].prev = obj1[count-1];
			obj1[count].next = null;
			count++;
		}
		if(obj.right!=null){
			Convert(obj.right);
		}
		
	}

	private static void Print(Tree obj) {
		ArrayList<Tree> list = new ArrayList<Tree>();
		list.add(obj);
		while(!list.isEmpty()){
			list = Traverse(list);
		}		
	}
	
	public static ArrayList<Tree> Traverse(ArrayList<Tree> list){
		ArrayList<Tree> temp = new ArrayList<Tree>();
		for(Tree a : list){
			System.out.print(a.data + " ");
			if(a.left!=null){
				temp.add(a.left);
			}
			if(a.right!=null){
				temp.add(a.right);
			}
		}
		System.out.println();
		list.clear();
		return temp;
	}
}

class DLL{
	DLL next;
	DLL prev;
	int data;
}
