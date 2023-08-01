import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Div1Plus2_854_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder out = new StringBuilder();
        int T = in.nextInt();
        for (int t=0; t<T; t++) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int n=0; n<N; n++) {
                A[n] = in.nextInt();
            }
            List<Point> list = new ArrayList<>();
            while (true) {
                int min = Integer.MAX_VALUE;
                int minIdx = -1;
                int max = Integer.MIN_VALUE;
                int maxIdx = -1;
                for (int i=0; i<N; i++) {
                    if (A[i] < min) {
                        min = A[i];
                        minIdx = i;
                    }
                    if (A[i] > max) {
                        max = A[i];
                        maxIdx = i;
                    }
                }
                if (min == max) {
                    break;
                }
                if (min == 1 && max != 1) {
                    list = null;
                    break;
                }
                list.add(new Point(maxIdx+1, minIdx+1));
                A[maxIdx] = (A[maxIdx]+A[minIdx]-1)/A[minIdx];
            }
            if (list == null) {
                out.append("-1\n");
            } else {
                out.append(list.size()).append('\n');
                for (Point p : list) {
                    out.append(p.x).append(' ').append(p.y).append('\n');
                }
            }
        }
        pw.println(out);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
