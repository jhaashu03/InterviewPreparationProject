package MyProjects.SlidingWindowProblem.VariableSizeSlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithWithoutRepeatingCharacters {
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        System.out.println("The input string is " + str);

        int len = longestUniqueSubsttr(str);

        System.out.println("The length of the longest " + "non-repeating character " +
                "substring is " + len);
    }

    private static int longestUniqueSubsttr(String str) {
        HashSet<Character> hash = new HashSet<>();
        int max=0;
        int i=0;int j=0;
        while(j<str.length()){
            if(hash.contains(str.charAt(j))){
                hash.remove(str.charAt(i));
                i++;
            }
            else{
                hash.add(str.charAt(j));
                max= Math.max(max,hash.size());

            }
            j++;
        }
        return max;
    }
}
