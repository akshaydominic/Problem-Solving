public class FIndtheQuadrant {
    public static void main(String[] args) {
        float x=-10, y=20;
        int result = findQuadrant(x, y);
        System.out.print("Quadrant : "+result);
    }
    public static int findQuadrant(float x, float y){
        if(x == 0){
            return 0;
        }
        if(x>0){
            return (y>0)?1:4;
        }else{
            return (y>0)?2:3;
        }
    }
}
