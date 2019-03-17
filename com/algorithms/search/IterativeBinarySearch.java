package com.algorithms.search;

public class IterativeBinarySearch {
    /*If we consider searching of a word in a dictionary, in general we directly go some approximate page
      [generally middle page] start searching from that point. If the that we are searching is same
      then we are done with the search. If the page is before the selected pages then apply the same process
      for the first half otherwise apply the same process to the second half. Binary search also works in the
      same way. The algorithm applying such a strategy is referred to as algorithm.*/

//    Time Complexity: O(log n)
//    Space Complexity: O(1)[for iterative algorithm].

    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(BinarySearchIterative(integerArray, integerArray.length, 7));
    }

    static int BinarySearchIterative(int A[], int n, int data) {
        int low = 0;
        int high = n - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2; //To avoid overflow
            if (A[mid] == data)
                return mid;
            else if (A[mid] < data)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
