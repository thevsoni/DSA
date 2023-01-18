package AnujBhaiyaDSA;

public class Video_9_josephus {
    public static int jsp(int n,int k){
        if (n==1){
            return 0;
        }
        return (jsp(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        System.out.println(jsp(5,3));


    }
}
