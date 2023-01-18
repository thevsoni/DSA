package AnujBhaiyaDSA;

public class Video_3_BitMasking {
    public static void main(String[] args) {
        // find number of bit to change to convert a to b
        int a = 10;
        int b = 15;
        int operate = a^b;
        int count = 0;
        while (operate != 0){
            if ((operate & 1) ==1){
                count++;
            }
            operate =  operate>>1;
        }
        System.out.println(count);

        //2nd method
        a=10;
        b=15;
        operate = a^b;
        count=0;
        while (operate != 0){
            operate = operate&(operate-1);
            count++;
        }
        System.out.println(count);
    }
}