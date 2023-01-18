package ApnaCollegeDSA;

//OOPs concept

// static
class  Student{
    String name;
    static String school;
//     String school ="SSM";

}
public class Video_24_OOPs {
    public static void main(String[] args) {
        Student.school="SSM";
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name="vishal soni";
        s2.name="harry";

        System.out.println(s1.name+" "+s1.school);
        System.out.println(s2.name+" "+s2.school);

    }
}
/*
// interface
interface Animal{
    int eyes = 2;
    default void a(){
        System.out.println(eyes);
    }
}
class Monkey implements Animal{

}
public class Video_24_OOPs {
    public static void main(String[] args) {

        Monkey m = new Monkey();
        m.a();
//        System.out.println(m.ey);

    }
}


// constructor
class Pen{
    String color;
    String type;

    Pen(){
        System.out.println("this is blank \" constructor of pen1 \" ");
    }
    Pen(Pen p){
        System.out.println("this is parameterized \" constructor of pen1 \" ");
        color=p.color;
        type=p.type;
    }
}
class Pen2 extends Pen{
    Pen2(Pen p){
        super(p);
        System.out.println("this is blank \" constructor of pen2 \" ");
    }
}
public class Video_24_OOPs {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "thin";
        Pen p2 = new Pen(p1);

        System.out.println(p1.color);
        System.out.println(p1.type);

        System.out.println(p2.color);
        System.out.println(p2.type);

        Pen2 p22 = new Pen2(p1);
        System.out.println(p22.color);
        System.out.println(p22.type);
    }
}
*/