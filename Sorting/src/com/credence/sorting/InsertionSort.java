package com.credence.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = new int[] {5,2,9,1,7};
		for(int i : performInsertionSort(a)){
			System.out.println(i);
		}
	}
	
	public static int[] performInsertionSort(int []a) {
		
		for(int i=1; i<a.length; i++) {
			int value = a[i];
			int hole = i;
			while(hole>0 && a[hole-1]>value) {
				a[hole] = a[hole-1];
				--hole;
			}
			
			a[hole] = value;
		}
		
		return a;
	}

}
