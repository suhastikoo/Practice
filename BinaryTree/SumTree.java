package BinaryTree;

public class SumTree {
	static int sum = 0, flag=0, temp;
	public static void main(String[] args) {
		Tree[] obj = new Tree[11];
		for (int i=0; i<11; i++){
			obj[i] = new Tree();
		}
		
		obj[0].data = 52;
		obj[0].left = obj[1];
		obj[0].right = obj[2];
		
		obj[1].data = 14;
		obj[1].left = obj[3];
		obj[1].right = obj[4];
		
		obj[2].data = 12;		
		obj[2].left = obj[5];
		obj[2].right = obj[6];
		
		obj[3].data = 3;
		obj[3].left = obj[7];
		obj[3].right = obj[8];
		
		obj[4].data = 4;
		obj[4].left = obj[9];
		
		obj[5].data = 2;
		
		obj[6].data = 5;		
		obj[6].right = obj[10];
		
		obj[7].data = 1;
		obj[8].data = 2;
		obj[9].data = 4;
		obj[10].data = 5;
		

//		obj[0].data = 26;
//		obj[0].left = obj[1];
//		obj[0].right = obj[2];
//		obj[1].data = 10;
//		obj[1].left = obj[3];
//		obj[1].right = obj[4];
//		obj[2].data = 3;
//		obj[2].right = obj[5];
//		//obj[2].right = obj[6];
//		obj[3].data = 4;
//		obj[4].data = 6;
//		obj[5].data = 4;
//		//obj[6].data = 3;

		Tree root = obj[0];
		
		checkIfSumTree(root);
		if(flag == 0){
			System.out.println("Tree is sum tree");
		}
		else{
			System.out.println("Tree is not a sum tree");
		}
	}

	private static void checkIfSumTree(Tree obj) {
		if(flag == 0){			
			if(obj.left!=null){
				checkIfSumTree(obj.left);
			}
			if(obj.right!=null){
				checkIfSumTree(obj.right);
			}
			
			if(obj.left==null && obj.right==null){
			}
			else{
				if(obj.left!=null){
					sum += obj.left.data;
					if(obj.left.left!=null || obj.left.right!=null){
						sum += obj.left.data;
					}
				}
				if(obj.right!=null){
					sum += obj.right.data;
					if(obj.right.right!=null || obj.right.left!=null){
						sum += obj.right.data;
					}
				}
				if(obj.data!=sum){
					flag = 1;
					sum = 0;
					return;
				}
				else{
					sum = 0;
				}
			}
			
		}
		else{
			return;
		}
		
		
	}

}
