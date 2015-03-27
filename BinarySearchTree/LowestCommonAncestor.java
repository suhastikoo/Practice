package BinarySearchTree;

public class LowestCommonAncestor {

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
		
		int value1 = 1;
		int value2 = 7;
		
		FindCommonAncestor(obj[0], value1,value2);

	}

	private static void FindCommonAncestor(BST obj, int value1, int value2) {
		int flag = 0;
		while(flag == 0){
			if(obj.data < value1 && obj.data < value2){
				obj = obj.right;
			}
			else if(obj.data>value1 && obj.data>value2){
				obj = obj.left;
			}
			else{
				flag = 1;
				break;
			}
		}
		
		System.out.println(obj.data);
		
		
		
	}

}
