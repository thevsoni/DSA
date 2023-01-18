package ApnaCollegeDSA;
import java.util.*;
import java.util.LinkedList;

public class Video_31_Queue {
    //array implementation

    static class Queue1{
        static int[] arr;
        static int size;
       static int rear=-1;
        Queue1(int size){
            arr = new int[size];
            this.size=size;
        }
        //checking empty
        public static boolean isEmpty(){
            return rear==-1;
        }
        //add
        public static void add(int data){
            if (rear==size-1){
                System.out.println("queue full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        //dequeue
        public static int remove(){
            if (rear==-1){
                System.out.println("empty queue ");
                return -1;
            }
            int front=arr[0];
            for (int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        //peek, front value
        public static int peek(){
            if (isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
        //getSize
        public static int getSize(){
            int n=0;
            for (int i=0;i<=rear;i++){
                n++;
            }
            return n;
        }
    }
    // implementation using circular array
    static class Queue2{
        static int[] arr;
        static int size;
        static int front=-1;
        static int rear=-1;
        Queue2(int size){
            arr=new int[size];
            this.size=size;
        }
        //checking empty
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        //checking full
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        //enqueue
        public static void add(int data){
            if (isFull()){
                System.out.println("queue is already full");
                return;
            }
            //for 1st element
            if (front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }
        //dequeue
        public static int remove(){
            if (isEmpty()){
                System.out.println("nothing to remove");
                return -1;
            }
            int result=arr[front];
            if (rear==front){
                rear=front=-1;
            }else {
                front=(front+1)%size;
            }
            return result;
        }
        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("this is empty queue");
                return -1;
            }
            return arr[front];
        }

    }
    // Linked List implementation of Queue
    static class Node {
        // dont make int and node as static ,i have this doubt,
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue3{
        static Node head=null;
        static Node tail=null;

        // checking empty node
        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        //enqueue
        public static void add(int data){
            Node newNode = new Node(data);
            //for 1st element
            if (isEmpty()){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        //dequeue
        public static int remove(){
            if (isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if (head==tail){
                head=tail=null;
                return front;
            }
            head=head.next;
            return front;
        }
        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }
    // Q. Queue using two stacks
    static class Queue4{
       static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while (! s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if (isEmpty()){
                System.out.println("empty enque");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if (isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return s1.peek();
        }
        // ArrayDeque class scratch implementation

        static class ArrayDeque2{
            static ArrayList<Integer> al = new ArrayList<>();
            //checking empty
            public static boolean isEmpty(){
                return al.isEmpty();
            }
            //offerFirst
            public static void offerFirst(int data){
                al.add(0,data);
            }
            //offerLast
            public static void offerLast(int data){
                al.add(data);
            }
            //pollFirst
            public static int pollFirst(){
                if (isEmpty()){
                    System.out.println("empty arraydeque");
                    return -1;
                }
                int front = al.get(0);
                al.remove(0);
                return front;
            }
            //pollLast
            public static int pollLast(){
                if (isEmpty()){
                    System.out.println("empty arraydeque");
                    return -1;}
                int last = al.get(al.size()-1);
                al.remove(al.size()-1);
                return last;
            }
            //peekFirst
            public static int peekFirst(){
                if (isEmpty()){
                    System.out.println("empty array Deque");
                    return -1;
                }
                return al.get(0);
            }
            //peekLast
            public static int peekLast(){
                if (isEmpty()) {
                    System.out.println("empty array deque");
                    return -1;
                }
                return al.get(al.size()-1);
            }
            // print
            public static void printArrayDeque(){
                if (isEmpty()) {
                    System.out.println("empty array deque");
                    return ;
                }
                System.out.println(al);
            }
    }

    public static void main(String[] args) {
        // array implementation of Queue
        System.out.println("array implementation of queue");
        Queue1 q1 = new Queue1(5);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        System.out.println("elements are here is = "+ q1.getSize());
        while (!q1.isEmpty()){
            System.out.println(q1.remove());
        }
        System.out.println("elements are here is = "+ q1.getSize());

        //circular array implementation of queue
        System.out.println("circular array implementation of queue");
        Queue2 q2 = new Queue2(5);
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);
        while (!q2.isEmpty()){
            System.out.println(q2.peek());
            q2.remove();
        }

        //LinkedList implementation of queue
        System.out.println("LinkedList implementation of queue");
        Queue3 q3 = new Queue3();
        q3.add(1);
        q3.add(2);
        q3.add(3);
        q3.add(4);
        q3.add(5);
        while (!q3.isEmpty()){
            System.out.println(q3.peek());
            q3.remove();
        }

        //implementation Queue using collections framework
        System.out.println("implementation Queue using collections framework");
        //using linkedList
        System.out.println("using linked List");
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        //using arrayDeque
        System.out.println("using array deque");
        Queue<Integer> qad = new ArrayDeque<>();
        qad.add(1);
        qad.add(2);
        qad.add(3);
        qad.add(4);
        qad.add(5);
        while (!qad.isEmpty()){
            System.out.println(qad.peek());
            qad.remove();
        }

        // Question Queue using 2 stack
        System.out.println("Queue using 2 stack");
        Queue4 q4 = new Queue4();
        q4.add(1);
        q4.add(2);
        q4.add(3);
        q4.add(4);
        q4.add(5);
        while (! q4.isEmpty()){
            System.out.println(q4.peek());
            q4.remove();
        }

        // proper array deque
        System.out.println("implementing ArrayDeque");
        ArrayDeque<Integer> qaad = new ArrayDeque<>();
        qaad.offerFirst(1);
        qaad.offerFirst(0);
        qaad.offerFirst(-1);
        qaad.offerLast(2);
        qaad.offerLast(3);
        System.out.println(qaad);
        System.out.println(qaad.peekFirst());
        System.out.println(qaad.peekFirst());
        System.out.println(qaad.peekLast());
        System.out.println(qaad.peekLast());
        System.out.println(qaad.pollFirst());
        System.out.println(qaad.pollLast());
        System.out.println(qaad);
        System.out.println(qaad.pollFirst());
        System.out.println(qaad.pollFirst());
        System.out.println(qaad.pollFirst());
        System.out.println(qaad);
    //     System.out.println(qaad.getFirst());
    // it throws error
        System.out.println(qaad.peekFirst());


        // ArrayDeque class scratch implementation
        ArrayDeque2 ad = new ArrayDeque2();
        ad.offerFirst(1);
        ad.offerFirst(2);
        ad.offerFirst(3);
        ad.offerFirst(4);
        ad.offerFirst(5);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        ad.offerLast(1);
        ad.offerLast(0);
        ad.offerLast(-1);
        ad.printArrayDeque();
    }
}
    }