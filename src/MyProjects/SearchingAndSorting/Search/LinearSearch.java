package MyProjects.SearchingAndSorting.Search;

public class LinearSearch {
    public boolean linearSearch(int n, int arr[], int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key)
                return true;
        }
        return false;
    }
}
