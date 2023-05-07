import java.io.*;
import java.util.*;

public class Dp_Photo_to_Remeber_Codeforces_522B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        int a[] = new int[n],b[] = new int[n];

        ArrayList<Integer> list = new ArrayList<>();

        long sum = 0l;

        for (int i = 0;i<n;i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            list.add(b[i]);

            sum+=a[i];
        }
        Collections.sort(list);
        int max = Collections.max(list);
        for(int i = 0;i<n;i++){
            if(max==b[i]){
                pw.print((sum-a[i])* list.get(n-2)+" ");
            }
            else{
                pw.print(((sum-a[i])*max)+" ");
            }
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
