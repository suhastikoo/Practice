package BinaryTree;

public class IdenticalTrees {
	static int flag = 0;
	
	public static void main(String[] args) {
		Tree[] obj1 = new Tree[10];
		for (int i=0; i<9; i++){
			obj1[i] = new Tree();
		}
		
		obj1[0].data = 8;
		obj1[0].left = obj1[1];
		obj1[0].right = obj1[2];
		obj1[1].data = 3;
		obj1[1].left = obj1[3];
		obj1[1].right = obj1[4];
		obj1[2].data = 10;
		obj1[2].right = obj1[5];
		obj1[3].data = 1;
		obj1[4].data = 6;
		obj1[4].left = obj1[6];
		obj1[4].right = obj1[7];
		obj1[5].data = 14;
		obj1[5].left = obj1[8];
		obj1[6].data = 4;
		obj1[7].data = 7;
		obj1[8].data = 13;
		
		
		Tree[] obj2 = new Tree[10];
		for (int i=0; i<9; i++){
			obj2[i] = new Tree();
		}
		
		obj2[0].data = 8;
		obj2[0].left = obj2[1];
		obj2[0].right = obj2[2];
		obj2[1].data = 3;
		obj2[1].left = obj2[3];
		obj2[1].right = obj2[4];
		obj2[2].data = 10;
		obj2[2].right = obj2[5];
		obj2[3].data = 1;
		obj2[4].data = 6;
		obj2[4].left = obj2[6];
		obj2[4].right = obj2[7];
		obj2[5].data = 14;
		obj2[5].left = obj2[8];
		obj2[6].data = 4;
		obj2[7].data = 7;
		obj2[8].data = 13;		
		
		int temp1 = 0;
		int temp2 = 0;
		
		Identical(obj1[0],obj2[0],temp1,temp2);
		if(flag==1){
			System.out.println("Not Identical!");
		}
		else{
			System.out.println("Identical!");
		}

	}

	private static void Identical(Tree tree, Tree tree2, int temp1, int temp2) {
		if (flag == 1){
			return;
		}
		else{
			if(tree.left!=null && tree2.left!=null){
				Identical(tree.left,tree2.left,temp1,temp2);
			}
			temp1 = tree.data;
			temp2 = tree2.data;
			if(temp1 != temp2){
				flag = 1;
			}
			if(tree.right!=null && tree2.right!=null){
				Identical(tree.right,tree2.right,temp1,temp2);
			}
		}
		
	}

}
