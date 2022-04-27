package quicksort;

public class QuickSort {

	public static void main(String[] args) {
		
	}
	
	int partition (int a[], int start, int end)  
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
}
