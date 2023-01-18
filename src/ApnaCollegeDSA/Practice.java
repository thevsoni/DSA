package ApnaCollegeDSA;
import javax.management.ListenerNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int operate = a^b;
        int count = 0;
        while (operate != 0){
            if ((operate & 1) ==1){
                count++;
            }
           operate =  operate<<1;
        }
        System.out.println(count);
    }
}