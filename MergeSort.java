import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void merge(int[] arrayToSort, int l, int m, int r){
		int n1 = m - l + 1;
		int n2 = r - m;
		
		//temporary arrays
		int L[] = new int [n1];
		int R[] = new int [n2];
		
		for(int i = 0; i < n1; ++i)
	        L[i] = arrayToSort[l + i]; 
	    for (int j = 0; j < n2; ++j)
	    	R[j] = arrayToSort[m + 1 + j]; 
	  	
	    int i=0, j=0;
	    int k = l;
	    
	    while(i < n1 && j < n2) {
	    	if(L[i] <= R[j]) {
	    		arrayToSort[k] = L[i];
	    		i++;
	    	}else {
	    		arrayToSort[k] = R[j];
	    	}
	    	k++;
	    }
        /* Copy remaining elements of L[] if any */
        while (i < n1){ 
            arrayToSort[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2){ 
            arrayToSort[k] = R[j]; 
            j++; 
            k++; 
        } 
	}
	
	public static void sort(int arr[], int l, int r) {
		 if (l < r){ 
			 // Find the middle point 
			 int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
	}

}
