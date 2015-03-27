import java.io.*;
import java.util.ArrayList;

public class test2 {
	static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int[] array1 = {1,2,3};
        int[] array2 = {2,1,3};
        int[] array3 = {3,2,1,5,4,6};
        int[] array4 = {1,3,4,2};
        int[] array5 = {3,4,5,1,2};
        
        Find(Insert(array4),list);
        
        if(list.equals(ReturnList(array4))){
        	System.out.println("YES");
        }
        else{
        	System.out.println("NO");
        }
    }
    
    public static ArrayList<Integer> ReturnList(int[] array){
    	ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int a : array){
        	temp.add(a);
        }
        return temp;
    }

	private static Node Insert(int[] array) {
		Node[] obj = new Node[array.length];
		for (int i=0; i<array.length; i++){
			obj[i] = new Node();
		}
		obj[0].data = array[0];
		Node root = obj[0];
		int j = 1;
		while(j<array.length){
			root = obj[0];
			if(array[j]>root.data){
				while(root.right!=null){
					root = root.right;
				}
				root.right = obj[j];
				obj[j].data = array[j];
				j++;
				
			}
			else if(array[j]<root.data){
				while(root.left!=null){
					root = root.left;
				}
				root.left = obj[j];
				obj[j].data = array[j];
				j++;
			}
			
		}
		return obj[0];
	}
	
	public static void Find(Node obj, ArrayList<Integer> list){
		list.add(obj.data);
		if (obj.left!=null){
			Find(obj.left,list);
		}
		if (obj.right!=null){
			Find(obj.right,list);
		}
		
		//return list;
	}
}

class Node{
    Node left;
    Node right;
    int data;
}