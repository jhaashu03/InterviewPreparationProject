package MyProjects.SearchingAndSorting;

import MyProjects.SearchingAndSorting.Search.ArrayWhoseSumIsClosetToX;
import MyProjects.SearchingAndSorting.Sorting.*;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter Array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        //searching
        System.out.println("Enter Key");
        int key = sc.nextInt();

        /*System.out.println("Linear MyProjects.SearchingAndSorting.Search");
        LinearSearch ls = new LinearSearch();
        System.out.println(ls.linearSearch(n,arr,key));

        System.out.println("Binary MyProjects.SearchingAndSorting.Search");
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(0,n-1,arr,key));*/

        //sorting
        InsertionSort is = new InsertionSort();
        //is.insertionSort(n,arr);

        BubbleSort bubbleSort = new BubbleSort();
        //bubbleSort.bubbleSort(n,arr);

        MergeSort mergeSort = new MergeSort();
        //mergeSort.mergeSort(arr);
        //mergeSort.print(arr);

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr,0,n);
        quickSort.print(arr);

        KthSmallestElement kthSmallestElement = new KthSmallestElement();
        //kthSmallestElement.kthSmallestElement(arr,n,key);

        ArrayWhoseSumIsClosetToX arrayWhoseSumIsClosetToX = new ArrayWhoseSumIsClosetToX();
        //arrayWhoseSumIsClosetToX.arrayWhoseSumIsClosetToX(arr, n, key);
    }
}
