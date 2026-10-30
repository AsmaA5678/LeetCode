class Solution {
    public int[][] sortMatrix(int[][] grid) {
        for(int j=1;j<grid[0].length;j++){
            sortDiagonal(grid,0,j);
        }

        for(int i=0;i<grid.length;i++){
           sortDiagonal(grid,i,0);
        }
        return grid;
    }
    public PriorityQueue<Integer> sortDiagonal(int[][] grid, int i, int j){
        PriorityQueue<Integer> heap;
        if(j>i){
            heap = new PriorityQueue<>();
        }else{
            heap=new PriorityQueue<>(Comparator.reverseOrder());
        }
        int r=i;
        int c=j;
        while(r<grid.length && c<grid[0].length){
            heap.offer(grid[r][c]);
            r++;
            c++;
        }

        r=i;
        c=j;
        while(r<grid.length && c<grid[0].length){
                grid[r][c]=heap.poll();
                r++;
                c++;
        }

        return heap;
    }
}