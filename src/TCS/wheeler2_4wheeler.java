package TCS;

import java.util.*;

public class wheeler2_4wheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int w = sc.nextInt();
		int x;
		int y;
		if (w >= 2 && (w % 2 == 0) && v < w) {
			y = (w - 2 * v) / 2;// x=two wheeler y=4-wheeler
			// v=vehicles w=wheels
			x = v - y;
			System.out.println(y);
			System.out.println(x);
		} else {
			System.out.println("Invalid input");
		}

	}



}
