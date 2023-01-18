package AnujBhaiyaDSA;

public class Video_7_ModuloArithmetic {
    // to get power of any number

    public static int fastPower(int number,int power){
        int res = 1;
        while (power > 0){
            if ((power&1) != 0){
                res *= number;
            }
            number = number*number;
            power = power>>1;
        }
        return res;
    }

    //to get power of big number using modulo
    public static long fastPower2(long number,long power,int n){
        long res =1;
        while(power>0){
            if ((power&1) != 0){
                res = (res%n * number%n)%n;
            }
            number = (number%n * number%n)%n;
            power = power>>1;
        }
        return res;
    }
    public static void main(String[] args) {

        // to get power of any number
        // 3^11
        System.out.println(fastPower(3,11));

        // to get power of big number
        System.out.println(fastPower2(3978432,5,1000000007));


    }
}
