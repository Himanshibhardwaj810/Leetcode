package Hashmap_hashset;
import java.util.*;
public class hashmap_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>set=new HashSet <>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		Iterator it=set.iterator();//this will iterqte over all elements in set
		while(it.hasNext()) {//has.next checks whether next element exist or not
			System.out.println(it.next());//it.next print value as it start from null
			//null->1->2->3
		}
		
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(1,123);
		map.put(2,223);
		map.put(3,323);
		map.put(1,123);
		for(Map.Entry<Integer,Integer> val:map.entrySet()) {
			System.out.println(val.getKey());
			System.out.println(val.getValue());
		}
		
		
		
		

	}

}
