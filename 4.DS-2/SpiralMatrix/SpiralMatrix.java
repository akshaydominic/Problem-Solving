import java.util.ArrayList;
public class SpiralMatrix {
    public static void main(String[] args) {
        // int[][] ques = {{1,2,3},{4,5,6},{7,8,9}};
        // Printing2D(ques);
        // ArrayList<Integer> ans = SpiralSolution(ques);
        // System.out.println(ans.toString());
        int[][] re = SolutionSpiral(3);
        Printing2D(re);
    }
    public static void Printing2D(int[][] array){
        int rowlength = array.length, collength= array[0].length;
        for(int row=0;row<rowlength;row++){
            for(int column=0;column<collength;column++){
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }
    }
    
    public static ArrayList<Integer> SpiralSolution(int[][] ques){
        ArrayList<Integer> solution = new ArrayList<>();
        
        if(ques.length==0)
            return solution;
        int rowBegin=0,rowEnd = ques.length-1,columnBegin =0,columnEnd=ques[0].length-1;
        while(rowBegin <= rowEnd && columnBegin<=columnEnd){
            for(int i=columnBegin;i<=columnEnd;i++){
                int element = ques[rowBegin][i];
                solution.add(element);
            }
            rowBegin++;
            for(int i=rowBegin; i<=rowEnd ;i++){
                int element = ques[i][columnEnd];
                solution.add(element);
            }
            columnEnd--;
            if(rowBegin <= rowEnd){
                for(int i=columnEnd; i>= columnBegin;i--){
                    int element = ques[rowEnd][i];
                    solution.add(element);
                }
                rowEnd--;
            }
            if(columnBegin <=columnEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                    int element = ques[i][columnBegin];
                    solution.add(element);
                }
                columnBegin++;
            }

        }
        return solution;
    }
    public static int[][] SolutionSpiral(int n){
        int[][] result= new int[n][n];
        if(n==0){
            return result;
        }
        int rowBegin=0,rowEnd=n-1,columnBegin=0,columnEnd=n-1;
        int index= 1;
        while(rowBegin <=rowEnd && columnBegin<=columnEnd){
            for(int i=columnBegin;i<=columnEnd;i++,index++){
                result[rowBegin][i] = index;
            }
            rowBegin++;
            for(int i=rowBegin; i<=rowEnd;i++,index++){
                result[i][columnEnd] = index;
            }
            columnEnd--;
            if(rowBegin <= rowEnd){
                for(int i=columnEnd ; i>= columnBegin;i--,index++){
                    result[rowEnd][i] = index;
                }
                rowEnd--;
            }
            if(columnBegin <= columnEnd){
                for(int i=rowEnd;i>=rowBegin;i--,index++){
                    result[i][columnBegin]= index;
                }
                columnBegin++;
            }
        }
        return result;

    }

    
}
