package MyProjects.DP.MatrixChainMultiplication;

import java.util.HashMap;

/*
* case 1: jb swap ho raha at let say i=2 pe swaping ho rahi hai
*       gr|eat   eat|gr
* compare recursively gr with gr and eat with ate
* if(solve(a.subString(0,i+1), b.substring(i) &&
*    solve(a.subString(i)    , b.subString(0,i+1))
*
* case2: jb swapping nhi ho rahi hai: let say i=2 pe swapping nhi ho raha
*
*       gr|eat      gr|ate
* if(solve(a.subString(0,i+1), b.substring(0,i+1) &&
 *    solve(a.subString(i)    , b.subString(i))
 *
 * if(case1 || case2) -> ko v true hoga toh scrambled string hai
* */
public class ScrambledString_4 {
    static HashMap<String,Boolean> map = new HashMap<>();
    public static void main(String[] args)
    {
        String S1 = "coder";
        String S2 = "ocred";

        map.clear();

        if (isScrambleRec(S1, S2))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        if (isScrambleDP(S1, S2))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    //Recursive method
    private static boolean isScrambleRec(String s1, String s2) {

        if(s1.length() != s2.length())
            return false;

        //empty string scrambled string hoga na
        if(s1.isEmpty() && s2.isEmpty())
            return true;


        //jb string equal hai
        if(s1.equals(s2))
            return true;

        if(s1.length()<=1)
            return false;

        boolean flag = false;
        int n = s1.length();
        for(int i=1; i<n; i++){
            //case1: jb swap ho raha
            boolean case1 = isScrambleRec(s1.substring(0,i),s2.substring(n-i,n)) &&
                    isScrambleRec(s1.substring(i,n),s2.substring(0,n-i));

            //case2: jb swap nhi ho raha
            boolean case2 = isScrambleRec(s1.substring(0,i),s2.substring(0,i)) &&
                    isScrambleRec(s1.substring(i,n),s2.substring(i,n));

            if(case1 || case2){
                flag = true;
                break;
            }
        }
        return flag;
    }

    //Memorization
    private static boolean isScrambleDP(String s1, String s2) {

        if(s1.length() != s2.length())
            return false;

        //empty string scrambled string hoga na
        if(s1.isEmpty() && s2.isEmpty())
            return true;


        //jb string equal hai
        if(s1.equals(s2))
            return true;

        if(s1.length()<=1)
            return false;

        String key = s1;
        key+=" ";
        key+=s2;

        if(map.containsKey(key))
            return map.get(key);

        boolean flag = false;
        int n = s1.length();
        for(int i=1; i<n; i++){
            //case1: jb swap ho raha
            boolean case1 = isScrambleDP(s1.substring(0,i),s2.substring(n-i,n)) &&
                    isScrambleDP(s1.substring(i,n),s2.substring(0,n-i));

            //case2: jb swap nhi ho raha
            boolean case2 = isScrambleDP(s1.substring(0,i),s2.substring(0,i)) &&
                    isScrambleDP(s1.substring(i,n),s2.substring(i,n));

            if(case1 || case2){
                flag = true;
                break;
            }
        }
        map.put(key,flag);
        return flag;
    }
}
