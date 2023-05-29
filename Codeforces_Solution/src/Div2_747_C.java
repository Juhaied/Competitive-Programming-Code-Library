import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Div2_747_C {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int test = in.nextInt();

        for(int t = 1;t<=test;t++){
            int n = in.nextInt();
            char ch = in.next().charAt(0);

            String s = in.next();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)!=ch){
                    list.add(i+1);
                }
            }

            if(list.size()==0){
                pw.println(0);
            }
            else {
                int indx = -1;
                // boolean flag = true;
                char str[] = s.toCharArray();
                for (int i = 1;i<=n;i++){
                    boolean flag = true;
                    for(int j = i;j<=n;j+=i){
                        if(str[j-1] != ch){
                            flag =false;
                            break;
                        }
                    }

                    if(flag) indx = i;
                }

                if(indx==-1){
                    pw.println(2);
                    pw.println((n-1)+" "+n);
                }
                else {
                    pw.println(1);
                    pw.println(indx);
                }
            }

        }
        pw.close();
    }

    static void debug(Object...obj){
        System.err.println(Arrays.deepToString(obj));
    }
}