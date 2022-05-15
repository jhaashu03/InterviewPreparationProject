package MyProjects.DP.MatrixChainMultiplication;

import java.util.Arrays;

public class EggDroppingProblem_5 {
    static int[][] t = new int[11][101];
    public static void main(String args[])
    {
        int n = 2, k = 10;
        for(int[] row: t)
            Arrays.fill(row,-1);
        System.out.println("Minimum number of trials Recursive way in worst"
                + " case with "
                + n + "  eggs and "
                + k + " floors is " + eggDropRec(n, k));

        System.out.println("Minimum number of trials DP way in worst"
                + " case with "
                + n + "  eggs and "
                + k + " floors is " + eggDropDP(n, k));
    }

    //Recursive
    private static int eggDropRec(int egg, int floor) {

        if(floor==0 || floor==1)
            return floor;

        if(egg==1)
            return floor;

        int min = Integer.MAX_VALUE;

        for(int k =1; k<=floor; k++){
            //case1: jb break huaa kissi kth floor pe toh humara 1 egg km ho gya aur floor k-1 bacha hai
            //case2: jb break nhi huaa toh hume ab k se upar wale floor pe check krna hai

            //phle max issliye le rahe kyoki worst case mein pucha hai
            int temp = 1+Math.max(eggDropRec(egg-1,k-1), eggDropRec(egg,floor-k));

            //min yeha issliye le rahe kyoki min number of attemp pucha hai

            min = Math.min(min, temp);
        }
        return min;
    }

    //Memorization
    private static int eggDropDP(int egg, int floor) {


        if(floor==0 || floor==1)
            return floor;

        if(egg==1)
            return floor;

        if(t[egg][floor]!=-1)
            return t[egg][floor];

        int min = Integer.MAX_VALUE;

        for(int k =1; k<=floor; k++){
            //to optimized further we can check for t[egg-1][k-1] and t[egg][floor-k] in the
            //matrix before calling this recursive function
            int temp = 1+Math.max(eggDropRec(egg-1,k-1), eggDropRec(egg,floor-k));


            min = Math.min(min, temp);
        }
        t[egg][floor] = min;
        return min;
    }
}

