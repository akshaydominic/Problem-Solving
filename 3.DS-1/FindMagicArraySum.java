public class FindMagicArraySum {
    public static void main(String[] args) {
        int[][] input = new int[][]{{16,2,3,13},{5,11,10,8},{9,7,6,12},{4,14,15,1}}; 
        String result = FindMagicArray(input, 4);
        System.out.println(result);
    }

    private static String FindMagicArray(int[][]grid, int n) {
        int totalSumRow = 0 , totalSumColumn = 0,totalSumDiagonal = 0;


        for(int row=0;row<n;row++){
            for(int columns=0;columns<n;columns++){
                totalSumRow+= grid[row][columns];
            }
               
        }
        for(int row=0;row<n;row++){
            for(int columns=0;columns<n;columns++){
                totalSumColumn += grid[columns][row];
            }
        }
        for(int rowAndColumn = 0; rowAndColumn<n;rowAndColumn++){
            totalSumDiagonal += grid[rowAndColumn][rowAndColumn];
        }
        totalSumColumn = totalSumColumn/grid[0].length;
        totalSumRow = totalSumRow /grid[0].length;


        System.out.println(totalSumColumn +" "+totalSumRow+" "+totalSumDiagonal);
        if((totalSumRow == totalSumColumn) && (totalSumDiagonal == totalSumColumn)){
            return "Yes";
        }
        else
            return "No";
    }
}
