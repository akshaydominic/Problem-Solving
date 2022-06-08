public class Adding2Matrices {
    public static void main(String[] args) {
        int[][] gridInput1 =  new int[][]{{1,2},{3,4}};
        int[][] gridInput2 = new int[][]{{1,1},{1,1}};

        int[][] Result = Calculate(gridInput1,gridInput2,2,2);
        for(int row=0;row<2;row++){
            for(int column= 0;column<2;column++){
                System.out.print(Result[row][column]);
            }
            System.out.println();
        }
    }
    static int[][] Calculate(int[][] gridOne, int[][] gridTwo,int n,int m){
        int[][] ResultGrid = new int[n][m];
        for(int row=0;row<n;row++){
            for(int column=0;column<m;column++){
                ResultGrid[row][column] = gridOne[row][column] + gridTwo [row][column];
            }
        }
        return ResultGrid;
        
    }
}
