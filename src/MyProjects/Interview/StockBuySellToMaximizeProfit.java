package MyProjects.Interview;

public class StockBuySellToMaximizeProfit {
    public static void main(String[] args)
    {

        // stock prices on consecutive days
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = price.length;

        // function call
        System.out.println(maxProfit(price, n));
    }

    //Method-1 Find all local max and min and sum up all the diff of local max and min
    /*
    * arr[] ={5,2,6,1,4,7,3,6}
    * local_min =2 & local_max =6 | diff1 = 6-2=4
    * local_min =1 & local_max =7 | diff2 = 7-1=6
    * local_min =3 & local_max =6 | diff3 = 3-6=3
    *
    * ans= diff1+diff2+diff3 = 13
     * */

    //Method-2 add up all the values where price at i > price at i-1
    //it is equivelent to 1st approch
    /*for example
    * arr[] ={5,2,6,1,4,7,3,6}
    * 6>2 maxProfit+=(6-2)=4
    * 1<6 do nothing
    * 4>1 maxProfit = 4+(4-1) = 7
    * 7>4 maxProfit = 7+(7-4) = 10  In the method1 it was 7-1=6, here (4-1)+(7-4) = 6
    * 3<7 do nothing
    * 6>3 maxProfit = 10+(6-3) = 13
    * */
    private static int maxProfit(int[] price, int n) {
        // maxProfit adds up the difference between
        // adjacent elements if they are in increaisng order
        int maxProfit = 0;

        // The loop starts from 1
        // as its comparing with the previous
        for (int i = 1; i < n; i++)
            if (price[i] > price[i - 1])
                maxProfit += price[i] - price[i - 1];
        return maxProfit;
    }
}
