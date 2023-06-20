import java.io.*;
import java.util.*;

public class Div2_441_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        /*
         Subtraction of two number is divisible by a number if their mod is same

         a = 12 b = 2
         mod = 5;
         a%mod =2 == b % mod==2

         so a-b is divisible by mod
         */

            int n = in.nextInt(),size = in.nextInt(), m = in.nextInt();

            int a[] = new int[n];
            HashMap<Integer,Integer> map = new HashMap<>();
            Map<Integer,Integer> ocr = new HashMap<>();
            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();

                int mod = a[i]%m;

                map.put(a[i],mod);
                if(!ocr.containsKey(mod)){
                    ocr.put(mod,1);
                }else {
                    ocr.put(mod,ocr.get(mod)+1);
                }
            }

            int max = Integer.MIN_VALUE;
            int val = 0;
            for (Integer i : ocr.keySet()){
                int ind = ocr.get(i);

                if(ind>=max){
                    max = ind;
                    val = i;
                }
            }



            if(max>=size){
                ArrayList<Integer> l = new ArrayList<>();
                for (int i = 0;i<n;i++){
                    if(map.get(a[i])==val){
                        l.add(a[i]);

                        if(l.size()==size){
                            break;
                        }
                    }
                }

                pw.println("Yes");
                for (Integer i:l){
                    pw.print(i+" ");
                }

            }
            else {
                pw.print("No");
            }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
