public class transposematrix {
    public static void main(String[] args) {
        int[][] q ={{1,2,3},{5,6,7},{8,9,10}};
        int[][] ans =TransPoseMat(q);
        
    }
    public static int[][] TransPoseMat(int[][] arr){
        int column = arr[0].length;
        int rows = arr.length;
        int[][] result = new int[column][rows];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                result[j][i] = arr[i][j];
            }
            
        }
        return result;
    }
}
