package Trees.Striver_sheet;
import java.util.*;
public class Top_view_binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Pair>q=new LinkedList<Pair>();
        Map<Integer,Integer>map=new TreeMap<>();
        if(root==null){
            return result;
        }
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair current=q.remove();
            Node currNode=current.node;
            int hd=current.hd;
            
            if(!map.containsKey(hd)){
                map.put(hd,currNode.data);
            }
            
            if(currNode.left!=null){
                q.add(new Pair(currNode.left,hd-1));
            }
            if(currNode.right!=null){
                q.add(new Pair(currNode.right,hd+1));
            }
        }
        
        for(int value:map.values()){
            result.add(value);
        }
        return result;
        
        
    }
    
    static class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

}
