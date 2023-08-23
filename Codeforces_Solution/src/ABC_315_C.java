import java.util.*;
import java.util.stream.Collectors;

public class ABC_315_C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int flavor[] = new int[n];
        int value[] = new int[n];

        ArrayList<Integer>[] values = new ArrayList[n];
        for(int i = 0; i < n; i++){
            values[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < n; i++){
            int f = sc.nextInt() - 1;
            int s = sc.nextInt();

            values[f].add(s);
        }

        Arrays.stream(values).forEach(l -> {
            Collections.sort(l, (e1, e2) -> e2 - e1);});

        int[] tops = new int[n];
        for(int i = 0; i < n; i++){
            if(values[i].isEmpty()) {
                continue;
            }
            tops[i] = values[i].get(0);
        }

        Arrays.sort(tops);

        int result = tops[n - 1] + tops[n - 2];

        for(int i = 0; i < n; i++){
            if(values[i].size() < 2) {
                continue;
            }
            int tmp = values[i].get(0) + values[i].get(1)/2;

            result = Math.max(result, tmp);
        }

        System.out.println(result);
    }
}