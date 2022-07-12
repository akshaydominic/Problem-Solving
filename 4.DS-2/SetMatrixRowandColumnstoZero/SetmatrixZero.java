import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class SetmatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
       // MatrixZero(matrix);
       sol(matrix);
        
    }
    public static void MatrixZero(int[][] matrix){
        //this approach not working for not square matrix
        int rowlength = matrix.length;
        int collength = matrix[0].length;

        for(int i=0;i<rowlength;i++){
            for(int j=0;j<collength;j++){
                //check if zero 
                if(matrix[i][j]==0){
                    for(int row=0;row<rowlength;row++){
                        matrix[i][row] = -1;
                    }
                    for(int column=0;column<collength;column++){
                        matrix[j][column] = -1;
                    }

                }
            }
        }
        for(int i=0;i<rowlength;i++){
            for(int j=0;j<collength;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<rowlength;i++){
            for(int j=0;j<collength;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    //another approach using in pace markers
    public static void sol(int[][] matrix){
        //make first row and first column as markers but before that if they are any 0
        //present in the first row and first column manage that 
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int Xrow=-1,Ycolumn=-1;
        //Now we manage the first row and column zeros
        for(int i=0;i<colLength;i++){
            if(matrix[0][i]==0){
                Xrow=0;
            }
        }
        for(int i=0;i<rowLength;i++){
            if(matrix[i][0]==0){
                Ycolumn=0;
            }
        }
        // now manage the markers in the first row and column
        for(int i=1;i<rowLength;i++){
            for(int j=1;j<colLength;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        // go through markers and set zeros
        for(int i=1;i<rowLength;i++){
            if(matrix[i][0]==0){
                for(int t=0;t<colLength;t++){
                    matrix[i][t]=0;
                }
            }
        }
        for(int i=0;i<colLength;i++){
            if(matrix[0][i]==0){
                for(int t=0;t<rowLength;t++){
                    matrix[t][i]=0;
                }
            }
        }
        if(Xrow==0){
            for(int i=0;i<colLength;i++){
                matrix[0][i]=0;
            }
        }
        if(Ycolumn==0){
            for(int i=0;i<rowLength;i++){
                matrix[i][0]=0;
            }
        }
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
