package codewithharry;

import org.w3c.dom.ls.LSOutput;
import java.util.EventListener;
import java.util.Random;
import java.util.Scanner;
import java.util.*;


// video 93 : ArrayDequeue
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(1);
        ad1.add(2);
        ad1.add(3);
        ad1.addFirst(0);
        ad1.addLast(4);
        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());



        // taking example to compare with arraylist and with linkedList
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(0);
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(0);
        ll1.addFirst(-1);
        ll1.addLast(-1);
        System.out.println(ll1);
        System.out.println(ll1.getFirst());
    }
}
/*
// video 92 : LinkedList
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.addFirst(9);
        ll.addLast(9);
        System.out.println(ll);
        ll.remove(0);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
}

// video 91 : ArrayList

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();
        //initial capacity
//        ArrayList<Integer> set2 = new ArrayList<>(5);

        // add method
        set2.add(00);
        set2.add(11);
        set2.add(22);

        //addAll method
        set.addAll(set2);

        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set2.addAll(set);

        //get method
        for (int i=0;i< set.size();i++){
            System.out.print(set2.get(i));
        }
        System.out.println();
        set.add(5);
        set.add(0,9);

        for (int i=0;i< set.size();i++){
            System.out.print(set.get(i));
        }
        System.out.println();

        ArrayList<Integer> set3 = new ArrayList<>();
        set3.add(111);
        set3.add(222);
        set3.add(333);
        set3.add(444);

        // clear method
//        set3.clear();
//        System.out.println("size of set3 is "+set3.size());

        for (int c:set3){
            System.out.print(c);
        }
        System.out.println();


        set.addAll(0,set3);
        for (int c:set){
            System.out.print(c);
        }
        System.out.println();

        //clone() method  but i do not how it works
        set3.clone();

        //contains() method
        System.out.println(set.contains(555));
        System.out.println();

        //indexOf() ,lastIndexOf method
        ArrayList<Integer> set4 = new ArrayList<>();
        set4.add(1);
        set4.add(2);
        set4.add(3);
        set4.add(4);
        set4.add(5);
        set4.add(4);

        System.out.println(set4.indexOf(3));
        System.out.println(set4.indexOf(4));
        System.out.println(set4.lastIndexOf(4));

        //remove() method
        set4.remove(0);
        System.out.println(set4.get(0));

        // set() method
        set4.add(0,1);
        System.out.println(set4.get(0));
        System.out.println(set4.get(1));

        set4.set(0,9);
        System.out.println(set4.get(0));

        //toArray()  i do not know usage of this
        set4.toArray();

        //isEmpty
        System.out.println(set4.isEmpty());

    }

}

// video 90 how to view java documentation
theory


// video 89 collection hierarchy in java
   theory about java.util.collection
// video 88 java collections framework

//theory

// video 87 exercise 6 custom calculator
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the first number =");
        int a =sc.nextInt();

        System.out.println("enter the operation =");
        char op=sc.next().charAt(0);

        System.out.println("enter the second number =");
        int b =sc.nextInt();
        if (a>100000||b>100000){
            try{
                throw new Exception("error  hai bro ! dubara try kar le");
            }catch (Exception e){
                System.out.println(e.getMessage());
                return;
            }
        }

        if (op=='+'){
            System.out.println(a+b);
        } else if (op=='-') {
            System.out.println(a-b);
        } else if (op=='*') {
            if (a>7000||b>7000){
                try{
                    throw new Exception("input value 7000 se jada hai bro multiply ke liye,memory bhar jayega pls retry with small value");
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    return;
                }
            }
            System.out.println(a*b);
        }else if (op=='/'){
            try{
                System.out.println(a/b);
            }catch(Exception e){
                System.out.println(e);
            }
        }else {
            System.out.println("pls enter valid operation");
        }
    }
}

// video 86 practice set on errors and exceptions

// question 3,4,5
class MyException extends Exception{
    @Override
    public String toString() {
        return "i am in toString";
    }

    @Override
    public String getMessage() {
        return "i am in get message";
    }
}
public class Main{
    public static int f1(int n) throws Exception{
        if (n==0){
            throw new MyException();
        }
        return n;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        for (int i=0;i< array.length+3;i++){
            if (i>= array.length){
                try{
                    throw new MyException();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    System.out.println(e);
                    System.out.println(e.toString());
                }
            }
            try{
                System.out.println(array[i]);
            }catch (Exception e){
                System.out.println("error");
            }
        }
        int a=10;
        try{
            System.out.println(f1(0));
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}


// question 1 and 2
public class Main {
    public static void main(String[] args) {
        int a =10;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number = ");
        try{
            int b = sc.nextInt();
            System.out.println(a/b);
            return;
        }catch(ArithmeticException e){
            System.out.println("Hello");
        }catch (Exception e){
            System.out.println("illegal arguement");
        }
        finally {
            System.out.println("i am finally");
        }

        System.out.println("i am outsider");
    }
}

// video 85 finally block in java and why is it needed! 27-9-22

public class Main {
    public static void main(String[] args) {
        int a=18;
        int b=0;
        try{
            System.out.println(a/b);
        }
        finally {
            System.out.println("hi bro i am in finally");
            int e=9;
            int f=7;
            System.out.println(e*f);
        }
        System.out.println("i am outsider");
    }
}

public class Main {
    public static void main(String[] args) {
        int a=10;
        int b =5;
        while (true){
            try{
                System.out.println(a/b);
            }catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("i am finally code");
            }
            b--;

        }
    }
}

public class Main{
    public static int f1(){
        int a=10;
        int b=2;
        try{
            int c=a/b;
            return c;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("ji");

        }
        System.out.println("hiii");
return 0;



    }
    public static void main(String[] args) {
        System.out.println(f1());
    }
}

// video 84throw vs throws in java

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "radius can not be negative 1";
    }

    @Override
    public String getMessage() {
        return "radius can not be negative 2";
    }
}

public class Main {
    public static double area(int r) throws NegativeRadiusException{
        int a=5;
        int b=0;
        if (b==0){
            try{
                throw new NegativeRadiusException();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e);
        }
        if (r<0){
            throw new NegativeRadiusException();
            // aisa krne se jb radius negative ho direct bata denge ki radius negative hai
            // nahi to area negative milega joki sahi nahi hai.
        }
        return  Math.PI*r*r;

    }
    public static int divide(int a,int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args){
        int a=10;
        Scanner sc = new Scanner(System.in);
        int b=0;
        try{
            b = sc.nextInt();
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            int c = divide(a,b);
            System.out.println(c);
        }
        catch (Exception e){
         //   System.out.println(e);
            System.out.println("exception throws");
        }
        System.out.println("enter your radius to get area = ");
        int r = sc.nextInt();
        try {
            System.out.println(area(r));
        }catch (Exception e){
            System.out.println(e);
            System.out.println("exception handled");
        }
    }
}


// video 83 the exception class

class MyException extends Exception{
    @Override
    public String toString() {
        // return super.toString()+"i am a tostring";
        return "i am a tostring";
    }

    @Override
    public String getMessage() {
        // return super.getMessage()+" i  am a get message";
        return " i  am a get message";
    }
}
public class Main {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9){
            try{
//                throw new MyException();
               // throw new ArithmeticException("this is an arithmetic exception ");
            }catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("yes finished");
        }
        System.out.println("yes finished");
        int b;
        b = sc.nextInt();
        if (b==0){
            try{
                throw new ArithmeticException("divide by 0");
            }catch (Exception e){
//                System.out.println(e);
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("hy");


            }
            System.out.println("hy");

        }else {
            System.out.println((float) (a/b));
        }
    }
}


class MyException extends Exception{
    @Override
    public String toString() {
        // return super.toString()+"i am a tostring";
        return "i am a tostring";
    }

    @Override
    public String getMessage() {
        // return super.getMessage()+" i  am a get message";
        return " i  am a get message";
    }
}
public class Main {
    public static void main(String[] args) {
       int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9){
            try{
                throw new MyException();
            }catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
               System.out.println(e);
               e.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("yes finished");
        }
        System.out.println("yes finished");

    }
}


// video 82 nested try catch
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = -1;
        int[] ar = {1,2,3,4,5};
        int bd = ar.length-1;
        System.out.println("welcome");
        boolean bl = true;
        // here is doubt why my condition is not reaching .
        while (bl){
        try{
            System.out.println("enter the number = ");
            a = sc.nextInt();

            try{
                System.out.println(ar[a]);
                bl=false;

            }catch (Exception e){
                System.out.println("array ka boundary 0 se "+bd+" tak hai \n so pls select b/w this");
                System.out.println(e);
            }

        }catch (Exception e){
            System.out.println("first error ! input sahi se daal de bhai.\n only integer daal");
            System.out.println(e);
        }
    }
        System.out.println("thanks for entering in this loop");
    }
}


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = -1;
        int[] ar = {1,2,3,4,5};
        int bd = ar.length-1;
        System.out.println("welcome");
        try{
            System.out.println("enter the number = ");
            a = sc.nextInt();
            try{
                System.out.println(ar[a]);
            }catch (Exception e){
                System.out.println("array ka boundary 0 se "+bd+" tak hai \n so pls select b/w this");
                System.out.println(e);
            }

        }catch (Exception e){
            System.out.println("first error ! input sahi se daal de bhai.\n only integer daal");
            System.out.println(e);
        }
    }
}


//video 81 handling specific exception error in java
public class Main{
    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind =0;
        int number=0;
        try{
             ind = sc.nextInt();
        }catch (Exception e){
            System.out.println(e);
            return;
        }

        System.out.println("Enter the number you want to divide the value with");
        try{
             number = sc.nextInt();
        }catch (Exception e){
            System.out.println(e);
            return;
        }


        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }


    }}

// video 79,80  syntax,logical and runtime error 21-9-22

// video 79 & 80 exception error and handling these errors

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int a = 1000;
        System.out.println("enter number to divide with "+a);
        int b=1;
        try{
            b = sc.nextInt();
        }
        catch (Exception e){
            System.out.println("sorry! your input is not valid");
            System.out.println(e);
        }
      try{
          System.out.println("result is = "+a/b);
      }
      catch (Exception e){
          System.out.println("we failed to devide "+a);
          System.out.println(e);

      }
        System.out.println("end of program");
    }
}



// video 78 errors and exception 19-9-22
theory
// video 76,77 practice

// 19-9-22  video 75 java thread method

class A extends Thread{
    public A(String a) {
        super(a);
    }

        @Override
        public void run() {

            System.out.println("good morning");
            System.out.println(Thread.currentThread().getId());
            System.out.println(Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getName());
    }
}


public class Main {
    public static void main(String[] args) {
        A t1 = new A("harry");
        A t2 = new A("vishal");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();

    }
}








//video 74 java thread priorities



class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        // while(true){
//            System.out.println("I am a thread");
            System.out.println("Thank you: thread name = " +this.getName()+" thread id = "+ this.getId());
      //  }

    }
}

public class Main {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("Harry1");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Harry4");
        MyThr1 t5 = new MyThr1("Harry5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());
        System.out.println(t5.getPriority());

    }
}

// public final void setPriority(int x)

// setting and getting thread  priority
class cwh_Priority extends Thread{
    public void run(){
        System.out.println("I'm thread : "+Thread.currentThread().getName());
        System.out.println("I'm thread :"+Thread.currentThread().getPriority());
    }
}

public class Main {
    public static void main(String[] args) {
        cwh_Priority t1=new cwh_Priority();
        cwh_Priority t2= new cwh_Priority();
        t1.setPriority(Thread.MIN_PRIORITY);  // setting priority of t1 thread to MIN_PRIORITY (1)
        t2.setPriority(Thread.MAX_PRIORITY);  // setting priority of t2 thread to MAX_PRIORITY (10)
        t1.start();
        t2.start();

    }
}


class ExpendThread extends Thread{
    public ExpendThread(String name){
        super(name);
    }
  //  @Override
  //  public void run() {

  //  }
}
class ImplementThread implements Runnable{
    @Override
    public void run() {

    }
}


public class Main {
    public static void main(String[] args) {
        ExpendThread et = new ExpendThread("vishal soni");
        Thread tr = new Thread(et);
    }
}



// *****--------- prime number print
public class Main {
    public static void main(String[] args) {
        System.out.println("enter no. till u want to get a prime number = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 2;i<=a;i++){
            boolean b = true;
            int m = i/2;
            for (int j = 2;j<=m ; j++){
                if (i%j==0){
                    b=false;
                }
            }

            if (b){
                System.out.print(i+" ");

            }
        }
    }
}

//video 73 constructors from thread class
// Thread(),Thread(Runnable r),Thread(String name),Thread(Runnable r , String name),Thread(ThreadGroup r)


class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}
class MyThr2 extends Thread{
    public MyThr2(){
    }
    public void run(){
        int r = 5;
        System.out.println("thank u");
    }
}
class MyThr3 implements Runnable{
    public MyThr3(String name2){
        // super(name2);
    }
    public void run(){
        System.out.println("hiiii");
    }
}
public class Main {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Ram Candr");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());

        MyThr2 t3 = new MyThr2();
        t3.start();
        System.out.println("The id of the thread t is " + t3.getId());

        MyThr3 t4 = new MyThr3("vish");
        Thread t5  = new Thread(t4);
        t5.start();
        System.out.println("The id of the thread t5 is " + t5.getId());
        System.out.println("The name of the thread t5 is " + t5.getName());
        // System.out.println("The id of the thread t is " + t5.getId());

    }
}



// video 72 Thread life cycle
// theory


// video 71 Creating a Thread by runnable interface

class MainThread1 implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("i am in thread 1");
            System.out.println("i am in thread 1 in 1");
            System.out.println("i am in thread 1 in 1 in 1");
        }
    }
}
class MainThread2 implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("i am in thread 2");
            System.out.println("i am in thread 2 in 2 ");
            System.out.println("i am in thread 2 in 2 in 2");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MainThread1 bullat1 = new MainThread1();
        Thread gun1 = new Thread(bullat1);

        MainThread2 bullat2 = new MainThread2();
        Thread gun2 = new Thread(bullat2);

        gun1.start();
        gun2.start();


    }
}

// video 70 creating a thread by extending a thread class

class MainThread extends Thread{
    int a = 0 ;
    @Override
    public void run(){
        while (true){
        System.out.println("1 is running");
    }
    }
}
class MainThread2 extends Thread{
    @Override
    public void run(){
        while (true){
        System.out.println("2 is running");
    }
    }
}
public class Main {
    public static void main(String[] args) {
        MainThread t1 = new MainThread();
        MainThread2 t2 = new MainThread2();
        t1.start();
        t2.start();
      //  t1.run();
      //  t2.run();
    }
}



//-----******* prime number identify
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number = ");
        int a = sc.nextInt();
        boolean b = true;
        int m = a/2;
        if (a==0 || a== 1 ){
            System.out.println(a+" is not a prime number");
            b = false;

        }else {
            for (int i = 2; i < m; i++) {
                if (a % i == 0) {
                    System.out.println(a + " is not a prime number");
                    b = false;
                    break;
                }
            }
        }
        if (b){
            System.out.println(a+" is a prime number");
        }
    }
}
// video 69 multithreading


// Video 67 and 68 practice

// *** WRITE THIS CODE IN NOTEPAD ***
//         You have to create a package named com.codewithharry.shape
//         This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
 //        These classes should use inheritance to properly manage the code!
 //        Include methods like volume, surface area and getters/setters for dimensions



// video 66 access modifiers

// all modifiers in subclass means create subclass here of different package and in world means direct access from another package

import abc.Harry;

class Soni extends Harry{
    public void meth(){
        System.out.println(a);
        System.out.println(b);
        System.out.println("hello");
    }
}
public class Main {

    public static void main(String[] args) {
        Soni sn = new Soni();
        sn.meth();
        System.out.println("hii");
        Harry hr = new Harry();
        System.out.println(hr.a);

    }
}



//all modifiers in package : ki kya hum sama package me charo ko use kar pate hain ya nahi.
class C1 {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;
    // public void meth1(){
    //     System.out.println(a);
    //     System.out.println(b);
    //     System.out.println(c);
    //     System.out.println(d);
    // }

}

class C2 extends C1{

}

public class Main {
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
       // System.out.println(c.d);
    }
}


//all modifiers in class : ki kya hum same class me charo ko use kar pate hain ya nahi.
class C1{
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}

public class Main {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();
    }
}


// video 62,63,64,65

 // import java.util.*;
// import java.lang.*
// all about packages
public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in);
    }
}



// video 61 library exercise

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return; // i think it means just like break;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }

}
public class Main {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}


// library exercise
class A{
    Scanner sc = new Scanner(System.in);
    String str;
    int bookNumber;
    String[] bookName;
    int issueBookNumber;
    String[] issueBookName;

    void entry(){
        System.out.println("Welcome To Library !");
        addBook();
    }
    void addBook(){
        System.out.println("Do u want to add some books = ");
        str = sc.next();
        addingBook();
    }
    void addingBook(){
        if (str.equalsIgnoreCase("no")){
            System.out.println("alright");
            issueBook();
        }
        else if (str.equalsIgnoreCase("yes")){
            System.out.println("cool,lets start to add books");
            System.out.println("how many books you want to add =");
            bookNumber = sc.nextInt();
            bookName=new String[bookNumber];
            System.out.println("enter your book name = ");
            for (int i = 0;i< bookName.length;i++){
                bookName[i]= sc.next();
            }
            System.out.println("you have added "+bookNumber+" books which are = ");
            for (int i = 0 ;i<bookName.length;i++){
                System.out.print(bookName[i]+" ");
            }
            System.out.println();
            issueBook();
        }
        else {
            System.out.println("please reply only in \" yes or no \" ");
            addBook();
        }

    }
    void issueBook(){
        System.out.println("Do you want to issue any book = ");
        str = sc.next();
        if (str.equalsIgnoreCase("no")){
            System.out.println("alright");
            todayWork();
        } else if (str.equalsIgnoreCase("yes")) {
            System.out.println("there are "+bookNumber+" books available which are = ");
            for (int i = 0 ;i<bookName.length;i++){
                System.out.print(bookName[i]+" ");
            }
            System.out.println();
            System.out.println("please choose book from above.\n how many books u want to issue = ");
            issueBookNumber=sc.nextInt();
            issueBookName = new String[issueBookNumber];
            System.out.println("just enter all book name = ");
            for (int i = 0;i<issueBookNumber;i++){
                issueBookName[i]= sc.next();
            }
            System.out.println("you have issued total "+issueBookNumber+" books which are = ");
            for (int i = 0 ;i<issueBookName.length;i++){
                System.out.print(issueBookName[i]+" ");
            }
            System.out.println();
            todayWork();
        }
        else {
            System.out.println("please reply only in \" yes or no \" ");
            issueBook();
        }
    }
    void todayWork(){
        System.out.println("do you want to see today work = ");
        str = sc.next();
        if (str.equalsIgnoreCase("no")){
            System.out.println("alright");
            exit();
        }
        else if (str.equalsIgnoreCase("yes")){
            System.out.println("here are the details = ");
            System.out.println("you have added "+bookNumber+" books which are = ");
            for (int i = 0 ;i<bookName.length;i++){
                System.out.print(bookName[i]+" ");
            }
            System.out.println();
            System.out.println("you have issued total "+issueBookNumber+" books which are = ");
            for (int i = 0 ;i<issueBookName.length;i++){
                System.out.print(issueBookName[i]+" ");
            }
            System.out.println();
            exit();
        }
        else {
            System.out.println("please reply only in \" yes or no \" ");
            todayWork();
        }
    }
    void exit(){
        System.out.println("Have a nice day ! will see you again !");
    }


}

public class Main {
    public static void main(String[] args) {
     main2();
    }
    static void main2(){
     //   System.out.println("enter your name = ");
     //   Scanner sc = new Scanner(System.in);
     //   String name = sc.nextLine();
        A a = new A();
        a.entry();
        System.out.println(" now ! next student -->");
        main2();
    }

}


// video 60 practice on interface and abstract classes


abstract class Pen{
    abstract void write();
    abstract void refill();
    abstract void writometer();
    abstract void pencil();

}
abstract class FoundationPen extends Pen{
    @Override
    void write() {
        System.out.println("we can write from pen");
    }
    @Override
    void writometer() {
        System.out.println("writometere");
    }

    @Override
    void pencil() {
        System.out.println("pencil");
    }

    void changeNib(){
        System.out.println("change nib here");
    }
    abstract void read();
}
class B extends FoundationPen{
    @Override
    void read() {
        System.out.println("reading");
    }

    @Override
    void refill() {
        System.out.println("changing refill");
    }

    @Override
    void pencil() {
        super.pencil();
    }
}

interface BasicAnimal{
    void eat();
    void sleep();

}
class Monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}
abstract class Telephone{
   abstract void ring();
   abstract void lift();
   abstract void disconnect();
}
class SmartPhone extends Telephone{
    @Override
    void ring() {
        System.out.println("ringing");
    }

    @Override
    void lift() {
        System.out.println("lifting");
    }

    @Override
    void disconnect() {
        System.out.println("disconnecting");
    }
}
interface TvRemote {
    void tv1();
}
interface SmartTvRemote extends TvRemote{
    void tv2();
}
class Tv implements SmartTvRemote{
    @Override
    public void tv1() {
        System.out.println("tv1");
    }

    @Override
    public void tv2() {
        System.out.println("tv2");
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        Human h = new Human();
        SmartPhone sp = new SmartPhone();
        Tv t = new Tv();

    }
}

//video 59 polymorphism in interfaces
class CellPhone{
    void kellphone(){
        System.out.println("h kellphone");
    }

}
interface Ram{
    void ram();
}
interface Gps {
    void kps();
}
interface Camera{
    void kamera();
}

interface MediaPlayer{
    void kediaplayer();
}
class SmartPhone extends CellPhone implements Ram,Gps , Camera , MediaPlayer{
    @Override
    public void kps() {
        System.out.println("h kps");
    }

    @Override
    public void ram() {
        System.out.println("i ram");
    }

    @Override
    public void kediaplayer() {
        System.out.println("hiii kediaplayer");
    }
    @Override
    public void kamera()
    {
        System.out.println("hii kamera");
    }
    public void kmartphone(){
        System.out.println("hiiii kmartphone");
        kmartphone2();
    }
    private void kmartphone2(){
        System.out.println("hiiiii kmartphone2");
    }
}

public class Main {
    public static void main(String[] args) {
        Gps g = new SmartPhone();
        g.kps();
        SmartPhone sp = new SmartPhone();
        sp.kellphone();
        sp.kps();
        sp.ram();
        sp.kamera();
        sp.kediaplayer();
        sp.kmartphone();
    }
}

//video 58 inheritance in interfaces

interface A{
    void a1();
    void a2();

}
interface B extends A{
    void a3();
    void a4();
}

class C implements B{
    @Override
    public void a1() {
        System.out.println("a1");
    }

    @Override
    public void a2() {
        System.out.println("a2");
    }

    @Override
    public void a3() {
        System.out.println("a3");
    }

    @Override
    public void a4() {
        System.out.println("a4");
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.a1();
        c.a2();
        c.a3();
        c.a4();

    }
}


interface A{
    void aM1();
    public static void aM2(){
        System.out.println("hi babe");
    }
    default void aM3(){
        System.out.println("hello bro");
        aM2();
    }
}
class B implements A{
    @Override
    public void aM1() {
        System.out.println("hey");
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.aM3();
        A a = new B();
        a.aM3();

    }
}

//video 57 interface example and Default ,private,static methods

// interface example
interface MyCamera{
    void takeSnap();
    void recordVideo();
    public static void f1(){
        System.out.println("static in interface");
    }
    private void record3dVideo(){
        f1();
        System.out.println("it is recording in 3d video");
    }
    default void record4kVideo(){
        record3dVideo();
        System.out.println("it is recording in 4k video");
    }

}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
 interface MyWifi2{
     int[] getNetworks2();
 }
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera,MyWifi2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("recording video");
    }
    //    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
       // System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }

    @Override
    public int[] getNetworks2() {
       // System.out.println("list of numbers = ");
        int[] networkList2 = {1,2,3,4,5};
        return networkList2;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class Main {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.takeSnap();
        ms.recordVideo();
        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
        ms.connectToNetwork("vishal soni");
        for (int item2 : ms.getNetworks2()){
            System.out.print(item2+" ");
        }
        System.out.println();
        ms.record4kVideo();
     //   ms.f1(); --> throws error

    }
}

// video 56 why multiple inheritance is not supported in java
class CellPhone{
    int a=5;
    void f1(){
        System.out.println("hi");
    }
    void f2(){
        System.out.println("hiii");
    }
}
class BellPhone extends CellPhone{
    int a =6;
    void f1(){
        System.out.println("hey");
    }
    void f3(){
        System.out.println("hiiii");
    }
}
interface Gps{
    int b = 5;
    void ff();
}
interface Camera{
    int c = 6;
}
interface MediaPlayer{
    int d = 7;
}
class SmartPhone extends CellPhone implements Gps,Camera,MediaPlayer{
    @Override
    public void ff() {
        System.out.println("hhuh");
    }
}
public class Main {
    public static void main(String[] args) {
        // SmartPhone sp = new SmartPhone();
        CellPhone bp = new BellPhone();
        System.out.println(bp.a);
        bp.f1();
        bp.f2();

    }
}


//video 55 abstract classes vs interfaces
interface Bicycle{
   final int a =5;
    int b =5; // here all the properties are final value ,we can not change later.
    public void applyBreak(int decrement);
    public void speedUp(int increment);



}
interface Cycle {
    void hari();
    void ram();
}
class AvonCycle implements Bicycle,Cycle{
    int speed = 7;
    @Override
    public void applyBreak(int decrement) {
        speed = speed-decrement;
        System.out.println(speed);
    }

    @Override
    public void speedUp(int increment) {
        speed = speed+increment;
        System.out.println(speed);


    }
    public void hari(){
        System.out.println("hanji");
    }
    public void ram(){
        System.out.println("hanji");
    }
}

public class Main {
    public static void main(String[] args) {

    }
}


// video 54 introduction to interfaces
interface Bicycle{
    public void applyBreak(int decrement);
    public void speedUp(int increment);


}
class AvonCycle implements Bicycle{
    int speed = 7;
    @Override
    public void applyBreak(int decrement) {
        speed = speed-decrement;
        System.out.println(speed);
    }

    @Override
    public void speedUp(int increment) {
        speed = speed+increment;
        System.out.println(speed);


    }
    public void hel(){
        System.out.println("hanji");
    }
}
public class Main {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBreak(4);
        ac.speedUp(5);
        ac.hel();

        Bicycle bc = new AvonCycle();
        bc.applyBreak(6);
        bc.speedUp(7);
    }
}



//video 53 abstract class and abstract methods

abstract class Parent{
    public void m1(){
        System.out.println("i am in parent class in m1 method");
    }
    abstract public void greet();
    abstract public void greet3();
}
class Child extends Parent{
    @Override
    public void greet() {
        System.out.println("i am in child in parent implementing greet");
    }

    @Override
    public void greet3() {
        System.out.println("ye boy");
    }

}

//either we can make this class as abstract class or implement method greet();
//  class Child2 extends Parent{
//  }

abstract class Child2 extends Parent{
    public void m3(){
        System.out.println("hiii");
    }
    abstract public void greet2();

    @Override
    public void greet() {
        System.out.println("hi");
    }
}
class Child3 extends Child2{
    @Override
    public void greet2() {
        System.out.println("iiii");
    }

    @Override
    public void greet() {
         super.greet(); //---> chuki greet() ko iska parent class already implement kr chuka hai
        // isliye ye direct use call krke implement kara lega ya fir alag se yaha bhi greet() ko
        // implement kra skte hai but dono me se ek situation ko hi run kara skte hain.
        // System.out.println("kkkk");
    }

    @Override
    public void greet3() {
        System.out.println("ss");
    }
}

public class Main {
    public static void main(String[] args) {
        //   Parent p = new Parent(); --> throw error bcs we cant create object of parent class here bcs this class is abstract class
        //   Child2 cc = new Child2(); --> throw error bcs this is also abstract class
        //    Child c = new Child();
    //    c.greet();
    //    c.m1();
        Child ch = new Child();
        ch.m1();
        ch.greet();
        ch.greet3();
        Child3 gk = new Child3();
        gk.greet();
        gk.greet2();
        gk.greet3();


    }
}
// video 52 practice

class Circle{
    public int radius;
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
        area();
    }

    public double area(){
        System.out.println("Circle volume = "+Math.PI*this.radius*this.radius);
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
        volume();
    }
    public double volume(){
        System.out.println("Cylinder volume = "+Math.PI*this.radius*this.radius*this.height);
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class Rectangle{
    int a;
    int b;
    public Rectangle(int a,int b){
        this.a=a;
        this.b=b;
        area();
    }
    public double area(){
        System.out.println("rectangle volume = "+a*b);
        return a*b;
    }

}
class Cuboid extends Rectangle{
    int c;
    public Cuboid(int a,int b,int c){
        super(a,b);
        this.c=c;
        volume();

    }
    public double volume(){
        System.out.println("cuboid volume = "+a*b*c);
        return a*b*c;
    }

}
public class Main {
    public static void main(String[] args) {
        // Problem 1
        // Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(12, 4);
       // Rectangle objR = new Rectangle(4,5);
         Cuboid objC = new Cuboid(4,5,6);
    }
}

class Circle{
    int r = 5;
    int h = 10;
    public double area(){
        return (Math.PI*r*r);
    }
}
class Cylinder extends Circle{
    public double area(){
        return 2*Math.PI*r*h;
    }
}
class Rectangle{
    int a=1;
    int b=2;
    int c=3;
    public double area(){
        return a*b;
    }
}
class Cuboid extends Rectangle{
    public double area(){
        return 2*((a*b)+(b*c)+(c*a));
    }
}
public class Main {
    public static void main(String[] args) {
        Circle ci= new Circle();
        Cylinder cy = new Cylinder();
        Rectangle re = new Rectangle();
        Cuboid cu = new Cuboid();

        System.out.println(ci.area());
        System.out.println(cy.area());
        System.out.println(re.area());
        System.out.println(cu.area());
    }
}


// video 51 online library exercise
class Library{
    String [] Book;
    String [] IssueBook = new String[0];
    String [] returnBook = new String[0];
    Scanner sc = new Scanner(System.in);

    public void addBook(){
        System.out.println("how many books you want to add = ");
        int a = sc.nextInt();
        Book = new String[a];
        System.out.println("please add books");
        for (int i=0;i< Book.length;i++){
            Book[i]= sc.next();
        }
        ShowAvailableBook();
    }
    public void ShowAvailableBook(){
        System.out.println("these are the available books = ");
        for (int i = 0;i< Book.length;i++){
            System.out.print(Book[i]+" ");
        }
        IssueBook();
    }
    public void IssueBook(){
        System.out.println("\n do you want to issue any book = ");
        String s = sc.next();
        if (s.equalsIgnoreCase("yes")){
            System.out.println("there are "+Book.length+" books available.\n how many books you want to issue = ");
            int a = sc.nextInt();
            if (a> Book.length){
                System.out.println("please issue valid number of books .");
                IssueBook();
            }
            IssueBook = new String[a];
            System.out.println("ok these are the books please choose from below whichever books you want to issue");
            for (int i = 0;i< Book.length;i++){
                System.out.print(Book[i]+" ");
            }
            System.out.println("please select");
            for (int i = 0;i<a;i++){
                IssueBook[i]= sc.next();
            }
            System.out.println("your total issue books are = "+IssueBook.length);
            for (int i = 0;i< IssueBook.length;i++){
                System.out.print(IssueBook[i]+" ");
            }

        }else {
            System.out.println("ok then . Thanks for coming !");
        }
        System.out.println("Do you want to return any books = ");
        String x = sc.next();
        if (x.equalsIgnoreCase("yes")){
            System.out.println("how many books you want to return = ");
            int a = sc.nextInt();
            returnBook = new String[a];
            System.out.println("ok then enter your book = ");
            for (int i = 0;i<a;i++){
                returnBook[i]= sc.next();
            }
            System.out.println("ok your total return books are "+returnBook.length+" which are");
            for (int i=0;i<a;i++){
                System.out.print(returnBook[i]+" ");
            }
            System.out.println(" Do you want to see today work = ");
            String y = sc.next();
            if (y.equalsIgnoreCase("yes")){
                todayWork();
            }else {
                System.out.println("ok.\n Have a nice day !");
            }

        }else {
            System.out.println("ok ok alright. \n Do you want to see today work = ");
            String a = sc.next();
            if (a.equalsIgnoreCase("yes")){
                todayWork();
            }else {
                System.out.println("ok.\n Have a nice day !");
            }
        }
    }
    public void todayWork(){
        System.out.println("today books available = ");
        for (int i = 0;i< Book.length;i++){
            System.out.print(Book[i]+" ");
        }
        System.out.println("total issue books = ");
        for (int i = 0;i< IssueBook.length;i++){
            System.out.print(IssueBook[i]+" ");
        }
        System.out.println("today return books = ");
        for (int i = 0;i< returnBook.length;i++){
            System.out.print(returnBook[i]+" ");
        }
        System.out.println("these are the today works !\n see you tomorrow");
    }
}
public class Main {
    public static void main(String[] args) {
        Library l = new Library();
        l.addBook();

    }
}




// video 50 exercise 3 solution

// guess the number game with oops
class A{
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    int c;
    int x;
    public void a1(){

        System.out.println("this is \" guess the number \" game \n  pls select two number b/w you want to play" );
        System.out.println(" a = ");
        a = sc.nextInt();
        System.out.println(" b = ");
        b = sc.nextInt();
        if (b<=a){
            System.out.println("pls select valid b number if u really want to play this game. \n value of b should be grater than a");
            a1();
        }
        a2();
    }
    public void a2(){
        Random random = new Random();
        c = random.nextInt(a+1,b);
        System.out.println("now , computer has chosen a number b/w "+a+"  and "+b);
        a3();
    }
    public void a3(){
        System.out.println("now it is your turn to predict that number ");
        x = 0;
        for (int i = 1;i<b-a;i++){
            System.out.println("enter the number = ");
            int d = sc.nextInt();

            if (d>=b || d<=a){
                System.out.println("please enter valid number b/w "+a+" and "+b);
            } else if (d>c) {
                System.out.println("greater number ! pls retry ");
                x += 1;
            } else if (d<c) {
                System.out.println("lesser number ! pls retry ");
                x += 1;
            } else if (d==c) {
                System.out.println("exact match !");
                x += 1;
                break;
            }

        }
        System.out.println("you did it in "+x+" attempts");
    }
}

public class Main {

    public static void main(String[] args) {
        A obj = new A();
        obj.a1();

    }
}

 "guess the number game with simply solution "
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this is \" guess the number \" game \n  pls select two number b/w you want to play" );
        System.out.println(" a = ");
        int a = sc.nextInt();
        System.out.println(" b = ");
        int b = sc.nextInt();

        Random random = new Random();
        int c = random.nextInt(a+1,b);
        System.out.println("now , computer has chosen a number b/w "+a+"  and "+b);

        System.out.println("now it is your turn to predict that number ");
        int x = 0;
        for (int i = 1;i<b-a;i++){
            System.out.println("enter the number = ");
            int d = sc.nextInt();

            if (d>=b || d<=a){
                System.out.println("please enter valid number b/w "+a+" and "+b);
            } else if (d>c) {
                System.out.println("greater number ! pls retry ");
                x += 1;
            } else if (d<c) {
                System.out.println("lesser number ! pls retry ");
                x += 1;
            } else if (d==c) {
                System.out.println("exact match !");
                x += 1;
                break;
            }

        }
        System.out.println("your rank is "+x);

    }
}


// video 49 Dynamic Method Dispatch

class A{
    public void a(){
        System.out.println("hi");
    }
    public void a2(){
        System.out.println("hii");
    }
}
class B extends A{
    public void cc(){
        System.out.println("hiii");
    }
    @Override
    public void a2(){
        System.out.println("hiiii");

    }
}

public class Main {
    public static void main(String[] args) {
        A b = new B();
        b.a();
        b.a2();
        // b.cc(); it gives error
    }
}



// video 48 method overriding
class A{
    public void meth1(){
        System.out.println("hi");
    }
}
class B extends A{
    private void meth2(){
        System.out.println("hello");
    }

    @Override
    public void meth1(){
        System.out.println("hiiii");
    }

}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.meth1();

    }
}


//video 47 this and super keyword

class Ek{
    private int a;

    public int getA() {
        return a;
    }

    public void cEkF1(int a){

    }
    public Ek(){
        System.out.println("hiiii");
    }
    public Ek(int a){
        System.out.println("yes my boy!");
        this.a=a;
    }
}
class Do extends Ek{
    public Do(int a){
        super(a);
        System.out.println("hello");
    }
    public void cDoF1(){
        System.out.println("hi");
    }
}

public class Main {
    public static void main(String[] args) {
        Do d = new Do(5);
        d.cDoF1();
        System.out.println(d.getA());

    }
}



// this give errors because we have made a constructor and with integer but during declaring object of that class
// i am creating c object with C1() thats why it gives error but it expect one integer to enter that constructor
// constructor is there it knows so it does not want to run without an integer ,it wants an integer.
// either we can insert an integer or we can create a constructor inside C1 class "public C1(){  }" of this


class C1{
    public C1(int a){

    }

}

public class Main {
    public static void main(String[] args) {
        C1 c = new C1();
        C1 d = new C1(5);

    }
}

//video 46 constructor in inheritance

// constructor in inheritance child of child
class Base{
    public Base(){
        System.out.println("i m a constructor inside Base class ");
    }
    public Base(int a){
        System.out.println("i am constructor inside base class with number "+a);
    }
    public Base(int a,int b){
        System.out.println("i am constructor inside base class with number  "+a+" "+b);
    }
}

class Derived extends Base{

    public Derived (){
        System.out.println("inside derived");
    }
    public Derived(int a){
        super(a);
        System.out.println("inside derived with number "+a);
    }
    public Derived (int a ,int b){
        super(a, b);
        System.out.println("inside derived with number "+a+" "+b);
    }

}
class ChildOfDerived extends Derived{
    public ChildOfDerived() {
        System.out.println("i am inside childOfDerived with 0 parameter");
    }
    public ChildOfDerived(int a) {
        super(a);
        System.out.println("i am inside childOfDerived with 1 parameter "+a);
    }
    public ChildOfDerived(int a,int b) {
        super(a,b);
        System.out.println("i am inside childOfDerived with 2 parameter "+a+" "+b);
    }
}
public class Main {
    public static void main(String[] args) {
        //  Derived d = new Derived();
        //  Derived e = new Derived(8);
        //  Derived f = new Derived(8,9);
        ChildOfDerived g = new ChildOfDerived();
        ChildOfDerived h = new ChildOfDerived(1);
        ChildOfDerived i = new ChildOfDerived(1,2);

    }
}


// constructor child of child inheritance
class Base{
    public Base(){
        System.out.println("i m a constructor inside Base class ");
    }
    public Base(int a){
        System.out.println("i am constructor inside base class with number "+a);
    }
    public Base(int a,int b){
        System.out.println("i am taking 2 arguements "+a+" "+b);
    }
}

class Derived extends Base{

    public Derived (){
        System.out.println("inside derived");
    }
    public Derived(int a){
        super(a);
        System.out.println("inside derived with number "+a);
    }
    public Derived (int a ,int b){
        super(a, b);
        System.out.println("inside derived with two number "+a+" "+b);
    }

}
class ChildOfDerived extends Derived{
    public ChildOfDerived() {
        System.out.println("i am inside childOfDerived with 0 parameter");
    }
    public ChildOfDerived(int a) {
        System.out.println("i am inside childOfDerived with 1 parameter");
    }
    public ChildOfDerived(int a,int b) {
        System.out.println("i am inside childOfDerived with 2 parameter");
    }
    public ChildOfDerived(int a,int b,int c){
        System.out.println("i am inside childOfDerived with 3 parameter");
    }
}
public class Main {
    public static void main(String[] args) {
      //  Derived d = new Derived();
      //  Derived e = new Derived(8);
      //  Derived f = new Derived(8,9);
        ChildOfDerived g = new ChildOfDerived();
        ChildOfDerived h = new ChildOfDerived(1);
        ChildOfDerived i = new ChildOfDerived(1,2);
        ChildOfDerived j = new ChildOfDerived(1,2,3);

    }
}

// constructor in inheritance

class Base{
    public Base(){
        System.out.println("i m a constructor inside Base class ");
    }
    public Base(int a){
        System.out.println("i am constructor inside base class with number");
    }
    public Base(int a,int b){
        System.out.println("i am taking 2 arguements");
    }
}

class Derived extends Base{

    public Derived (){
        super(0);
        System.out.println("inside derived");
    }
    public Derived(int a){
        super(0,0);
        System.out.println("inside derived with number");
    }
    public Derived (int a ,int b){
        System.out.println("inside derived with two number");
    }

}
public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
        Derived e = new Derived(8);
        Derived f = new Derived(8,9);
    }
}




//basic of constructor in inheritance
class Base{
    public Base(){
        System.out.println("i m a constructor inside Base class ");
    }
}

class Derived extends Base{

    public Derived (){
        System.out.println("inside derived");
    }
    public Derived(int a){
        System.out.println("yes boss");
    }

}
public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
        Derived e = new Derived(8);
    }
}


// video 45 inheritance
class Animal {
    private int wakeup;public String eat;

    public int getWakeup() {
        return wakeup;
    }

    public void setWakeup(int wakeup) {
        this.wakeup = wakeup;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
}
class Dog extends Animal {
    private int lunch;public int dinner;

    public int getLunch() {
        return lunch;
    }

    public void setLunch(int lunch) {
        this.lunch = lunch;
    }

    public int getDinner() {
        return dinner;
    }

    public void setDinner(int dinner) {
        this.dinner = dinner;
    }
}
public class Main {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.setWakeup(5);
        System.out.println(ani.getWakeup());
        ani.eat = "hello animals";
        System.out.println(ani.eat);
        System.out.println(ani.getEat());
        System.out.println();
        Dog dg = new Dog();
        dg.setWakeup(6);
        System.out.println(dg.getWakeup());


    }
}

class Animal {
    private int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
class Base{
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        System.out.println("i am in the Base and setting x now");
    }
    void printMe(){
        System.out.println("hauji");
    }
}
class Derived extends Base {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Main {

    public static void f1(){
        System.out.println("hi");
    }
    private static void f2(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Base bs = new Base();
        bs.setX(6);
        System.out.println(bs.getX());
        bs.printMe();
        f1();
        f2();
        Derived dr = new Derived();


    }
}


public class Main {
    private int b;

     private void f1(){

        System.out.println("hi");
    }
     int a;
    public static void main(String[] args) {
        Main mn = new Main();
        mn.a = 5;
        System.out.println(mn.a);
        mn.f1();
        mn.b=9;
        System.out.println(mn.b);
    }

}


// video 44
// all question
class Ractangle{

    private int x;
    private int y;

    public Ractangle(int a, int b){
        x=a;
        y=b;
    }
    public int area(){
        return x*y;
    }

}
class Cylinder{
    private int r;
    private int h;

    public Cylinder(int x,int y){
       r = x;
       h = y;
    }
    public void setR(int a){
        r = a;
    }
    public void setH(int a){
        h = a;
    }
    public int getArea(){
        return (22/7)*r*r*h;
    }
    public int getVolume(){
        return 2*r*h*(22/7);
    }

}
public class Main {
    public static void main(String[] args) {
    Cylinder cy = new Cylinder(5,10);
    // cy.setH(10);
    // cy.setR(5);
        System.out.println(cy.getVolume());
        System.out.println(cy.getArea());

        Ractangle rac = new Ractangle(4,5);
        System.out.println(rac.area());
        int d = Math.PI

    }
}


// video 43 guess the number game using constructor
class Game{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f =0;


    public Game() {

        System.out.println("enter both number b/w which you want to play = ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        Random random = new Random();
        c = random.nextInt(a + 1, b);
        game();
    }

      //  Scanner sc = new Scanner(System.in);
        public void game(){
            System.out.println("enter your number");
            Scanner sc = new Scanner(System.in);

            int e = sc.nextInt();
            takeUserInput(e);
            isCorrectNumber();
        }





    public void takeUserInput(int x){
        d=x;

    }
    public void isCorrectNumber(){
        if (d==c){
            System.out.println("EXACT MATCH ");
            f += 1;
            System.out.println(f);

        } else if (d>c && d<b) {
            System.out.println("greater number");
            f += 1;
            game();

        } else if (d<c && d>a) {
            System.out.println("lesser number");
            f += 1;
            game();
        }else {
            System.out.println("pls enter your valid number ");
            game();
        }
    }


}
public class Main {
    public static void main(String[] args) {

        Game harry = new Game();




    }
}


// video 43 guess the number game

// simply solution
public class Main {
    public static void main(String[] args) {
        System.out.println("its the guessing number game b/w you and computer .\n your score will be made based on your performance");
        System.out.println("firstly choose b/w which numbers you want to play =");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        Random random = new Random();
        int c = random.nextInt(a+1,b);
        System.out.println("now,computer has choose number b/w "+a+" and "+b+" \n and now you have to predict that number");


        int x = 0;
        for (int i = 1;i<b-a;i++) {
            System.out.println("enter the number = ");
            int d = sc.nextInt();
            if (d==c){
                System.out.println("EXACT MATCH ! YOU GOT THAT NUMBER .");
                x=i;
                break;
            } else if (d>c && d<b) {
                System.out.println("your number is greater , please retry");
            } else if (d<c && d>a) {
                System.out.println("your number is lesser , please retry");
            } else if (d<=a || d>=b) {
                System.out.println("please select number only between "+a+"  and "+b);
                i--;
                // here this number select by mistake thats why we are not calculating this steps.
            }


        }
        System.out.println("your rank is now = "+x);

    }
}



// video 42 constructor

class MyMainEmployee{

    public MyMainEmployee(String n,int m){
        id = m;
        name = n;
    }
    public MyMainEmployee(){
        id = 1000;
        name = "your-name-here";
    }
    public MyMainEmployee(int a){
        salary = a;
    }
    private int id;
    private String name;

    private int salary;

    public void setName(String a){
        name = a;
    }
    public int getSalary(){
        return salary;
    }
    public void setId(int a){
        id = a;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

}

public class Main {
    public static void main(String[] args) {

        MyMainEmployee harry = new MyMainEmployee("codeWithHarry",2);
        MyMainEmployee vishal = new MyMainEmployee("VishalSoni",3);
        MyMainEmployee soni = new MyMainEmployee("sonivishal",4);
        MyMainEmployee tarun = new MyMainEmployee("tarunkaiwart",5);
        MyMainEmployee sonia = new MyMainEmployee();
        MyMainEmployee om = new MyMainEmployee(10000);

         //harry.setName("cwh");
         //harry.setId(1);
        System.out.println(harry.getName());
        System.out.println(harry.getId());
        System.out.println();
        System.out.println(vishal.getName());
        System.out.println(vishal.getId());
        System.out.println();
        System.out.println(tarun.getName());
        System.out.println(tarun.getId());
        System.out.println();
        System.out.println(sonia.getName());
        System.out.println(sonia.getId());
        System.out.println();
        System.out.println(om.getSalary());
    }
}



// video 41
// rock , scissor,paper game using pure string
public class Main {
    public static void main(String[] args) {

        System.out.println("this is rock,scissor ,paper game");
        System.out.println("select whatever u want to choose among three things which is given above = ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (str.equalsIgnoreCase("rock") || str.equalsIgnoreCase("scissor") || str.equalsIgnoreCase("paper")) {
            String str2 = "a";
            Random random = new Random();
            int a = random.nextInt(1, 4);
            if (a == 1) {
                str2 = "rock";
                System.out.println("computer select " + str2);
            } else if (a == 2) {
                str2 = "scissor";
                System.out.println("computer select " + str2);
            } else if (a == 3) {
                str2 = "paper";
                System.out.println("computer select " + str2);
            }


            if (str.equalsIgnoreCase("rock") && str2 == "rock") {
                System.out.println("match tie");
            }
            if (str.equalsIgnoreCase("rock") && str2 == "scissor") {
                System.out.println("you won");
            }
            if (str.equalsIgnoreCase("rock") && str2 == "paper") {
                System.out.println("computer won");
            }
            if (str.equalsIgnoreCase("scissor") && str2 == "rock") {
                System.out.println("computer won");
            }
            if (str.equalsIgnoreCase("scissor") && str2 == "scissor") {
                System.out.println("match tie");
            }
            if (str.equalsIgnoreCase("scissor") && str2 == "paper") {
                System.out.println("you won");
            }
            if (str.equalsIgnoreCase("paper") && str2 == "rock") {
                System.out.println("you won");
            }
            if (str.equalsIgnoreCase("paper") && str2 == "scissor") {
                System.out.println("computer win");
            }
            if (str.equalsIgnoreCase("paper") && str2 == "paper") {
                System.out.println("match tie");
            }
        }
    }
}

// rock scissor paper game
public class Main {
    public static void main(String[] args) {
        System.out.println("this is rock,scissor,paper game.");
        System.out.println("select 1 = rock.");
        System.out.println("select 2 = scissor");
        System.out.println("select 3 = paper.");

        Scanner sc = new Scanner(System.in);
        System.out.println("select your number = ");
        int a = sc.nextInt();
        boolean bl = true;
        System.out.print("you select " + a + " which is ");
        if (a == 1) {
            System.out.println("rock");
        } else if (a == 2) {
            System.out.println("scissor");

        } else if (a == 3) {
            System.out.println("paper");
        } else {
            System.out.println("not valid , please select valid no. which is only 1 , 2 and 3");
            bl = false;
        }

        if (bl) {
            Random random = new Random();
            int b = random.nextInt(1, 4);
            System.out.print("computer select " + b + " which is");
            if (b == 1) {
                System.out.println("rock");
            } else if (b == 2) {
                System.out.println("scissor");

            } else if (b == 3) {
                System.out.println("paper");

            }

                if (a == 1) {
                    if (b == 1) {
                        System.out.println("match tie");
                    } else if (b == 2) {
                        System.out.println("you won");
                    } else if (b == 3) {
                        System.out.println("computer won");
                    }
                }
                if (a == 2) {
                    if (b == 1) {
                        System.out.println("computer won");
                    } else if (b == 2) {
                        System.out.println("match tie");
                    } else if (b == 3) {
                        System.out.println("you won");
                    }
                }
                if (a == 3) {
                    if (b == 1) {
                        System.out.println("you won");
                    } else if (b == 2) {
                        System.out.println("computer won");
                    } else if (b == 3) {
                        System.out.println("match tie");
                    }
                }
            }
        }
    }


// video 40 access modifiers , getters and setters

class Circle{

    private float r;

    public void setArea(float a){
        r = a;
    }
    public float getArea(){
        return (22f/7f)*r*r;
    }
    public float getPerimeter(){
        return 2*(22f/7f)*r;
    }
}

public class Main {
    public static void main(String[] args) {

        Circle cr = new Circle();

        System.out.println("enter the radius = ");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextInt();
   //   cr.r =x;
        cr.setArea(x);
        System.out.println(cr.getArea());
        System.out.println(cr.getPerimeter());


    }
}





class C1{
   private int a;
   private String b;

   public void set(int x){
       a = x;
   }
   public void set2(String x){
       b = x;
   }
   public int get(){
       return a;
   }
   public String get2(){
       return b;
   }
}

public class Main {

    public static void main(String[] args) {
        C1 harry = new C1();
       // harry.a =5;
        // harry.b ="cwh";
        harry.set(1);
        harry.set2("cwh");

        System.out.println(harry.get());
        System.out.println(harry.get2());


    }

}

    public static void main(String[] args) {
        Tommy tom = new Tommy();
        tom.fire();
        tom.hire();
        tom.hit();
        tom.salary = 100;

        System.out.println(tom.sal());
        tom.print();
        tom.setName("hello brother");
    }

}

class Tommy {
    int salary;
    String name;
    public void fire(){
        System.out.println("its firing");
    }    public void hire(){
        System.out.println("its hiring");
    }    public void hit(){
        System.out.println("its hitting");
    }    public void print(){
        System.out.println("its printing");
    }   public int sal(){
        return salary;
    }

    public void setName(String n){
         name = n;
    }
}
// opps question
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }

}
class Square {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

// opps question

    public static void main(String[] args) {
        C1 harry = new C1();
        C1 vishal = new C1();

        harry.salary = 200000;
        vishal.salary = 500000;

        // harry.name = "cwh";
        // vishal.name = "vs";

        harry.setName("cwh");
        vishal.setName("vs");

        System.out.println(harry.getName());
        System.out.println(vishal.getName());

        System.out.println(harry.getSalary());
        System.out.println(vishal.getSalary());




    }

}
class C1 {

    int salary;
    String name;

    public int getSalary() {

        return salary;
    }
    public String getName() {

        return name;
    }
    public void setName(String n){

        name=n;
    }
}


// opps question
    public static void main(String[] args) {

        C1 harry = new C1();
        C1 john = new C1();
//setting attribute
        harry.id = 1;
        john.id = 2;


        harry.name = "CodewithHarry";
        john.name = "john khade";

        harry.salary = 100;
        john.salary = 200;


        // System.out.println(harry.id);
        // System.out.println(harry.name);
        harry.f1();
        int hs = harry.f2();
        System.out.println(hs);

        john.f1();
        int js = john.f2();
        System.out.println(js);

    }
}
class C1{
    int id;
    String name;
    int salary;
    public void f1(){
        System.out.println("my name is "+id+" and name is = "+name);

    }
    public int f2(){
        return salary;
    }


}


//celcius to fehrenhiet converter
    public static void main(String[] args) {

        System.out.println("enter the tempreture in celcius = ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        //(0°C × 9/5) + 32 = 32°F
        float b = (a*(9f/5f))+32;
        System.out.println(b+" F");
    }
}

pattern using recursion
// *****
// ****
// ***
// **
// *
    static void f1(int a){
        if (a>0){
            for (int i = 0;i<a;i++){
                System.out.print("*");
            }
            System.out.println();
            f1(a-1);

        }
    }

    public static void main(String[] args) {
        System.out.println("enter the number  = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        f1(a);
    }

}

// pattern   *    using recursion
//           **
//           ***
//           ****
    static void f1(int a){
        if (a>0){
            f1(a-1);
            for (int i = 0;i<a;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the number  = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        f1(a);
    }
}
    static float f1(int ...arr){
        float b = 0;
        for (int i = 0;i< arr.length;i++){
            b += arr[i];
        }
        return b/arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(f1(5,10,15,20,25,30,35,8));
    }

}
// 8-9-22 video 34

// to print fibonacci using recursion;
    static int f1(int a){
        if (a==1){
            return 0;
        } else if (a==2) {
            return 1;
        }
        // or if(a==1 || a==2){
        return n-1;}
        else {
            return f1(a-1)+f1(a-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(f1(x));
    }

}
    // to print star pattern
               * * * * *
               * * * *
               * * *
               * *
               *
    static void f1(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j<a-i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int a = sc.nextInt();
        f1(a);
    }
}
     write a recursion function to calculate the sum of first n natural no.
    static int f1(int a){

        if (a==1){
            return  1;
        }else {
            return a+f1(a-1);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(f1(x));

    }
}
    // to print stars   *
    //                  * *
    //                  * * *
    //                  * * * *
    //                  * * * * *
    static void f1(int a){

        for (int i = 0; i<a;i++){
            for (int j = 0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        f1(x);
    }

}
 multiplication table using method

    static  void f1(int a){
        for (int i = 1;i<=10;i++){
            System.out.println(a+" * "+i+" ="+a*i);
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the number for table = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        f1(a);
    }

}
// fibonacci iteration method;
    static int f1(int n) {

        if (n == 1) {
            System.out.println(0);
            return 0;
        } else if (n == 2) {
            System.out.print(0 + " " + 1);
            return 1;
        } else  {

            int[] arr = new int[n];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            int z = 0;
            for (int i = 0; i < arr.length; i++) {
                z += arr[i];
            }

            return z;
        }

    }
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21....
      //  int a = 0;
        // int b = 1;
        // int c = 5;

        System.out.println("enter how many no. of length fibonacci series u want = ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int c = f1(d);
        System.out.println();

        System.out.println(c);


    }

}
    static int facto(int a){
        if (a==1 || a==0){
            return 1;
        }else {
            return a*facto(a-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(facto(5));
    }

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. for factorial");
        int a = sc.nextInt();
        for (int i = a-1;i>0;i--){
            a *= i;

        }
        System.out.println(a);
    }
}
    static int f1(int ...arr){
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(f1(2,4));
        System.out.println(f1());
        System.out.println(f1(5));
        System.out.println(f1(2,4,6));
        System.out.println(f1(2,4,5));
    }
}
        static void arf(){
            System.out.println("hello");
        }

    static void arf(int a){
        System.out.println("ji "+a);
    }

    static void arf(int a,int b){
        System.out.println("excuse me"+a+" "+b);
    }
    static int arf(int a,int b,int c,int d){

    }
    public static void main(String[] args) {

            arf();
            arf(2);
            arf(5,7);

    }
}
               int x = 5;
        int y = 66;
        int z ;
        Main ob = new Main();

        z = ob.f1(x,y);
        System.out.println(z);

    }
}
      int [] arr = {1,-123,0,455,-598,19};
        int b;
        for (int i =0;i< arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                b = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = b;
            }
        }
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
        // write a java program to find max and min value of an array when there present + and - value.
        int [] arr = {1,-123,0,455,-598,19};
        int b = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>b){
                b = arr[i];
            }
        }
        System.out.println(b);

        int c = Integer.MAX_VALUE;
        for (int i =0;i< arr.length;i++){
            if (arr[i]<c){
                c=arr[i];

            }
        }
        System.out.println(c);
    }
}
        // write a java program to find the maximum and minimum value of an array when every value grater than 0
        int [] arr = {1,2,4,5,6,8,4,7};
        int b =0;
        int c = 0;
        for (int i = 0; i< arr.length;i++){
            if (arr[i]>b){
                b=arr[i];

            }
        }
        System.out.println(b);

        for (int i = 0; i< arr.length;i++){
            if (arr[i]<b){
                b=arr[i];
            }
        }
        System.out.println(b);
    }
}


     write a java program to reverse an array
    int [] a = {1,2,3,4,5,6,9};
        int l = a.length;
        int b = Math.floorDiv(l,2);
        int temp;
        for (int i =0;i<b;i++ ){
            temp = a[i];
            a[i]=a[l-i-1];
            a[l-i-1]=temp;
        }

        for (int i =0 ; i<l;i++){
            System.out.print(a[i]+" ");
        }

    }
}
        int[][] a1 = {{1, 2, 3},
                        {4, 5, 6}};
        int[][] a2 = {{7, 8, 9},
                        {10, 11, 12}};
        int[][] a3 = new int[2][3];

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a3[i][j] = a1[i][j] + a2[i][j];

            }
        }
        for (int i = 0; i<a3.length;i++){
            for (int j = 0;j<a3[i].length;j++){
                System.out.print(a3[i][j]+" ");
            }
            System.out.println();
        }

    }

}
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of subjects = ");
        int a = sc.nextInt();
        int [] marks = new int[a];
        float b = 0;

        System.out.println("enter each value marks = ");
        for (int i = 0;i< marks.length;i++){
            marks[i] = sc.nextInt();
            b += marks[i];

        }
        System.out.println("the average marks is = "+b/a);



    }
}
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of length of array = ");
        int a = sc.nextInt();
        int [] arr = new int[a];
        System.out.println("enter the value of array = ");
        for (int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the no. to check whether this number is present in array or not = ");
        int b = sc.nextInt();
        boolean bl = true;
        for (int i = 0;i<arr.length;i++){
            if (b==arr[i]){
                bl = false;
                System.out.println("yes this value is present in the given array.");
                break;
            }
        }
        if (bl){
            System.out.println("sorry ! your given number is not present in this array");
        }
    }
}
         float [] a = {1.2f,2.2f,3.3f,4.4f};
        float b = 0;
        for (int i = 0; i<a.length;i++){
            b += a[i];
        }
        System.out.println(b);
        
    }
}

        int[] a = {1, 4, 3, 5, 7, 3, 7, 8, 9, 3, 2};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean c = true;
        boolean d = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                c=false;
                System.out.println("not sorted");
                break;

            }

        }
        if (c){
            System.out.println("sorted");
        }

        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] > b[i + 1]) {
                d=false;
                System.out.println("not sorted");
                break;

            }

        }
        if (d){
            System.out.println("sorted");
        }
    }

}

        int [] arr = {1,3,2,6,4,5,8};
        int temp;
        // int l = Math.floorDiv(arr.length, 2);
        for (int i = 0; i< arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

            }
        }
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
        int[] a = {1,2,4,-6,8,55,-100};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<a.length;i++){
            if (a[i]> max){
                max = a[i];
            }

        }
        System.out.println(max);

        int min = Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++){
            if (a[i]<min){
                min=a[i];

            }
        }
        System.out.println(min);
    }
}
        int [] a = {1,2,3,4,5,6,55,7};
        int max = 0;
        for (int i = 0;i<a.length;i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        System.out.println(max);

        for (int i =0;i<a.length;i++){
            if (a[i]<max){
                max=a[i];
            }
        }
        System.out.println(max);

    }

}
    //    for (int e : a){
      //      if (e<max2){
        //        max2=e;
          //  }

        //}


        int [] a = {1,2,3,4,5,6};
        for (int i =0;i<a.length;i++){

        }
    }
}
       int [] a = {1,2,3,4,5};
        int temp;
        for (int i = 0; i<Math.floorDiv(a.length,2);i++){
            temp = a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1] = temp;

        }
        for (int i : a){
            System.out.print(i+" ");
        }

    }
}
      int [] a = {1,2,3,4,5,6};

        for (int i = 5;i<=0;i--){
            for (int j = 0;j<a.length;j++){
                a[j]=a[i];

            }
        }
    }
}
      int [] a = {1,2,3,4,5};
        int [] b = new int[a.length];
        for (int i =0;i<a.length;i++){
            b[i] = a[a.length-i-1];
            
        }
        for (int c :b){
            System.out.print(c+" ");
        }
        System.out.println();
        for (int c :a){
            System.out.print(c+" ");
        }
        System.out.println();
        float e = Math.floorDiv(5,2);
        System.out.println(e);
    }
}

        int [][] a = {{1,2,3},
                     {5,6,7}};
        int [][] b = {{8,9,10},
                     {11,12,13}};
        int [][] c = new int[2][3];

        for (int i = 0 ; i<a.length;i++){
            for (int j = 0 ; j<a[i].length;j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        for (int i = 0; i<c.length;i++){
            for (int j = 0; j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
        int [] arr = {12,13,15};
        for (int a : arr){
            System.out.print(a+" ");
        }

    }
}
       Scanner sc = new Scanner(System.in);
        System.out.println("enter how many marks you want to enter");
        int a = sc.nextInt();

        int [] marks = new int[a];
        int b = 0;
        for (int i = 0; i<marks.length;i++){
            marks[i] = sc.nextInt();
            b += marks[i];
        }
        System.out.println("your average marks is = "+ b/a);

    }
}


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no.for making an array = ");
        int a = sc.nextInt();

        int [] b = new int[a];

        System.out.println("enter your value in this array  = ");
        for (int i =0;i<b.length;i++){
            b[i]=sc.nextInt();

        }
        System.out.println("enter no. for rechecking whether your no. is in array or not ");
        int c = sc.nextInt();
        int d = c+1;


        for (int i = 0; i<b.length;i++){
             if (c==b[i]){
                 System.out.println("yes,your value is present here");
             //    d = 0;
                 d = c;
             }

        }
        if (d!=c){
            System.out.println("no,your value is not here");

        }
        System.out.println(d);



      }
    }
        int [] marks = new int [5];
        int [][] flats = new int[3][3];
        int [][][] flats3 = new int[3][3][3];
        flats[0][0] = 21;
        flats[0][1] = 22;
        flats[0][2] = 23;
        flats[1][0] = 24;
        flats[1][1] = 25;
        flats[1][2] = 26;
        flats[2][0] = 27;
        flats[2][1] = 28;
        flats[2][2] = 29;
        Scanner sc = new Scanner(System.in);


        for (int i =0;i<flats3.length;i++){
            for (int j = 0;j<flats3[i].length;j++){
                for (int k = 0;k<flats3[i][j].length;k++){
                    flats3[i][j][k] = sc.nextInt();
                }
                // System.out.print(flats[i][j]+" ");
            }
          //  System.out.println("\n");
        }
        System.out.println("flats3 len"+flats3.length);
        for (int i =0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(flats3[i][j][k] + " ");
                }
                System.out.println("\n");
            }
            System.out.println("\n");

        }
      //  System.out.println(flats[5][5]);
    }


    }


       for (int i = 1; i<=4; i++){

            for (int j = i; j<=4;j++){

                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = 4 ; i>0;i--){
            for (int j = 0; j <i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */


