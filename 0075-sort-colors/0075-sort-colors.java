class Solution {
    public void sortColors(int[] list) {
       for(int i=0;i<list.length-1;i++) {
    		int temp=0;
    		for(int j=0;j<list.length-i-1;j++) {
    			if(list[j]>list[j+1]) {
    				temp=list[j+1];
    				list[j+1]=list[j];
    				list[j]=temp;
    			}
    		}
    	}
        
    }
}