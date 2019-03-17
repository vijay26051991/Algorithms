package com.algorithms.search;

public class FindDuplicateElement {
    //Finding duplication element in an array.
//    Time Complexity: n2.
//    Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(new int[]{1, 2, 3, 4, 5, 1});
        System.out.println(System.currentTimeMillis());
    }

    static String findDuplicateNumber(final int[] numberArray) {
        for (int i=0;i<numberArray.length;i++) { // time complexity n
            for (int j=i+1; j< numberArray.length; j++) { //time complexity n
                if (numberArray[i] == numberArray[j]) {
                    return "Duplicate exists + " + String.valueOf(numberArray[i]);
                }
            }
        }
        return null;
    }
}
