package MyProjects.Heap;

//https://www.geeksforgeeks.org/sum-elements-k1th-k2th-smallest-elements/

public class SumOfElementsBetweenK1SmallestAndK2SmallestNumbers_9 {
    public static void main(String[] args)
    {

        int arr[] = { 20, 8, 22, 4, 12, 10, 14 };
        int k1 = 3, k2 = 6;
        int n = arr.length;

        System.out.print(sumBetweenTwoKth(arr, k1, k2));
    }

    private static int sumBetweenTwoKth(int[] arr, int k1, int k2) {
        int k1Smallest = kthSmallestElement_1.kthSmallest(arr,arr.length,k1);
        int k2Smallest = kthSmallestElement_1.kthSmallest(arr,arr.length,k2);

        int sum = 0;
        for(int i: arr){
            if(k1Smallest<i && i<k2Smallest){
                sum+=i;
            }
        }
        return sum;
    }
}
