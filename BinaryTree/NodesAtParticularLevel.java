package BinaryTree;

import java.util.ArrayList;

public class NodesAtParticularLevel {
	static int count;
	public static void main(String[] args) {
		Tree[] obj = new Tree[11];
		for (int i=0; i<10; i++){
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
		obj[8].left = obj[9];
		obj[9].data = 12;
		
		Print(obj[0]);
		
		System.out.println("Length of tree: " + count);
	}

	private static void Print(Tree Tree) {
		ArrayList<Tree> list = new ArrayList<Tree>();
		list.add(Tree);
		//count++;
		
		while(!list.isEmpty()){
			ArrayList<Tree> temp = new ArrayList<Tree>();
			for (Tree a : list){
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
			count++;
		}		
	}

}
