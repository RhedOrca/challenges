package challenges;

import java.util.*;

class Merger {
	public static void arrayMerger(int[] A, int[] B) {
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
}
public class Main {

	public static void main(String[] args) {
		int[] listA = new int[] {1,2,3,0,0,0,0};
		int[] listB = new int[] {4,5,6};
		Merger.arrayMerger(listA, listB);
	}	
}
