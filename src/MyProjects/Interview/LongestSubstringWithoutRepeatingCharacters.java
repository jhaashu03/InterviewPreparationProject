//https://www.youtube.com/watch?v=3IETreEybaA
//https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/

package MyProjects.Interview;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String args[]) {
        String s = "geeksforgeeks";
        longestSubstring(s,s.length());
    }

    private static void longestSubstring(String s, int length) {
        int i=0;
        int j =0;
        int max = 0;
        HashSet<Character> h = new HashSet();
        while(j<length){
            if(!h.contains(s.charAt(j))){
                h.add(s.charAt(j));
                j++;
                max = Math.max(h.size(),max);
            }
            else{
                h.remove(s.charAt(i));
                i++;
            }
        }
        System.out.println(max);
    }
}
