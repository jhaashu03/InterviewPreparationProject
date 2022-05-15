//https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/

package MyProjects.StringAndArray.String.AllPermutationsOfAString;

public class StringPermutation {
    public void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans + " ");
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left_substr = str.substring(0, i);
            String right_substr = str.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, ans + ch);
        }
    }
    public static void main(String args[]){
        StringPermutation sp = new StringPermutation();
        String input = "xyz";
        String output = "";
        sp.permute(input,output);
    }
}
