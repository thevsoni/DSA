package NewtonSchool;
import java.util.*;

public class Harsh_Project {
    static class Node{
        int rollNumber;
        String name;
        int age;
        int className;
        String stream;
        Node(int rollNumber,String name,int age,int className,String stream){
            this.rollNumber=rollNumber;
            this.name=name;
            this.age=age;
            this.className=className;
            this.stream=stream;
        }


    }
    public static void main(String[] args) {

        //Student Information Management

        /*
            here we will get student information using his unique id and also able to update their information
         */

        HashMap<Integer,Node> hm = new HashMap<>();
        hm.put(1,new Node(970,"vishal soni",23,17,"maths honours"));
        hm.put(2,new Node(971,"hasha",17,12,"maths"));
        hm.put(3,new Node(972,"shivanshu",24,18,"information technology"));
        //like this we can add any student info using their unique id

        //now lets get output student info
        System.out.println(hm.get(1).age);
        System.out.println(hm.get(2).name);
        System.out.println(hm.get(3).stream);

        //we can update details also
        //like currently harsha is studying in 12th but next year she will enter in 13 so
        System.out.println(hm.get(2).className);
        hm.get(2).className = 13;
        System.out.println(hm.get(2).className);
    }
}
