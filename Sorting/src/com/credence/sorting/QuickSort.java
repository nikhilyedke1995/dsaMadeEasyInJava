package com.credence.sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {3,9,1,7,5};
		for(int k: performQuickSort(a, 0, 4))
			System.out.println(k);
	}
	
	
	
	
	// 3, 9,1,7,5
	
	
	public static int[] performQuickSort(int []a, int low, int high) {
		if(high>low) {
			int pivot = partition(a, low, high);
			performQuickSort(a, low, pivot - 1);
			performQuickSort(a, pivot + 1, high);
		}
		return a;
	}
	
	
	
	
	
	public static int partition(int a[], int low, int high) {
		int pIndex = low; 
		int pivot = a[high];
		for(int i=low; i<high; i++) {
			if(a[i]<=pivot) {
				swap(a,i,pIndex);
				pIndex++;
			}
		}
		swap(a,pIndex,high);
		return pIndex;
	}
	
	public static void swap(int a[], int i, int pIndex) {
		int temp = a[i];
		a[i] = a[pIndex];
		a[pIndex] = temp;
	}

}
