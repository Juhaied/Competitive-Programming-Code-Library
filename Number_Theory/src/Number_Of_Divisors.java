import java.util.Arrays;
import java.util.Scanner;

public class Number_Of_Divisors {

    static int MAX = 100010;
    static int NOD[] =  new int[MAX];
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        NOD_Func();

        debug(NOD[6]);
    }


    static void NOD_Func()
    {
        for(int i = 1;i<MAX;i++) {
            for(int j = i;j<MAX;j+=i) {
                NOD[j]++;
            }
        }
    }


    static void debug(Object...obj){
        System.err.println(Arrays.deepToString(obj));
    }


}
