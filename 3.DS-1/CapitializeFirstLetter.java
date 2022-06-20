public class CapitializeFirstLetter {
    public static void main(String[] args) {
        String input = "the quick Brown ";
        String results = Capitalize(input);
        System.out.println(results);
    }

    static String Capitalize(String str){
        char[] results = str.toCharArray();
        boolean isSpace = false;
        for(int letter= 0 ; letter < results.length; letter++){
            if(isSpace){
                results[letter] = Character.toUpperCase(results[letter]);
                isSpace =false;
            }
            if(letter == 0){
                results[0] = Character.toUpperCase(results[0]);
            }
            else if(results[letter] == ' '){
                isSpace = true;
            }
        }
        return new String(results);
    }
}
