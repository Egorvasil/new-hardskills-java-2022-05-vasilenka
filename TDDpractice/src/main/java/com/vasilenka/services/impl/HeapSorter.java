package com.vasilenka.services.impl;

import com.vasilenka.services.Sorter;

public class HeapSorter implements Sorter {
    public void sort(int[] arr) { // Test method
        if (arr == null || arr.length == 0) {
            throw new RuntimeException();
        }
        buildHeap(arr);
        for (int i = arr.length-1; i >= 0 ; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    private void buildHeap(int [] arr){
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }
    }

    private void heapify(int [] arr, int heapSize, int i){
        int largest = i;
        int leftChild = 2 * i +1;
        int rightChild = 2  *i +2;

        if (leftChild < heapSize && arr[leftChild] > arr[largest]){
            largest = leftChild;
        }

        if (rightChild < heapSize && arr[rightChild] > arr[largest]){
            largest = rightChild;
        }

        if (largest != i){
            swap(arr, i, largest);
            heapify(arr, heapSize, largest);
        }
    }

    private void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
