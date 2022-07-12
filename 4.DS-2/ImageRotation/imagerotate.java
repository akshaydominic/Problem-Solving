import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class imagerotate {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Rotate(matrix);

    }
    public static void Rotate(int[][] matrix){
        // swap with non diagonal elements
        int size = matrix.length;
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }
        // 2 pointer to swap first column to last column
        for(int i=0;i<size;i++){
            for(int j=0;j<size/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][size-1-j];
                matrix[i][size-1-j]=temp;
            }
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
