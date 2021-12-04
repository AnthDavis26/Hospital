package com.solvd.hospital.utils;

public class MergeSort {
    public static void sort(int arr[], int n)
    {
        if (n < 2)
            return;

        int m = n / 2;
        int left[] = new int[m];
        int right[] = new int[n - m];

        for (int i = 0; i < m; i++)
            left[i] = arr[i];

        for (int i = m; i < n; i++)
            right[i - m] = arr[i];

        sort(left, m);
        sort(right, n - m);
        merge(arr, left, right, m, n - m);
    }

    private static void merge(int arr[], int left[], int right[], int l, int r)
    {
        int i = 0, j = 0, k = 0;

        while (i < l && j < r)
        {
            if (left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i < l)
            arr[k++] = left[i++];

        while (j < r)
            arr[k++] = right[j++];
    }
}