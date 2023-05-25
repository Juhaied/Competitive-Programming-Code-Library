import java.io.PrintWriter;
import java.util.*;

public class Edu_148_C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int test = in.nextInt();
        for(int t = 1;t<=test;t++){
            String s = in.next();
            char prev = '0';
            StringBuilder sb = new StringBuilder();
            if(!s.contains("?")){
                pw.println(s);
            }
            else {
                for (int i = 0;i<s.length();i++){
                    if(s.charAt(i)=='?'){
                        if(prev=='0'){
                            sb.append('0');
                            prev='0';
                        }
                        else {
                            prev='1';
                            sb.append('1');
                        }
                    }
                    else{
                        sb.append(s.charAt(i));
                        prev=s.charAt(i);
                    }
                }

                pw.println(sb.toString());
            }
        }
        pw.close();

    }

    static  void debug(Object...obj){
        System.err.println(Arrays.deepToString(obj));
    }
}