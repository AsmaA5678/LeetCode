class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        heapSort(citations); 
        int s = 0;
        int h = 0; 
        for (int i = 0; i < n; i++) {
            s = n - i;
            if (citations[i] >= s) {
                h = s; 
                break; 
            }
        }

        return h;

       
    }
    public static void heapify(int arr[], int n, int i) { //n current size of the heap
    	int largest = i;
    	int l = 2*i+1;
    	int r=2*i+2;
    	if(l<n && arr[l]>arr[largest]) {
    		largest=l;
    	}
    	if(r<n && arr[r]>arr[largest]) {
    		largest=r;
    	}
    	if( largest!=i ) {
    		int temp=arr[i];
    		arr[i]=arr[largest];
    		arr[largest]=temp;
    		heapify(arr,n,largest);
    	}
    	
    }
    public static void heapSort(int[] arr) {
       int n=arr.length;
       for(int i=n/2-1;i>=0;i--) {
    	   heapify(arr,n,i);
       }
       for(int i=n-1;i>=0;i--) {
    	   int temp=arr[0];
    	   arr[0]=arr[i];
    	   arr[i]=temp;
    	   heapify(arr,i,0);
       }
    }
}
