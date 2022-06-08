public class CountVowels {
    public static void main(String[] args) {
        String input = "language";
        int results = CalculateCountOfVowels(input);
        System.out.println(results);
    }

    static int CalculateCountOfVowels(String input){
        int Count = 0;
        for(int index =0 ;index<input.length();index++){
            if(input.charAt(index) == 'a' || input.charAt(index)=='A'){
                Count++;
            }
            else if(input.charAt(index) == 'e' || input.charAt(index)=='E'){
                Count++;
            }
            else if(input.charAt(index) == 'i' || input.charAt(index)=='I'){
                Count++;
            }
            else if(input.charAt(index) == 'o' || input.charAt(index)=='O'){
                Count++;
            }
            else if(input.charAt(index) == 'u' || input.charAt(index)=='U'){
                Count++;
            }

        }
        return Count;
    }
}
