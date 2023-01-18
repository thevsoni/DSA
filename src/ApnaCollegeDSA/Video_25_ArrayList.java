package ApnaCollegeDSA;

import java.util.ArrayList;
import java.util.Collections;

class Sstudent {
    public static void ss(){
        System.out.println("ha ha you man !");
    }
}
public class Video_25_ArrayList {
    public static void main(String[] args) {

        Sstudent.ss();
        Sstudent sss = new Sstudent();
        sss.ss();

        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);
        al.add(2);
        al.add(3);
//        al.remove("");
        al.remove(2);

        //arraylist print
        System.out.println(al);
        al.add(6);
        al.add(5);
        al.add(3);
        al.add(4);
        System.out.println(al);


        // sorting
        Collections.sort(al);
        System.out.println(al);

        StringBuilder sb = new StringBuilder("hellohello");
        sb.delete(0,1);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);

    }
}
