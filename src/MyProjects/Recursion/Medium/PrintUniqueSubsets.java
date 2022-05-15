package MyProjects.Recursion.Medium;

import java.util.HashSet;

public class PrintUniqueSubsets {
    static HashSet<String> set = new HashSet<>();
    public static void main(String[] args)
    {
        String ip = "aabc";
        String op = "";
        findUniqueSubsequences(ip, op);

        for(String s : set)
            System.out.print(s+" ");
    }

    private static void findUniqueSubsequences(String ip, String op) {
        if(ip.length()==0){
            set.add(op);
        }
        else{
            String op1 = op;
            String op2 = op;
            op2+=ip.charAt(0);
            ip=ip.substring(1);
            findUniqueSubsequences(ip,op1);
            findUniqueSubsequences(ip,op2);
        }
    }
}
