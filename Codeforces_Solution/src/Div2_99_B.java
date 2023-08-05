import java.io.*;
import java.util.*;

public class Div2_99_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

       int n = in.nextInt();

       HashMap<Integer,Integer> map = new HashMap<>();

       for (int i = 0;i<n;i++){
           int v = in.nextInt();

           map.put(v,map.getOrDefault(v,0)+1);
       }

       ArrayList<Integer> list = new ArrayList<>();

       for (Integer i : map.values()){
           if(i>=2){
               if(i % 2!=0){
                   i--;
               }

               list.add(i);
           }
       }

       Collections.sort(list);

       int a[] = new int[list.size()];
       a = collections_toArray(list);

       int ans = 0;

       for (int i = 0;i<list.size();i++){
         //  debug(i);
           if(i+1==list.size()){
               ans+=(a[i]/4);
           }
           else {
                   if (a[i] >= 4) {
                       ans += a[i] / 4;
                       a[i + 1] += (a[i] % 4);
                   } else {
                       a[i + 1] += a[i];
                   }

           }
       }

       pw.println(ans);
      // debug(list);
       pw.close();
    }

    static int[] collections_toArray(ArrayList<Integer> list){
        int a[] = new int[list.size()];

        for(int i =0;i<list.size();i++){
            a[i] = list.get(i);
        }

        return a;
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
