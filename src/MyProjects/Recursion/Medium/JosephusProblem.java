package MyProjects.Recursion.Medium;

import java.util.*;

public class JosephusProblem {
    public static void main(String args[]){
        int n = 40;
        int k = 7;
        int index=0;//starting pos
        List<Integer> l = new ArrayList<>();
        for(int i=1;i<=n;i++)
            l.add(i);
        System.out.println(josephus(l,k-1,index));
    }

    private static int josephus(List<Integer> l, int k,int index) {
        if(l.size()==1)
            return l.get(0);

        index = (index+k)%l.size();
        //remove that person
        l.remove(index);

        return josephus(l,k,index);
    }
}
