package MyProjects.SearchingAndSorting.Sorting;

import java.util.*;

public class KthSmallestElement {
    int count = 0;

    public void kthSmallestElement(int arr[], int n, int k) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.get(arr[i]) == null ? 1 : map.get(arr[i]) + 1);
        }
        System.out.println("Kth smallest element:");
        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            count++;
            if (count == k) {
                System.out.println(element.getKey());
            }

        }
        //System.out.println(map);
    }
}
