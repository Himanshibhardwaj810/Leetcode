package arrays;

public class buy_sell_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));

	}
	   public static  int maxProfit(int[] prices) {
		   int maxprofit=0;
		   int bestbuy=prices[0];//this day can't be selling price
		   for(int i=0;i<prices.length;i++) {
			   if(prices[i]>bestbuy) {//profit is earned when selling price is max 
				   int profitforday=prices[i]-bestbuy;//selling price-buying price
				   maxprofit=Math.max(profitforday, maxprofit);
			   }
			   bestbuy=Math.min(bestbuy, prices[i]);//minimum buy price
		   }
		   return maxprofit;
	        
	    }

}
