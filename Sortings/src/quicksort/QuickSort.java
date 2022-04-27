package quicksort;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = { 13, 18, 27, 2, 19, 25 };  
	    int n = a.length;  
	    
	    System.out.println("Before sorting array elements are ");
		printArray(a, n);
		quick(a, 0, n -1);
		
		System.out.println();
		
		System.out.println("After sorting array elements are ");
		printArray(a, n);
		
	}
	
	static int partition (int a[], int start, int end)  
	{  
	    int pivot = a[end]; 
	    int i = (start - 1);  
	  
	    for (int j = start; j <= end - 1; j++)  
	    {  
	        if (a[j] < pivot)  
	        {  
	            i++; 
	            int t = a[i];  
	            a[i] = a[j];  
	            a[j] = t;  
	        }  
	    }  
	    int t = a[i+1];  
	    a[i+1] = a[end];  
	    a[end] = t;  
	    return (i + 1);  
	} 
	
	public static void quick(int a[], int start, int end) 
	{  
	    if (start < end)  
	    {  
	        int p = partition(a, start, end);  
	        quick(a, start, p - 1);  
	        quick(a, p + 1, end);  
	    }  
	}  
	  
	public static void printArray(int a[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	}  
}
