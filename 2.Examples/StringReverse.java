class StringReverse{
    public static void main(String[] args) {
        String eg="Hi there!";
        String reverse="";
        char[] reverseString = eg.toCharArray();
        for(int i=eg.length()-1;i>=0;i--){
            reverse +=reverseString[i];
        }
        System.out.println(reverse);
    }
}