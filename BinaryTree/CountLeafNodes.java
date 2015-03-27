package BinaryTree;

public class CountLeafNodes {
	static int count = 0;
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
		
		Count(obj[0]);
		
		System.out.println("Number of leaf nodes: " + count);

	}

	public static void Count(Tree obj){
		if(obj.left!=null){
			Count(obj.left);
		}
		if(obj.right!=null){
			Count(obj.right);
		}
		if(obj.right==null && obj.left==null){
			count +=1;
		}
	}
}
