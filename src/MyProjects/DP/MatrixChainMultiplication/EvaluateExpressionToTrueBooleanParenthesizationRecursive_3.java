package MyProjects.DP.MatrixChainMultiplication;

import java.util.HashMap;
import java.util.HashSet;

/*
* exp1 xor exp2
*
* we know that T^F=T and F^T=T
*
* total number of true = Lt*Rt + LF*Rt
* */
public class EvaluateExpressionToTrueBooleanParenthesizationRecursive_3 {
    static HashMap<String,Integer> map = new HashMap<>();
    public static void main(String[] args)
    {
        char symbols[] = "T|T&F^T".toCharArray();
        //char operators[] = "|&^".toCharArray();
        map.clear();
        int n = symbols.length;
        boolean istrue = true;

        // There are 4 ways
        // ((T|T)&(F^T)), (T|(T&(F^T))),
        // (((T|T)&F)^T) and (T|((T&F)^T))
        System.out.println(
                countParenthRec(symbols, 0, n-1, istrue));

        System.out.println(
                countParenthdp(symbols, 0, n-1, istrue));
    }

    //Recursive
    private static int countParenthRec(char[] symbols, int i, int j, boolean isTrue) {
        int ans=0;
        if(i>j)
            return 0;
        if(i==j){
            if(isTrue)
                if(symbols[i]=='T')
                    return 1;
                else
                    return 0;
            else
                if(symbols[i]=='F')
                    return 1;
                else
                    return 0;
        }

        for(int k =i+1;k<=j-1;k+=2){
            int lt = countParenthRec(symbols,i,k-1,true);
            int lf = countParenthRec(symbols,i,k-1,false);
            int rt = countParenthRec(symbols,k+1,j,true);
            int rf = countParenthRec(symbols,k+1,j,false);


            if(symbols[k]=='^'){
                if(isTrue)
                    ans+=lt*rf + lf*rt;
                else
                    ans+=lt*rt + lf*rf;

            }
            if(symbols[k]=='|'){
                if(isTrue)
                    ans+=lt*rt + lt*rf + lf*rt;
                else
                    ans+=lf*rf;
            }
            if(symbols[k]=='&'){
                if(isTrue)
                    ans+=lt*rt;
                else
                    ans+=lf*rf + lt*rf + lf*rt;
            }
        }
        return ans;
    }

    //Memorization
    private static int countParenthdp(char[] symbols, int i, int j, boolean isTrue){
        //matrix ka size depend krta hai number of variables jo change ho raha
        //yeha i,j and isTrue change ho raha isslye 3d matrix
        /*int t[][][] = new int[1001][1001][2];*/

        //aur bana skte hai recursive value store krne k liye
        //key will be string of "i+j"isTrue" and vaule will be jo ans aayega

        int ans=0;
        if(i>j)
            return 0;
        if(i==j){
            if(isTrue)
                if(symbols[i]=='T')
                    return 1;
                else
                    return 0;
            else
            if(symbols[i]=='F')
                return 1;
            else
                return 0;
        }

        String temp=""; //i+j+isTrue
        temp+=i;
        temp+=" ";
        temp+=j;
        temp+=" ";
        temp+=isTrue;

        if(map.containsKey(temp))
            return map.get(temp);

        for(int k =i+1;k<=j-1;k+=2){
            int lt = countParenthRec(symbols,i,k-1,true);
            int lf = countParenthRec(symbols,i,k-1,false);
            int rt = countParenthRec(symbols,k+1,j,true);
            int rf = countParenthRec(symbols,k+1,j,false);


            if(symbols[k]=='^'){
                if(isTrue)
                    ans+=lt*rf + lf*rt;
                else
                    ans+=lt*rt + lf*rf;

            }
            if(symbols[k]=='|'){
                if(isTrue)
                    ans+=lt*rt + lt*rf + lf*rt;
                else
                    ans+=lf*rf;
            }
            if(symbols[k]=='&'){
                if(isTrue)
                    ans+=lt*rt;
                else
                    ans+=lf*rf + lt*rf + lf*rt;
            }
        }
        map.put(temp,ans);
        return ans;

    }
}
