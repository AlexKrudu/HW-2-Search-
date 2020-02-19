package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class BinarySearch {
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
        // l = -1, r = arr.size(), and arr[arr.size()] = -∞ and arr[-1] = +∞ .
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
        return r;
    }
    // Post: r = min[0..arr.size()]: a[r] <= elem
    //       Arr does not change


    // Pre: arr sorted in non-growing order(∀ i, j ∈ [0..arr.size()) : i >= j -> a[i] <= a[j]) && l = -1 && r = arr.size()
    // I: arr[l] > elem >= arr[r] || elem not in arr
    private static int RecursiveSearch(ArrayList<Integer> arr, int elem, int l, int r) {
        int m = (l + r) / 2;
        // I and l < m < r
        if (!(l < r - 1)) {
            return r;
            // (l = r - 1 & I) -> r is minimal index that maintains task. (arr[r-1] > elem)
        } else {
            if (arr.get(m) <= elem) {
                return RecursiveSearch(arr, elem, l, m);
                // (elem >= a[m] && r=m) -> I
            } else {
                return RecursiveSearch(arr, elem, m, r);
                // (elem < a[m] && l=m) -> I
            }
        }
    }
    // Post: r = min[0..arr.size()]: a[r] <= elem
    //       Arr does not change

}
