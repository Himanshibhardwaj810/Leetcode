package arrays.striver_sheet;

public class buy_sell_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {7,6,4,3,1};
		System.out.println(maxProfit(nums));

	}
	public static int maxProfit(int[] prices) {
        int maxprofit=0;//as profit can't be negative
        int bestbuy=prices[0];
        for(int i=1;i<prices.length;i++) {
        	if(prices[i]>bestbuy) {
        		int profitforday=prices[i]-bestbuy;
        		maxprofit=Math.max(profitforday,maxprofit);
        	}
        	bestbuy=Math.min(bestbuy,prices[i]);
        }
        return maxprofit;
        
    }

}
