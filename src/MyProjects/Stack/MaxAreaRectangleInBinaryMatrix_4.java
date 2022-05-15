package MyProjects.Stack;

import java.util.Arrays;

/*
* { 0, 1, 1, 0 }  -- > 0 1 1 0 ->arr1
  { 1, 1, 1, 1 }  -->  1 2 2 1 ->arr2 --> Add first 2
  { 1, 1, 1, 1 }  --> 2 3 3 2  ->arr3   ==> bulding of height 2, 3, 3 and 2 and in this case this is the ans
  { 1, 1, 0, 0 }  --> 3 4 0 0  ->arr4   ==> if we ecounter 0 don't include kyoki puri building nhi aa rahi ground nhi hai
  *
  * return max of(arr1,arr2,arr3,arr4)
  * */
public class MaxAreaRectangleInBinaryMatrix_4 {
    public static void main(String[] args)
    {
        int R = 4;
        int C = 4;

        int[][] t = new int[R][C];

        int A[][] = {
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 },
        };

        //instead of making individual array from each row I updated the matrix itself
        for(int i=1;i<R;i++){
            for(int j=0;j<C;j++){
                if(A[i][j]==0)
                    A[i][j] = 0;
                else
                    A[i][j]= A[i][j]+A[i-1][j];
            }

        }

        /*for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(A[i][j]+" ");
            }
           System.out.println();
        }*/
        System.out.print("Area of maximum rectangle is "
                + maxRectangle(R, C, A));
    }

    private static int maxRectangle(int r, int c, int[][] a) {
        /*ArrayList<Integer> l = new ArrayList<>();
        for (int[] row : a){
            l.add(row)
        }
        *  */
        int max = 0;
        for (int[] row : a){
            max = Math.max(MaximumAreaHistogram_3.getMaxArea(row,c),max);
        }
        return max;
    }
}
