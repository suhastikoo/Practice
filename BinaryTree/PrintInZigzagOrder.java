package BinaryTree;

import java.util.ArrayList;

/*Given a binary tree, print all the nodes in zigzag order.*/
public class PrintInZigzagOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree[] obj = new Tree[7];
		for (int i=0; i<7; i++){
			obj[i] = new Tree();
		}
		
		obj[0].data=1;
		obj[0].left=obj[1];
		obj[0].right=obj[2];
		
		obj[1].data=2;
		obj[1].left=obj[3];
		obj[1].right=obj[4];
		
		obj[2].data=3;
		obj[2].left=obj[5];
		obj[2].right=obj[6];
		
		obj[3].data=4;
		obj[4].data=5;
		obj[5].data=6;
		obj[6].data=7;
		
		System.out.println(obj[0].data);
		
		ArrayList<Tree> list = new ArrayList<Tree>();
		list.add(obj[0]);
		int count = 1;
		Print(list, count);
	}

	private static void Print(ArrayList<Tree> list, int count) {
		
		ArrayList<Tree> list1 = new ArrayList<Tree>();
		
		for (Tree a : list){
			if (a.left != null){
				list1.add(a.left);
			}
			if (a.right != null){
				list1.add(a.right);
			}
		}
		
		if (list1.isEmpty()){
			return;
		}
		else{
			if (count % 2 == 0){
				for (Tree a : list1){
					System.out.print(a.data + " ");
				}
			}
			else{
				for (int i=list1.size()-1; i>=0; i--){
					System.out.print(list1.get(i).data + " ");
				}
			}
			System.out.println("");
			count++;
			Print(list1,count);
		}
		
		
	}

}
