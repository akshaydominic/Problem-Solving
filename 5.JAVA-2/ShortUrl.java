public class ShortUrl {
    
        public static void main(String[] args) {
            build_short_url();
            
        }
    
        public static String generate_random(){
            int Math_random_number = (int)Math.random()*100;
            char ch= (char) ('A'+ Math_random_number);
            String re = "";
            re+=ch;
            return re;
        }
        public static void gen_number(){
            for(int i=0;i<3;i++){
                double r1 = Math.floor(Math.random()*(57-48)+48);
                double r2 = Math.floor(Math.random()*(90-65)+65);
                double r3 = Math.floor(Math.random()*(122-97)+97);
                int result1 = (int)r1;
                int result2 = (int)r2;
                int result3 = (int)r3;
                System.out.println(result1);
                System.out.println(result2);
                System.out.println(result3);
            }
        }
        public static void displayAlphaNumeric(){
            int a= 'a';
            int z='z';
            int A='A';
            int Z='Z';
            int zero = '0';
            int nine = '9';
            System.out.println("a: "+a+" z: "+z);
            System.out.println("A: "+A+" Z: "+Z);
            System.out.println("0: "+ zero +" 9 :"+nine);
        }
    
        public static void build_short_url(){
           
            String url="http://localhost/";
            for(int i=0;i<3;i++){
                double unique1= Math.floor(Math.random()*('z'-'a')+'a');
                double unique2= Math.floor(Math.random()*('Z'-'A')+'A');
                double unique3= Math.floor(Math.random()*('9'-'0')+'0');
                int result1 = (int)unique1;
                int result2= (int)unique2;
                int result3= (int)unique3;
                url+=(char)result1;
                url+=(char)result2;
                url+=(char)result3;
                // System.out.println(result1);
                // System.out.println(result2);
                // System.out.println(result3);
            }
            System.out.println("Url "+url);
        }
    }
    

