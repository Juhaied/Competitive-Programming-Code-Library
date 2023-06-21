import java.util.Arrays;
import java.util.Scanner;

public class Sum_OF_Divisors {

    static int MAX = 100010;
    static int SOD[] =  new int[MAX];
    static int NOD[] =  new int[MAX];
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        SOD_Func();

        debug(SOD[12]);

    }

    static void SOD_Func() {

        for(int i = 1;i<MAX;i++) {
            for(int j = i;j<MAX;j+=i) {
                SOD[j] += i;
            }
        }
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
