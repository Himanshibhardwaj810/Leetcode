package arrays;

public class Assign_cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]g = {1,2,3}; 
		int[]s = {1,1};

	}
    public static int findContentChildren(int[] g, int[] s) {
        int count=0;
        for(int j=0;j<s.length;j++){
            for(int i=0;i<g.length;i++){
                if(s[j] >= g[i]){
                    count++;
                }
            }
        }
        return count;
        
    }

}
