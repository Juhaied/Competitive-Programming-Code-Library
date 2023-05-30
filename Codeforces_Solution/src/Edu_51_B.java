import java.io.*;
import java.util.*;

public class Edu_51_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long left = in.nextLong(), right =in.nextLong();

        long range = (right-left)+1;

        if(range/2 >=(right-left+1)/2){
            pw.println("YES");
            Map<Long,Long> map = new HashMap<>();
            for(long i = left; ; i+=2){
                map.put(i,i+1);

                if(map.size()==(right-left+1)/2){
                    break;
                }
            }

            for(Long i :map.keySet()){
                pw.println(i+" "+map.get(i));
            }
        }
        else {
            pw.println("NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
