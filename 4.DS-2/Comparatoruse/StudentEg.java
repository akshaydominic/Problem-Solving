import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentEg {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.id=1;
        s1.name="Akshay";
        //return result_array.toArray(new int[result_array.size()][]);
        int[] subject_marks ={70,90,90,80,0};
        s1.marks=subject_marks;
        Student s2= new Student();
        s2.id=2;
        s2.name="Jack";
        //return result_array.toArray(new int[result_array.size()][]);
        int[] subject_marks2 ={80,30,60,60,70};
        s2.marks=subject_marks2;
        Student s3= new Student();
        s3.id=3;
        s3.name="Madona";
        //return result_array.toArray(new int[result_array.size()][]);
        int[] subject_marks3 ={35,60,90,90,90};
        s3.marks=subject_marks3;
        Student[] qu = {s1,s2,s3};
        for(Student s:qu){
            System.out.println(s.toString());
        }
        Arrays.sort(qu, new comparemethod());
        System.out.println("after comparing");
        for(Student s:qu){
            System.out.println(s.toString());
        }

    


    }    
}
class comparemethod implements Comparator<Student>{

    @Override
    public int compare(Student s1,Student s2) {

        int sum1 = 0;
        int sum2 = 0;

        for(int i=0;i<5;i++){
            sum1+=s1.marks[i];
            sum2+=s2.marks[i];
        }
        if(sum1 == sum2){
            return s1.name.compareTo(s2.name);
        }
        if(sum1-sum2> sum1){
            return 1;

        }else return -1;
    }    
}
class Student {
    int id;
    String name;
    int marks[] = new int[5];
    @Override
    public String toString() {
        return "Student [id=" + id + ", marks=" + Arrays.toString(marks) + ", name=" + name + "]";
    }


    
}