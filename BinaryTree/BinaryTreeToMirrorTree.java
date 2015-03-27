package BinaryTree;

import java.util.ArrayList;

public class BinaryTreeToMirrorTree {
	static int count = 0;
	static Tree root1, root2;
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
		
		Tree[] obj1 = new Tree[10];
		for (int i=0; i<9; i++){
			obj1[i] = new Tree();
		}
		obj1[0].data = obj[0].data;
		root1 = obj[0];
		root2 = obj1[0];
		Print(root1);
		System.out.println();
		
		Inorder(root1,root2);
		
		Print(root1);
		System.out.println();
		Print(root2);		

	}
	
	private static void Inorder(Tree tree, Tree tree2) {
		if(tree.left!=null){
			Tree temp = new Tree();
			temp.data = tree.left.data;
			tree2.right = temp;
			Inorder(tree.left,tree2.right);
		}
		if(tree.right!=null){
			Tree temp = new Tree();
			temp.data = tree.right.data;
			tree2.left = temp;
			Inorder(tree.right,tree2.left);
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
