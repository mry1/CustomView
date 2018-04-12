package com.example.myapplication.practice;

/**
 * Created by louis2 on 18-2-28.
 */

public enum Singleton {
    INSTANCE;

    public void test() {
        System.out.println("test====");
    }

    public void quickSort(int a[], int low, int high) {
        if (low < high) {
            int middle = getMiddle(a, low, high);
            quickSort(a, 0, middle - 1);
            quickSort(a, middle, high);

        }

    }

    private int getMiddle(int[] a, int low, int high) {
        int temp = a[low];
        while (low < high) {
            while (low < high && a[high] >= temp) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] <= temp) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = temp;

        return low;
    }
}
