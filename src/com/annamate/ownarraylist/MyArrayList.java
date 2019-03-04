package com.annamate.ownarraylist;

import java.util.Arrays;

public class MyArrayList {

    public static void add(int[] arr, int index, int element) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        if (index > arr.length) {
            return;
        }

        for (int i = index; i < arr.length; i++) {
            int tmp = arr[i];
            arr[i] = element;
            element = tmp;
        }

        arr = Arrays.copyOf(arr, arr.length + 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void remove(int[] arr, int index) {
        if (index > arr.length) {
            return;
        }

        for (int i = index; i < arr.length - 1; i++) {
            int tmp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = tmp;
        }

        arr = Arrays.copyOf(arr, arr.length - 1);

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void clear(int[] arr) {
        arr = Arrays.copyOf(arr, 0);

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Length of array after clear " + arr.length);
    }

    public static int size(int[] arr) {
        return arr.length;
    }

    public static int get(int[] arr, int index) {
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 1, 0, -1};
        add(arr, 2, 3);

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        remove(arr, 2);
        clear(arr);

        System.out.println("Size of array: " + size(arr));
        System.out.println("Get element: " + get(arr, 0));
    }
}
