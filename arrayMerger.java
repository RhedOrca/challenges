package challenges;

import java.util.*;

class Merger {
	public static void arrayMergerNoSort(int[] A, int[] B) {
		int j=0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] == 0) {
				A[i] = B[j];
				j++;
				if (j==B.length) {
					System.out.println(Arrays.toString(A));
					break;
				}
			}
		}
	}
	public static void arrayMergerSorted(int[] A, int[] B, int Alength) {
		if (A.length != Alength + B.length) throw new IllegalArgumentException();
		int WriteTo=A.length-1;
		int j=B.length-1;
		for (int i = A.length-1; i >= 0; i--) {
			if(A[i] == 0) { continue;}
			while (j >= 0) {
				if (A[i] >= B[j]) {
					A[WriteTo] = A[i];
					WriteTo--;
					break;
				}
					A[WriteTo] = B[j];
					WriteTo--;
					j--;
			}
		}
		System.out.println(Arrays.toString(A));
	}
}
public class Main {

	public static void main(String[] args) {
		int[] listA = new int[] {1,3,5,0,0,0,0};
		int[] listB = new int[] {2,4,6,8};
		Merger.arrayMergerSorted(listA, listB, 3);
	}	
}
