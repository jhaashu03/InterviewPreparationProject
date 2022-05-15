//lECTURE-4
package MyProjects.DP.LongestCommonSubsequence;

public class LongestCommonSubstringPrintString {
    public static void main(String[] args)
    {
        int n, m;
        String X = "abcdxyz";
        String Y = "xyzabcd";

        n = X.length();
        m = Y.length();

        System.out.println(lcsString(X.toCharArray(), Y.toCharArray(), n, m));
    }

    public static StringBuffer lcsString(char[] c1, char[] c2, int n, int m){
        int[][] t = new int[n+1][m+1];
        StringBuffer ans = new StringBuffer();
        int max=Integer.MIN_VALUE; int x=0; int y=0;
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
                else if(c1[i-1] == c2[j-1]){
                    t[i][j] = 1+t[i-1][j-1];
                    if(max<t[i][j]){
                        max=t[i][j];
                        x=i;
                        y=j;
                    }
                }
                else
                    t[i][j] =0;
            }
        }
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        while(t[x][y]>0){
            //System.out.println("x="+x+" : "+"y="+y);
            ans.append(c1[x-1]);
            x--;
            y--;
        }
        return ans.reverse();
    }
}
