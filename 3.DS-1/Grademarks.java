import java.rmi.MarshalledObject;
import java.util.ArrayList;

import javax.lang.model.util.ElementScanner6;

public class Grademarks {
    public static void main(String[] args) {
        String result = gradingSystem(100);
        System.out.print("Results : "+result);
    }
    static String gradingSystem(float marks) {
        
        String result = "";    
        if(marks >= 0 && marks < 25){
            result="F";
        }
        else if(marks >= 25 && marks < 45){
            result="E";
        }
        else if(marks >= 45 && marks < 50){
            result="D";
        }
        else if(marks >=50 && marks < 60 ){
            result = "C";
        }
        else if(marks >= 60 && marks < 80){
            result = "B";
        }
        else if(marks >= 80 && marks <= 100){
            result ="A";
        }
        else{
            result ="Invalid";
        }
        return result;
    }
}

