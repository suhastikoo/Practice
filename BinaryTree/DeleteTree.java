package BinaryTree;

import java.util.ArrayList;

/*Using post order traversal for this*/
public class DeleteTree {
	static Tree root;
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

		root = obj[0];
		Print(root);

		Delete(root);
		root = null;
		Print(root);

	}

	private static void Delete(Tree tree) {
		
		if(tree.left!=null){
			Delete(tree.left);
		}
		if(tree.right!=null){
			Delete(tree.right);
		}

		//System.out.print(tree.data + " ");

		tree.left = null;
		tree.right = null;
		tree = null;
		

	}

	private static void Print(Tree obj) {
		ArrayList<Tree> list = new ArrayList<Tree>();
		if(obj!=null){
			list.add(obj);
			while(!list.isEmpty()){
				list = Traverse(list);
			}
		}

	}

	public static ArrayList<Tree> Traverse(ArrayList<Tree> list){
		ArrayList<Tree> temp = new ArrayList<Tree>();
		for(Tree a : list){
			if(a!=null){
				System.out.print(a.data + " ");
				if(a.left!=null){
					temp.add(a.left);
				}
				if(a.right!=null){
					temp.add(a.right);
				}
			}
			else{
				System.out.println("Tree deleted!!!");
				break;
			}
		}
		System.out.println();
		list.clear();
		return temp;
	}

}
