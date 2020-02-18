package search;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class BinarySearch {
    public static void main(String[] args) {
        int elem = Integer.parseInt(args[0]);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            arr.add(Integer.parseInt(args[i]));
        }
        int res = RecursiveSearch(arr, elem, -1, arr.size());
        System.out.println(res);
    }


    private static int IterativeSearch(ArrayList<Integer> arr, int elem) {
        int l = -1, r = arr.size(), m;
        while (l < r - 1) {
            m = (int) Math.ceil((double) (l + r) / 2);
            if (arr.get(m) <= elem) {
                r = m;
            } else {
                l = m;
            }
        }
        return l + 1;
    }

    private static int RecursiveSearch(ArrayList<Integer> arr, int elem, int l, int r) {
        int m = (int) Math.ceil((double) (l + r) / 2);
        if (!(l < r - 1)) {
            return l + 1;
        } else {
            if (arr.get(m) <= elem) {
                return RecursiveSearch(arr, elem, l, m);
            } else  {
                return RecursiveSearch(arr, elem, m, r);
            }
        }
    }
}