/*
     public class Main {

         public static void main(String[] args) {

             for (int i = 15; i >= 0; i--) {
                 System.out.println(i);
                 System.out.println("java is great");
                 if (i == 10) {
                     System.out.println("its enough to check");
                     continue;
                 }
                 System.out.println(i);
             }
         }
     }
            /* int a = 4;
             while (a<10){
                 System.out.println(a);
                 a++;
                 if (a==7){
                     System.out.println("its enough");
                     break;
                 }


             }
             int b=2;
             do {
                 System.out.println(b);
                 if (b==7){
                     System.out.println("ok ho gaya");
                     break;
                 }
                 b++;

             }while (b<10);

                }
     }

            System.out.println("this is rock,scissor and paper game \n 1 is for rock \n 2 is for scissor \n 3 is for paper");
             System.out.print("enter your number = ");
             int b = sc.nextInt();
             switch (b){
                 case 1 -> System.out.println("u select rock");
                 case 2 -> System.out.println("u select scissor");
                 case 3 -> System.out.println("u select paper");
                 default -> System.out.println("please only 1 or 2 or 3");

             }

             Random random = new Random();
             int a = random.nextInt(1,4);
             System.out.println("computer number is = "+a);
             switch (a){
                 case 1 -> System.out.println("computer select rock");
                 case 2 -> System.out.println("computer select scissor");
                 case 3 -> System.out.println("computer select paper");

             }


             if (a==1 && b==1){
                 System.out.println("match tie");
             } else if (a==1 && b==2) {
                 System.out.println("computer win");
             } else if (a==1 && b==3) {
                 System.out.println("you win");
             } else if (a==2 && b==1) {
                 System.out.println("you win");
             } else if (a==2 && b==2) {
                 System.out.println("match tie");
             } else if (a==2 && b==3) {
                 System.out.println("computer win");
             } else if (a==3 && b==1) {
                 System.out.println("computer win");
             } else if (a==3 && b==2) {
                 System.out.println("you win");
             } else if (a==3 && b==3) {
                 System.out.println("match tie");
             }

*/







