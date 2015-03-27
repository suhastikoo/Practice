package BinaryTree;

import java.util.ArrayList;

public class MaxPathValue {
	static int max,temp;
	static int top = -1;
	static int[] size;
	static int count = 0;
	static ArrayList<Integer> list = new ArrayList<Integer>();
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
		Print(obj[0]);	

		System.out.println("Maximum value: " + max);
		System.out.print("Path is: ");
		for(int a : list){
			System.out.print(a + " ");
		}
	}

	private static void Print(Tree obj) {
		push(obj);
		count += 1;
		temp += obj.data;
		if(obj.left!=null){
			//count += 1;
			Print(obj.left);
		}
		if(obj.right!=null){
			//count += 1;
			Print(obj.right);
		}		
		if(obj.left==null && obj.right==null){
			if(max<temp){
				list.clear();
				max = temp;
				for(int i=0; i<count; i++){
					list.add(size[i]);
				}
				//System.out.println();
			}
			
		}
		count -= 1;
		temp -= obj.data;
		pop();
	}
	
	public static void pop() {
		if(top>=0){
			top--;
		}
		else{
			//System.out.println("Stack is empty");
		}		
	}
	
	public static void push(Tree obj) {
		if(top<size.length-1){
			size[++top] = obj.data;
		}
		else{
			return;
		}		
	}

}