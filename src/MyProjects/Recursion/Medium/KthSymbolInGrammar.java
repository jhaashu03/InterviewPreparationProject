//https://www.youtube.com/watch?v=5P84A0YCo_Y&list=PL_z_8CaSLPWeT1ffjiImo0sYTcnLzo-wY&index=11

package MyProjects.Recursion.Medium;

public class KthSymbolInGrammar {
    public static void main(String args[]){
        int n = 2;
        int k = 2;
        if(solve(n,k))
            System.out.println(1);
        else
            System.out.println(0);
    }

    private static boolean solve(int n, int k) {
        if(n==1 && k==1)
            return false;
        else {
            int mid = (int) Math.pow(2,(n-1))/2;
            if(k<=mid)
                return solve(n-1,k);
            else
                return !solve(n-1,k-mid);
        }
    }
}
