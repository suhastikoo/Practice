package BinarySearchTree;

public class FloorAndCeil {
	static int floor, ceil,flag;
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
		
		FindFloorAndCeil(obj[0]);
		
		System.out.println("Floor: " + floor);
		System.out.println("Ceil: " + ceil);

	}
	public static void FindFloorAndCeil(BST obj){
		if(obj.left!=null){
			FindFloorAndCeil(obj.left);
		}
		if(flag == 0){
			floor = obj.data;
			ceil = obj.data;
			flag=1;
		}
//		if(floor>obj.data){
//			floor = obj.data;
//		}
		
		if(ceil<obj.data){
			ceil = obj.data;
		}
		if(obj.right!=null){
			FindFloorAndCeil(obj.right);
		}
	}
	
}
