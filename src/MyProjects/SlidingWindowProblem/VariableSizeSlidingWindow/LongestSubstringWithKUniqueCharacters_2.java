package MyProjects.SlidingWindowProblem.VariableSizeSlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUniqueCharacters_2 {
    public static void main(String[] args)
    {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(kUniques(s, k));
    }

    private static int kUniques(String str, int k) {
        int i=0;
        int j=0;
        int size=0;
        int maxSize=0;
        int n = str.length();
        Map<Character,Integer> map = new HashMap<>();
        while(j<n){
            if(map.containsKey(str.charAt(j))){
                int value = map.get(str.charAt(j));
                map.put(str.charAt(j),value+1);
            }
            else{
                map.put(str.charAt(j),1);
            }
            if(map.size()<k){
                j++;
            }
            else if(map.size()==k){
                for(Integer v: map.values()){
                    size+=v;
                }
                maxSize=Math.max(maxSize,size);
                j++;
                size=0;
            }
            else if(map.size()>k){
                while(map.size()>k){
                    if(map.containsKey(str.charAt(i))){
                        int x = map.get(str.charAt(i));
                        if(x-1==0)
                            map.remove(str.charAt(i));
                        else
                            map.put(str.charAt(i),x-1);

                    }
                    i++;
                }
                j++;
            }
        }
        return maxSize;
    }
}
