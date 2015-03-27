package BinarySearchTree;

import java.util.ArrayList;

public class Delete {

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
		
		int value = 8;
		
		Print(obj[0]);
		DeleteKey(obj[0],value);
//		DeleteKey(obj[0],7);
//		DeleteKey(obj[0],4);
//		DeleteKey(obj[0],6);
		//DeleteKey(obj[0],3);
		//DeleteKey(obj[0],14);
		System.out.println();
		Print(obj[0]);
	}

	private static void DeleteKey(BST obj, int value) {
		if(obj.left!=null){
			if(obj.left.data != value){
				DeleteKey(obj.left, value);
			}
			else{
				if(obj.left.left==null && obj.left.right==null){
					obj.left = null;
				}
				else if((obj.left.left!=null && obj.left.right==null) || (obj.left.left==null && obj.left.right!=null)){
					if(obj.left.left!=null){
						obj.left = obj.left.left;
					}
					else if(obj.left.right!=null){
						obj.left = obj.left.right;
					}
				}
				else if(obj.left.left!=null && obj.left.right!=null){
					BST temp = obj.left;
					while(temp.right.right!=null){
						temp = temp.right;
					}
					if(temp.right.left==null){
						obj.left.data = temp.right.data;
						temp.right = null;
					}
					else{
						obj.left.data = temp.right.data;
						temp.right = temp.right.left;
					}
					
				}
			}
		}
		if(obj.data == value){
			if(obj.left==null && obj.right==null){
				obj = null;
			}
			else if((obj.left!=null && obj.right==null) || (obj.left==null && obj.right!=null)){
				if(obj.left!=null){
					obj = obj.left;
				}
				else if(obj.right!=null){
					obj = obj.right;
				}
			}
			else if(obj.left!=null && obj.right!=null){
				BST temp = obj.left;
				while(temp.right.right!=null){
					temp = temp.right;
				}
				if(temp.right.left==null){
					obj.data = temp.right.data;
					temp.right = null;
				}
				else{
					obj.data = temp.right.data;
					temp.right = temp.right.left;
				}
				
			}
		}
		if(obj.right!=null){
			if(obj.right.data != value){
				DeleteKey(obj.right, value);
			}
			else{
				if(obj.right.left==null && obj.right.right==null){
					obj.right = null;
				}
				else if((obj.right.left!=null && obj.right.right==null) || (obj.right.left==null && obj.right.right!=null)){
					if(obj.right.left!=null){
						obj.right = obj.right.left;
					}
					else if(obj.right.right!=null){
						obj.right = obj.right.right;
					}
				}
				else if(obj.right.left!=null && obj.right.right!=null){
					BST temp = obj.right;
					while(temp.left.left!=null){
						temp = temp.left;
					}
					if(temp.left.right==null){
						obj.right.data = temp.left.data;
						temp.left = null;
					}
					else{
						obj.right.data = temp.left.data;
						temp.left = temp.left.right;
					}
					
				}
			}
		}
		
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

}
