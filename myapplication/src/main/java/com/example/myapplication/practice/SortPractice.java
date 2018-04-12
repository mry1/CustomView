package com.example.myapplication.practice;

/**
 * Created by louis2 on 18-3-1.
 */

public class SortPractice {

    /**
     * 直接插入排序
     *
     * @param a
     */
    public static void insertion_sort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                    a[j] = temp;
                }

            }

        }

        for (int i : a) {
            System.out.println(i + " ");
        }
    }

    /**
     * 冒泡排序
     * @param a
     */
    public static void bubleSort(int a[]) {
        int temp;
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }

        }

        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
