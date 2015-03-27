package BinaryTree;
import java.util.ArrayList;
import java.util.TreeMap;


public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeNew[] obj = new NodeNew[6];
		for (int i=0; i<6; i++){
			obj[i] = new NodeNew();
		}
		
		obj[0].data=1;
		obj[0].left=obj[1];
		obj[0].right=obj[2];
		obj[1].data=2;
		obj[1].left=obj[3];
		obj[2].data=3;
		obj[2].left=obj[4];
		obj[2].right=obj[5];
		obj[3].data=4;
		obj[4].data=5;
		obj[5].data=6;		
		
		TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<Integer,ArrayList<Integer>>();
		ArrayList<NodeNew> list = new ArrayList<NodeNew>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list.add(obj[0]);
		list1.add(obj[0].data);
		map.put(0, list1);
		int i = 1;
		int flag = 0;
		while (flag == 0){
			list = Locate(list);
			list1.clear();
			if (!list.isEmpty()){
				for (NodeNew a : list){
					list1.add(a.data);
				}
				map.put(i, list1);
				i++;
			}
			else{
				flag=1;
				break;
			}
			
		}
		Print(map);
		
}

	private static void Print(TreeMap<Integer, ArrayList<Integer>> map) {
		// TODO Auto-generated method stub
		for (int i=map.size()-1; i>=0; i--){			
			System.out.println(map.get(i));
		}
	}

	private static ArrayList<NodeNew> Locate(ArrayList<NodeNew> list) {
		ArrayList<NodeNew> list1 = new ArrayList<NodeNew>();
		for (NodeNew a : list){
			if (a.left!=null){
				list1.add(a.left);
			}
			if (a.right!=null){
				list1.add(a.right);
			}
		}
			return list1;
		
	}
}
