package BinaryTree;

public class Q {
	static Tree root;
	static int flag;
	public static void main(String[] args) {
		Tree[] obj = new Tree[7];
		for (int i=0; i<7; i++){
			obj[i] = new Tree();
		}

		obj[0].data = 1;
		obj[0].left = obj[1];
		obj[0].right = obj[2];
		obj[1].data = 2;
		obj[1].left = obj[3];
		obj[1].right = obj[4];
		obj[2].data = 2;
		obj[2].left = obj[5];
		//obj[2].right = obj[6];
		obj[3].data = 3;
		obj[4].data = 4;
		obj[5].data = 4;
		obj[6].data = 3;

		root = obj[0];
		Tree temp = obj[0];

		Check(root,temp);
		if(flag == 1){
			System.out.println("Tree not a mirror");
		}
		else{
			System.out.println("Tree is a mirror");
		}
	}

	public static void Check(Tree obj, Tree temp){
		if(flag == 0){
			if(obj.left!=null){
				if(temp.right!=null){
					Check(obj.left,temp.right);
				}
				else{
					flag = 1;
					return;
				}				
			}
			if(obj.data != temp.data){
				flag = 1;
				return;
			}			
			if(obj.right!=null){
				if(temp.left!=null){
					Check(obj.right,temp.left);
				}
				else{
					flag = 1;
					return;
				}

			}
		}

		else{
			return;
		}

	}

}
