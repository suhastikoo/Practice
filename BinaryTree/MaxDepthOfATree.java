package BinaryTree;

public class MaxDepthOfATree {
	static int max,temp;
	static int top = -1;
	static int[] size;
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
		
		size = new int[obj.length];
		MaxHeight(obj[0]);	

		System.out.println("Maximum height: " + max);
	}

	private static void MaxHeight(Tree obj) {
		count += 1;
		if(obj.left!=null){
			//push(obj);
			//count += 1;
			MaxHeight(obj.left);
		}
		if(obj.right!=null){
			//push(obj);
			//count += 1;
			MaxHeight(obj.right);
		}		
		if(obj.left==null && obj.right==null){
			//push(obj);
			//count += 1;
			if(max<count){
				max = count;
			}			
		}
		count -= 1;
		//pop();
	}
	
//	public static void pop() {
//		if(top>=0){
//			top--;
//		}
//		else{
//			//System.out.println("Stack is empty");
//		}		
//	}
//	
//	public static void push(Tree obj) {
//		if(top<size.length-1){
//			size[++top] = obj.data;
//		}
//		else{
//			return;
//		}		
//	}
}