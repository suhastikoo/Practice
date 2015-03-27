package BinarySearchTree;

public class KthSamllestElementInBST {
	static int count = 1;
	static int k = 5;
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
		
		Traverse(obj[0]);
	}
	
	public static void Traverse(BST obj){
		if(obj.left!=null){
			Traverse(obj.left);
		}
		if (k == count){
			System.out.println("Smallest Number: " + obj.data);
			count += 1;
			return;
		}
		else{
			count += 1;
		}		
		if(obj.right!=null){
			Traverse(obj.right);
		}
	}

}
