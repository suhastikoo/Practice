package BinaryTree;

public class ChildrenSumProperty {
	static int flag = 0;
	public static void main(String[] args) {
		Tree[] obj = new Tree[6];
		for (int i=0; i<6; i++){
			obj[i] = new Tree();
		}
		
		obj[0].data=11;
		obj[0].left=obj[1];
		obj[0].right=obj[2];
		obj[1].data=9;
		obj[1].left=obj[3];
		obj[1].right=obj[4];
		obj[2].data=2;
		obj[2].left=obj[5];
		obj[3].data=3;
		obj[4].data=6;
		obj[5].data=2;

		CheckChildrenSumProperty(obj[0]);
		
		if(flag == 1){
			System.out.println("Children sum property not satisfied!!!");
		}
		else{
			System.out.println("Property satisfied!!!");
		}
	}

	private static void CheckChildrenSumProperty(Tree obj) {
		if(obj.left!=null){
			CheckChildrenSumProperty(obj.left);
		}
		if(obj.right!=null){
			CheckChildrenSumProperty(obj.right);
		}
		if(obj.left!=null && obj.right==null){
			if(obj.data != obj.left.data){
				flag = 1;
			}
		}
		else if(obj.right!=null && obj.left==null){
			if(obj.data != obj.right.data){
				flag = 1;
			}
		}
		else if(obj.right!=null && obj.left!=null){
			if(obj.data != obj.right.data+obj.left.data){
				flag = 1;
			}
		}
		
	}

}
