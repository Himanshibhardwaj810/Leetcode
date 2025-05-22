package Stack_and_Queues.Stack_and_Queues_part2;
import java.util.*;
public class LRU_Cache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//as doubly linked list is used to reorder the nodes in o(1)
	class Node{
		Node next;
		Node prev;
		int key;
		int value;
		public Node(int key,int value) {
			this.key=key;
			this.value=value;
		}
	
	}
	
	class LRUCache {
		int capacity;
		Node left;//to track LRU(Least Recently Used)
		Node right;//to track MRU(Most Recently used)
		HashMap<Integer,Node>map;
	    public LRUCache(int capacity) {
	        this.capacity=capacity;
	        map=new HashMap<>();
	        left=new Node(0,0);
	        right=new Node(0,0);//dummy nodes
	        
	        //interconnecting them as new node is placed between them initially
	        left.next=right;
	        right.prev=left;
	    }
	    //to remove the node 
	    public void remove(Node node) {
	    	Node prevNode=node.prev;
	    	Node nextNode=node.next;//to delete the node 
	    	
	    	prevNode.next=nextNode;
	    	nextNode.prev=prevNode;
	    }
	    //to insert the node
	    public void insert(Node node) {
	    	Node rightPrev=right.prev;
	    	
	    	node.prev=rightPrev;
	    	rightPrev.next=node;
	    	node.next=right;
	    	right.prev=node;
	    	
	    }
	    
	    public int get(int key) {
	    	if(map.containsKey(key)) {
	    		Node node=map.get(key);//to retreive node of corresponding key
	    		//update MRU and remove it from LRU
	    		remove(node);
	    		insert(node);
	    		return node.value;
	    	}
	    	return -1;
	        
	    }
	    
	    public void put(int key, int value) {
	    	if(map.containsKey(key)) {
	    		//remove it from LRU and then create new node at MRU
	    		 remove(map.get(key));
	    	}
	    	//if doesn't exist create new node
	    	Node newNode=new Node(key,value);
	    	//put it in map and doubly linked list
	    	map.put(key, newNode);
	    	insert(newNode);
	    	//after insertion if size got exceed then delete LRU from list
	    	//and map both
	    	if(map.size()>capacity) {
	    		Node LRU=left.next;
	    		remove(LRU);
	    		map.remove(LRU.key);//LRU's key will be removed
	    	}
	    	
	        
	    }
	}
//	Time Complexity:
//		get(key) → O(1)
//		put(key, value) → O(1)
//		Why?
//		HashMap lookup, insertion, and deletion are all O(1)
//		Doubly Linked List operations (insert, remove) are also O(1) 
//		because you already have the reference to the node (from the map)
//	Space Complexity:
//		O(capacity) for both:
//
//		HashMap → stores key -> node
//
//		Doubly Linked List → stores nodes (each with key & value)
//
//		So, total space: O(capacity)
	
}
