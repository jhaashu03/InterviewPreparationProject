package MyProjects.StringAndArray.String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LongestDistinctCharactersInString {
    static public void main(String[] args) {
        HashSet set = new LinkedHashSet<Character>();
        int len =0;
        int j =0;
        int l =0; int m =0;
        String ans ="";
        String s = "geeksforgeeks";
        for(int i=0; i<s.length();i++){
            if(!set.add(s.charAt(i))){
                //Methdd-1(O((n))
                if((i-j)>j){
                    l=i;
                    m=j;
                    j = i-j;
                    set.clear();
                    set.add(s.charAt(i));
                }
                //Methdd-2(O(n2))
                /*if(set.size()>len){
                    ans ="";
                    len = set.size();
                    for(Object c: set){
                        ans+=c.toString();
                    }
                    set.clear();
                    set.add(s.charAt(i));
                    //System.out.println(ans);
                }*/
            }
        }
        System.out.println(l+"  "+m);
        System.out.println("Ans="+ s.substring(m,l));
    }
}
