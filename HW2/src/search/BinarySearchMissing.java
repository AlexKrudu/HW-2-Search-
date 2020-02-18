package search;

import java.util.ArrayList;

public class BinarySearchMissing {
    public static void main(String[] args) {
        int elem = Integer.parseInt(args[0]);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            arr.add(Integer.parseInt(args[i]));
        }
        int res = IterativeSearch(arr, elem);
        System.out.println(res);
    }

    // Pre: arr sorted in non-growing order(∀ i, j ∈ [0..arr.size()) : i >= j -> a[i] <= a[j])
    private static int IterativeSearch(ArrayList<Integer> arr, int elem) {
        int l = -1, r = arr.size(), m;
        // l = -1, r = arr.size(), and a[arr.size()] = -∞.
        // I: arr[l] > elem >= arr[r] || elem not in arr
        while (l < r - 1) {
            // I and l < (r - 1)
            m = (l + r) / 2;
            // I and l < m < r
            if (arr.get(m) <= elem) {
                r = m;
                // (elem >= a[m] && r=m) -> I
            } else {
                l = m;
                // (elem < a[m] && l=m) -> I
            }
        }
        // (l = r - 1 & I) -> r is minimal index that maintains task. (arr[r-1] > elem)
        if (arr.size() != 0 && arr.get((l + 1) % arr.size()) == elem) {
            return l + 1;
        } else {
            return -(r + 1);
        }

    }
}

