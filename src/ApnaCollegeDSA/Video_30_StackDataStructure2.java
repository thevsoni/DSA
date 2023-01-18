package ApnaCollegeDSA;


import java.util.Stack;

// stack implementation using collections framework
public class Video_30_StackDataStructure2 {
    //Q. push element at bottom

    public static void f(Stack<Integer> s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.peek();
        s.pop();
        // int top=s.pop();
        f(s,data);
        s.push(top);
    }
    //Q.reverse a stack
    // in scratch implimentation ,in linkedlist stack we can create a function to reverse a linkedlist and as well in arraylist also we can create a function for reversing
    //but in collections we r going to look
    public static void f2(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top=s.pop();
        f2(s);
        f(s,top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        //Q. push element at bottom
        System.out.println("pushing data at a bottom");
        int data=5;
        f(s,data);
        System.out.println("reversing a stack");
        f2(s);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}
