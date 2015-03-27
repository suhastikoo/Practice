package BinaryTree;

public class BFS_UsingQueue {
	static Tree root;
	static int size = 11;
	static int[] queue = new int[size];
	static int front, back;
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
		
		Traverse(root);
	}
	
	private static void Traverse(Tree obj) {
		add(obj.data);
		while(back>front){
			
		}
		
	}

	public static void add(int value){
		if(back<size){
			queue[back] = value;
			back++;
		}
		else{
			System.out.println("Queue is full.");
		}
	}
	
	public static Integer remove(){
		if(back>0){
			int temp = queue[--back];
			back--;
			return temp;
		}
		else{
			return null;
		}
	}

}
