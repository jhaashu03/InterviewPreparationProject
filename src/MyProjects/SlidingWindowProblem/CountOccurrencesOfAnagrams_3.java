package MyProjects.SlidingWindowProblem;

public class CountOccurrencesOfAnagrams_3 {
    public static void main(String args[])
    {
        /*String text = "forxxorfxdofr";
        String word = "for";*/
        String text = "aabaabaa";
        String word = "aaba";
        System.out.print(countAnagrams(text, word));
    }

    //easy way can be solved by adding ASCII of chars
    private static int countAnagrams(String text, String word) {
        int i=0;
        int j=0;
        int count=0;
        int sum=0;
        int wsum = 0;
        int n = text.length();
        int k = word.length();
        while(j<n){
            sum+=text.charAt(j);
            if(j<k){
                wsum+=word.charAt(j);
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(sum==wsum)
                    count++;
                sum-=text.charAt(i);
                i++;
                j++;
            }
        }
        return count;

    }
}
