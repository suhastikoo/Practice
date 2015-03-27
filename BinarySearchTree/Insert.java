package BinarySearchTree;

import java.util.ArrayList;

public class Insert {

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
		
		int value = 9;
		
		InsertNode(obj[0],value);
		
		Print(obj[0]);
	}

	private static void Print(BST bst) {
		ArrayList<BST> list = new ArrayList<BST>();
		list.add(bst);
		
		while(!list.isEmpty()){
			ArrayList<BST> temp = new ArrayList<BST>();
			for (BST a : list){
				System.out.print(a.data + " ");
				if (a.left!=null){
					temp.add(a.left);
				}
				if (a.right!=null){
					temp.add(a.right);
				}
			}
			System.out.println();
			list.clear();
			list = temp;			
		}		
	}

	private static void InsertNode(BST obj, int value) {
		if (value>obj.data){
			if (obj.right!=null){
				obj=obj.right;
				InsertNode(obj,value);
			}
			else{
				BST temp = new BST();
				obj.right = temp;
				temp.data = value;
			}
		}
		else{
			if (obj.left!=null){
				obj=obj.left;
				InsertNode(obj,value);
			}
			else{
				BST temp = new BST();
				obj.left = temp;
				temp.data = value;
			}
		}		
	}
}
