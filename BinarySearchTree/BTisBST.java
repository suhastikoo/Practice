package BinarySearchTree;

import java.util.ArrayList;

public class BTisBST {

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
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int first = 0, second = 0;
		if (CheckIfBinaryTreeIsBST(obj[0],first,second,list).get(0) == -1){
			System.out.println("Not a BST");
		}
		else{
			System.out.println("This binary tree is a BST");
		}

	}

	private static ArrayList<Integer> CheckIfBinaryTreeIsBST(BST bst, int first, int second, ArrayList<Integer> list) {
		if (bst.left!=null){
			CheckIfBinaryTreeIsBST(bst.left, first, second, list);
		}
		
		System.out.println(bst.data);
		list.add(bst.data);
		if (list.size()>1){
			first = list.get(list.size()-2);
			second = list.get(list.size()-1);
			if (first>=second){
				list.add(0,-1);
				return list;
			}
		}	
		
		if (bst.right!=null){
			CheckIfBinaryTreeIsBST(bst.right, first, second, list);
		}
		return list;
		
		
	}

}
