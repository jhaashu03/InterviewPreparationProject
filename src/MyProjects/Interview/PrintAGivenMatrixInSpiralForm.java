//https://www.youtube.com/watch?v=siKFOI8PNKM
//https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/

package MyProjects.Interview;

public class PrintAGivenMatrixInSpiralForm {
    public static void main(String[] args)
    {
        int a[][] = {/*top*/ { 1, 2, 3, 4 },
                             { 5, 6, 7, 8 },
                            { 9, 10, 11, 12 },
                /*bottom*/ { 13, 14, 15, 16 }};
                            //left       //right


        spiralOrder(a);
    }

    private static void spiralOrder(int[][] a) {
        int r = a.length;
        int c = a[0].length;
        int top = 0; int bottom = c-1; int left = 0; int right = r-1;
        int dir = 0;
        while(top<=bottom && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++)
                    System.out.print(a[top][i]+", ");
                top++;
            }
            else if(dir==1){
                for(int i=top;i<=bottom;i++)
                    System.out.print(a[i][right]+", ");
                right--;
            }
            else if(dir==2){
                for(int i=right;i>=left;i--)
                    System.out.print(a[bottom][i]+", ");
                bottom--;
            }
            else if(dir==3){
                for(int i=bottom;i>=top;i--)
                    System.out.print(a[i][left]+", ");
                left++;
            }
            dir = (dir+1)%4;
        }
    }
}
