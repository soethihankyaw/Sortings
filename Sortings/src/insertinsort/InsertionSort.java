package insertinsort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] myarr = { 20, 35, -15, 7, 55, 1, -22 };
		
		insertionSort(myarr);
		System.out.println(Arrays.toString(myarr));

	}
	
	protected static void insertionSort(int [] array) {
		
		for(int i = 1; i < array.length; i++) {
			int target = array[i], j;
			
			for(j = i; j > 0 && array[j-1] > target; j-- ) {
				array[j] = array[j-1];
				
			}
			
			array[j] = target;
		}
		
	}

}
