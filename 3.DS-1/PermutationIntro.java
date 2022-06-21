public class PermutationIntro {
    public static void main(String[] args) {

        int[] permutation = {2,4,3,1};
        int n = 4;
        String str = "abcd";
        String result = PermutationIntroSol(permutation, n, str);
        System.out.print("result "+result);
        
    }
    // [2,4,3,1], //"abcd" //---------------"dacb".
    public static String PermutationIntroSol(int[] permutation,int n,String str){
       Character[] result = new Character[n];
       String ans="";
       for(int index=0;index<n;index++){
            int elementatPosition = permutation[index];
            char element = str.charAt(index);
            result[elementatPosition-1] = element;
       }
      for(int i=0;i<n;i++){
        ans+=result[i];
      }
      return ans;
    }
}
