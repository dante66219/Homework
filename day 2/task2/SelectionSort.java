package com.task2;

public class SelectionSort {



        public static void main(String[] args) {

           int [] a = {33, 5, 22, 43, 12, 93, 4};

            printArray(a);
            SelectionSortArray(a);
            printArray(a);

        }




    private static void printArray(int []a) {

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void SelectionSortArray(int [] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                min = SearchMin(a, min, j);
                SwapValue(a, i, min);
            }

        }

    }

    private static int SearchMin(int[] a, int min, int j) {
        if (a[min] > a[j]){
            min = j;
        }
        return min;
    }

    private static void SwapValue(int[] a, int i, int min) {
        int temp = a[min];
        a[min] = a[i];
        a[i] = temp;
    }



}
