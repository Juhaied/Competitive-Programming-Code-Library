import java.io.*;
import java.util.*;

public class Div3_855A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            String s = in.next();

            String s1 ="meow",s2 = "MEOW";
            int c = 0;
            if(n<=3){
                pw.println("NO");
            }
            else {
                int ind = 0;
                char ch = 'a';
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == 'm' || s.charAt(i) == 'M') {
                        continue;
                    } else {
                        ch = s.charAt(i);
                        ind = i;
                        break;
                    }
                }


                if (ch == 'e' || ch == 'E') {
                    for (int i = ind; i < s.length(); i++) {
                        if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                            continue;
                        } else {
                            ch = s.charAt(i);
                            ind = i;
                            break;
                        }
                    }

                    if (ch == 'O' || ch == 'o') {
                        for (int i = ind; i < s.length(); i++) {
                            if (s.charAt(i) == 'o' || s.charAt(i) == 'O') {
                                continue;
                            } else {
                                ch = s.charAt(i);
                                ind = i;
                                break;
                            }
                        }

                        boolean flag = true;
                        if (ch == 'W' || ch == 'w') {
                            for (int i = ind; i < s.length(); i++) {
                                if (s.charAt(i) == 'w' || s.charAt(i) == 'W') {
                                    continue;
                                } else {
                                    flag = false;
                                    //pw.println("NO");
                                    break;
                                }
                            }

                            if (flag) {
                                pw.println("YES");
                            } else {
                                pw.println("NO");
                            }
                        } else {
                            pw.println("NO");
                        }
                    } else {
                        pw.println("NO");
                    }
                } else {
                    pw.println("NO");
                }
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
