//Lecture-6

package MyProjects.DP.KnapSack;

public class CountTheNumberOfSubsetWithAGivenDifference {
    public static void main(String[] args)
    {
        int arr[] = { 1,1,2,3 };
        int n = arr.length;
        int diff = 1;

        System.out.println("Count of minimum difference between 2 sets is " + findCount(arr, n,diff));
    }

    public static int findCount(int[] arr, int n, int diff) {
        /*
        * s1 and s2 are the two subset of arr
        * we need to find out count for s2-s1=diff i.e s1-s2=1 ---eq1
        * we know that s2+s1=ArraySum i.e s1+s2 = 7 ---eq2
        * eq1+eq2 => 2s1 = diff+sum i.e s1 = (diff+sum)/2 i.e 2s1 = 8 => s1= 4
        * so the problem reduce to Count Of Subset Problem i.e find count of subset in array arr with sum
        * equals to 4
        * */
        int sum = 0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        int s1 = (diff+sum)/2;
        return CountOfSubsetsWithSumEqualToX.findCount(arr,s1,n);
    }
}
