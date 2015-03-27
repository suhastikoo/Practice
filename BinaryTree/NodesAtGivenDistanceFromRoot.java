package BinaryTree;

public class NodesAtGivenDistanceFromRoot {
	static Tree root;
	static int distance;
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
		
		root = obj[0];
		
		distance = 3;
		Print(root,0);
		

	}
	private static void Print(Tree obj, int value) {
		if(value==distance){
			System.out.print(obj.data + " ");
		}		
		if(obj.left!=null){
			Print(obj.left, value+1);
		}
		if(obj.right!=null){
			Print(obj.right,value+1);
		}
		
	}

}
