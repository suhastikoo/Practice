package BinarySearchTree;

public class SearchKey {

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
		
		int value = 5;
		
		Search(obj[0],value);

	}

	private static void Search(BST obj, int value) {
		if (obj.data == value){
			System.out.println("Found " + obj.data);
		}
		else if (obj.data < value){
			if (obj.right != null){
				obj = obj.right;
				Search(obj,value);	
			}
			else{
				System.out.println(value + " is not present.");
			}
					
		}
		else if (obj.data > value){
			if (obj.left != null){
				obj = obj.left;
				Search(obj,value);
			}
			else{
				System.out.println(value + " is not present.");
			}			
		}		
	}
}

class BST{
	BST left;
	BST right;
	BST parent;
	int data;
}
