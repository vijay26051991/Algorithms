package com.algorithms.search;

public class RecursiveBinarySearch {

    public static void main(String[] args) {
        int[] integerArray = {1, 9, 2, 4, 9, 1};
        System.out.println(doRecursiveBinarySearch(integerArray, 0, integerArray.length - 1, 9));
    }

    static int doRecursiveBinarySearch(int[] integerArray, int low, int high, int data) {
        int mid = low + (high - low) / 2;
        if (integerArray[mid] == data) {
            return mid;
        } else if (integerArray[mid] < data) {
            return doRecursiveBinarySearch(integerArray, mid + 1, high, data);
        } else {
            return doRecursiveBinarySearch(integerArray, low, mid - 1, data);
        }
    }

}