package selectinsort;

import java.util.Arrays;

import insertinsort.InsertionSort;

public class SelectionSort extends InsertionSort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr = { 20, 35, -15, 7, 55, 1, -22 };
		selectionSort(myarr);
		System.out.println(Arrays.toString(myarr));
		reset(myarr);


	}
	
	public static void selectionSort(int [] array) {
		
		for(var target = 0; target < array.length-1; target++) {
			
			var minPox = target;
			
			for(var compare = target + 1; compare < array.length; compare++) {
				
				if(array[minPox] >  array[compare]) {
					minPox = compare;
				}
			}
			
			var tempValue = array[target];
			array[target] = array[minPox];
			array[minPox] = tempValue;
		}
	}
	
	public static void reset(int [] array) {
		array = new int [] { 20, 35, -15, 7, 55, 1, -22 };
	}

}
