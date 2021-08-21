// int[][] input1 = {
//     {1, 2, 3, 4, 5},
//     {0, 5, 1, 5, 2},
//     {0, 0, 0, 1, 3},
//     {4, 1, 1, 0, 1},
//     {0, 0, 0, 0, 3},
// };

// Output:
// 3   4   5
//     5
// 0   1   3

//return sum;
//loop over the input1 till -
//loop over the input1 till -
//rows n-2
//columns n-2
//without looping input1[0][0] input1[0][1] input1[0][2]
                                //input[1][1] if[i==j]
                //input1[2][0] input[2][1] input1[2][2]
public class Problem{
    public static void main(String[] args) {
        int[][] input1 = {
                {1, 2, 3, 4, 5},
                {0, 5, 1, 5, 2},
                {0, 0, 0, 1, 3},
                {4, 1, 1, 0, 1},
                {0, 0, 0, 0, 3},
            };
        int result = findHourMax(input1);
        System.out.println("the result"+result);
        
    }
    public static int findHourMax(int[][] input){
        int n = input[0].length;
        int tempSum =0;
        int maxSum =0;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                tempSum=input[i][j]+input[i][j+1]+input[i][j+2]+input[i+1][j+1]+
                input[i+2][j]+input[i+2][j+1]+input[i+2][j+2];
                if(tempSum>maxSum){
                    maxSum=tempSum;
                }
            }
            
        }
        return tempSum;

    }
}
