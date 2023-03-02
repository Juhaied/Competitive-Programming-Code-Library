import java.io.*;
import java.util.*;

public class Div3_855C2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long answer = 0;
            PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());

            for(int i = 0;i<n;i++){
                long v = in.nextLong();

                if(v ==0){
                    if(!pq.isEmpty()) {
                        answer += pq.poll();
                    }
                }
                else {
                    pq.add(v);
                }
            }
            pw.println(answer);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
