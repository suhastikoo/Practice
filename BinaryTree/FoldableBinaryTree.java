package BinaryTree;

public class FoldableBinaryTree {
	static int flag=0;
	static Tree root;
	public static void main(String[] args) {
		Tree[] obj = new Tree[6];
		for (int i=0; i<6; i++){
			obj[i] = new Tree();
		}

		obj[0].data = 10;
		obj[0].left = obj[1];
		obj[0].right = obj[2];
		obj[1].data = 7;
		obj[1].left = obj[3];
		obj[1].right = obj[5];
		obj[2].data = 15;
		obj[2].left = obj[4];
		//obj[2].right = obj[5];
		obj[3].data = 9;
		obj[4].data = 11;
		obj[5].data = 12;

		//		obj[0].data = 26;
		//		obj[0].left = obj[1];
		//		obj[0].right = obj[2];
		//		obj[1].data = 10;
		//		obj[1].left = obj[3];
		//		obj[1].right = obj[4];
		//		obj[2].data = 3;
		//		obj[2].right = obj[5];
		//		//obj[2].right = obj[6];
		//		obj[3].data = 4;
		//		obj[4].data = 6;
		//		obj[5].data = 3;
		//		//obj[6].data = 3;

		root = obj[0];

		CheckIfFoldable(root,root);
		if(flag == 0){
			System.out.println("Tree is foldable");
		}
		else{
			System.out.println("Tree is not foldable");
		}
	}
	private static void CheckIfFoldable(Tree obj, Tree obj2) {
		if(obj.left!=null){
			if(obj2.right!=null){
				CheckIfFoldable(obj.left, obj2.right);
			}
			else{
				flag = 1;
				return;
			}
		}
		if(obj.right!=null){
			if(obj2.left!=null){
				CheckIfFoldable(obj.right, obj2.left);
			}
			else{
				flag = 1;
				return;
			}

		}
		if(obj == root){
			return;
		}


	}
}
