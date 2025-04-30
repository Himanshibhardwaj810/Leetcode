package TCS;
import java.util.*;
public class Washing_machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n>0 && n<2001) {
			System.out.println("Time Estimated is 25 minutes" );
		}else if(n>2000 && n<4001) {
			System.out.println("Time Estimated is 35 minutes" );
		}else if(n>4001 && n<7001) {
			System.out.println("Time Estimated is 45 minutes" );
		}else {
			System.out.println("OVERLOADED" );
		}

	}


}
