import java.io.*;
import java.util.*;

public class Div2_651_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Integer> odd = new ArrayList<>();
            ArrayList<Integer> even = new ArrayList<>();

            int oc = 0,ec = 0;
            for(int i = 1;i<=n*2;i++){
                int v = in.nextInt();

                if(v %2==0){
                    ec++;
                    even.add(i);
                }
                else {
                    oc++;
                    odd.add(i);
                }
            }

            //debug(oc);
            if(n==2){
                pw.println(1+" "+2);
            }
            else if(oc==n*2){
                for(int i =1;i<=n*2-2;i+=2){
                    pw.println(i+" "+(i+1));
                }
            }
            else if((oc/2)== n-1){
                for(int i =1;i<=n-1;i++){
                    pw.println(odd.remove(0)+" "+odd.remove(0));
                }
            }
            else {

                int cnt = odd.size() / 2;
                HashMap<Integer, Integer> map = new HashMap<>();

                while (true) {
                    if (map.size() == n - 1) break;
                    else if (odd.size() == 0 || odd.size() == 1) break;
                    else {
                        map.put(odd.remove(0), odd.remove(0));
                    }
                }


                if (map.size() == n - 1) {
                    continue;
                } else {
                    while (true) {
                        if (map.size() == n - 1) break;
                        else if (even.size() == 0 || even.size() == 1) break;
                        else {
                            map.put(even.remove(0), even.remove(0));
                        }
                    }
                }

                for (Integer i : map.keySet()) {
                    pw.println(i + " " + map.get(i));
                }
            }

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
