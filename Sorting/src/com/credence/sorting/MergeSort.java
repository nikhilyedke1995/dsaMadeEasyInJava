package com.credence.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {4,6,2,1,8,9,6};
		for(int k: performMergeSort(a))
			System.out.println(k);
	}

	
	public static int[] performMergeSort(int a[]) {
		if(a.length<=1)
			return a;
		int[] left = Arrays.copyOfRange(a, 0, a.length/2);
		int[] right = Arrays.copyOfRange(a, a.length/2, a.length);
	
		performMergeSort(left);
		performMergeSort(right);
		performActualMerger(left,right,a);
		
		return a;
	}


	private static void printMe(int[] a) {
		// TODO Auto-generated method stub
		for(int k: a)
			System.out.println(k);
	}


	private static int[] performActualMerger(int[] left, int[] right, int[] a) {
		// TODO Auto-generated method stub
		int nLeft = left.length;
		int nRight = right.length;
		int nA = a.length;
		int i=0,j=0,k=0;
		
		while(i<nLeft && j<nRight) {
			if(left[i]<right[j]) {
				a[k] = left[i];
				++i;
			}else {
				a[k] = right[j];
				++j;
			}
			++k;
		}
		
		while(i<nLeft) {
			a[k] = left[i];
			++i; ++k;
		}
		
		while(j<nRight) {
			a[k] = right[j];
			++j; ++k;
		}
		
		return a;
	}
	
}
