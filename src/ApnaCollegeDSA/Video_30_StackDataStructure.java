package ApnaCollegeDSA;

import java.util.ArrayList;
import java.util.Stack;

public class Video_30_StackDataStructure {
    public static int size;

    static class Node{
       static int data;
       static Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    static class Stack{
        Stack(){
            size=0;
        }
        public int getSize(){
            return size;
        }
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        //push
        public static void push(int data){
            Node newNode =new Node(data);
            if (isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }
        //pop
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            size--;
            int top = head.data;
            head=head.next;
            return top;
        }
        //peek
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }
        //bottom

        public static void bottom(int data){
            Node newNode =new Node(data);
            while (isEmpty()){
                head=newNode;
                return;
            }
            Node current = head;
            while (current.next != null){
                current=current.next;
            }
            current.next = newNode;
        }

        // reverse a stack
        public static Node reverseAStack(){
            System.out.println("reverse a stack in linkedList");
            if (isEmpty()){
                return head;
            }
            Node previous = null;
            Node current = head;
            while (current != null){
                Node next = current.next;
                current.next = previous;
                // update
                previous=current;
                current=next;
            }
            return previous;
        }
    }
    static class Stack2{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static int getSize(){
            return list.size();
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //bottom

        public static void bottom(int data){
            list.add(0,data);
        }
        //pop
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        //using linkedlist
        System.out.println("using linked list");
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        // add in bottom
        s.bottom(7);

        System.out.println("reversing a stack");
        s.head = s.reverseAStack();

        System.out.println("using loop getting data and deleting data");
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        // using arraylist
        System.out.println("using arraylist");
        Stack s2 = new Stack();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        System.out.println(s2.pop());
        System.out.println(s2.peek());
        s2.push(3);
        s2.push(4);
        s2.push(5);
        s2.push(6);


        //add in bottom
        s2.bottom(8);

        System.out.println("using loop getting data");
        while (!s2.isEmpty()){
            System.out.println(s2.peek());
            s2.pop();
        }

        //using collection frameworks

    }
}
/*

public class Practice {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    while (s.isEmpty()==false){
      System.out.println(s.pop());
    }
//or
  /*  while (s.isEmpty()==false){
      System.out.println(s.peek());
      s.pop();
    }

  }
          }
*/