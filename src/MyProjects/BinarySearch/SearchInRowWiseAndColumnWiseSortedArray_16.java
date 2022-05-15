package MyProjects.BinarySearch;

public class SearchInRowWiseAndColumnWiseSortedArray_16 {
    public static void main(String[] args)
    {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        System.out.println(search(mat, 4, 29));
    }

    private static boolean search(int[][] mat, int n, int key) {
        int i=0;
        int j=n-1;
        while(i<=n-1 && j>=0 && i>=0 && j<=n-1){
            if(mat[i][j]==key)
                return true;
            else if(mat[i][j]>key){
                j--;
            }
            else if(mat[i][j]<key){
                i++;
            }
        }
        return false;
    }
}
