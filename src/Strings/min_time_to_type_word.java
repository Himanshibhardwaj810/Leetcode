package Strings;

public class min_time_to_type_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String word="abc";
		 System.out.println(minTimeToType(word));

	}
    public static int minTimeToType(String word) {
    	int ptr=1;
    	int totaltime=0;
    	for(int i=0;i<word.length();i++) {
    		int dest=word.charAt(i)-'a'+1;
    		int clockwise_dist=Math.abs(dest-ptr);
    		int anti_clockwise_dist=Math.abs(26-clockwise_dist);
    		
    		int min_dist=Math.min(clockwise_dist, anti_clockwise_dist);
    		totaltime=totaltime+min_dist+1;//for typing
    		ptr=dest;
    	}
    	return totaltime;
    
        
    }

}
