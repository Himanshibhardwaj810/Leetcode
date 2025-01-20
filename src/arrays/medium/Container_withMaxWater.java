package arrays.medium;

public class Container_withMaxWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea2(nums));
		System.out.println(maxArea(nums));

	}

	// optimized one
	public static int maxArea2(int[] height) {
		int area;
		int maxarea = 0;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			area = Math.min(height[left], height[right]) * (right - left);// as right is always greater than left
			maxarea = Math.max(maxarea, area);
			if (height[left] < height[right]) {
				left++;//as we have to move the shorter one as if we 
				//move the height with max this can lead to minimize the area 
			} else {
				right--;
			}
		}
		return maxarea;
	}

	public static int maxArea(int[] height) {
		int area;
		int maxarea = 0;
		for (int left = 0; left < height.length; left++) {
			for (int right = height.length - 1; right >= 0; right--) {
				if (height[left] >= height[right] || height[left] <= height[right]) {
					area = Math.min(height[left], height[right]) * Math.abs(left - right);
					maxarea = Math.max(maxarea, area);
				}
			}
		}
		return maxarea;
	}

}
