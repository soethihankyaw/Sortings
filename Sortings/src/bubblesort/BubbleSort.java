package bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		int [] array = {3,60,35,2,45,32,5};
		
		System.out.println("Before Sorting : ");
		for (var i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		bubbleSort(array);
		System.out.println("After Sorting : ");
		for (int a : array) {
			System.out.print(a + " ");
		}
	}
	
	public static void bubbleSort(int [] array) {
		
		var temp = 0;
		for(var i = 0; i < array.length; i ++) {
			for(var j = 1; j < (array.length-i); j++) {
				
				if(array[j-1] > array[j]) {
					
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
