package BinaryTree;

public class RightLeftTopView {
	static Tree root;
	static int level,pos,neg;
	public static void main(String[] args) {
		Tree[] obj = new Tree[15];
		for (int i=0; i<15; i++){
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
		//obj[2].right = obj[6];
		obj[3].data = 1;
		obj[4].data = 6;
		obj[4].left = obj[6];
		obj[4].right = obj[7];
		obj[5].data = 14;
		//obj[6].data = 7;
		//obj[5].left = obj[8];
		obj[6].data = 4;
		obj[7].data = 7;
		
		obj[8].data = 13;
		obj[8].left = obj[9];
		obj[9].data = 12;
		
		root = obj[0];
		System.out.println("Left view of tree:");
		LeftView(root,0);
		level = 0;
		System.out.println("Right view of tree:");
		RightView(root,0);
		
		level = 0;
		System.out.println("Top view of tree:");
		TopView(root,0);

	}
	private static void TopView(Tree obj, int count) {
		if(count>=0){
			if(count>=pos){
				System.out.println(obj.data);
				pos++;
			}			
		}
		else{
			if(count<=neg){
				System.out.println(obj.data);
				neg--;
			}
		}
		//count+=1;
		if(obj.left!=null){
			LeftView(obj.left, count-1);
		}
		if(obj.right!=null){
			LeftView(obj.right, count+1);
		}
		//count-=1;
		
	}
	private static void LeftView(Tree obj, int count) {
		if(count>=level){
			System.out.println(obj.data);
			level++;
		}
		count+=1;
		if(obj.left!=null){
			LeftView(obj.left, count);
		}
		if(obj.right!=null){
			LeftView(obj.right, count);
		}
		count-=1;
		
	}
	private static void RightView(Tree obj, int count) {
		if(count>=level){
			System.out.println(obj.data);
			level++;
		}
		count+=1;
		if(obj.right!=null){
			RightView(obj.right, count);
		}
		if(obj.left!=null){
			RightView(obj.left, count);
		}
		count-=1;
		
	}

}
