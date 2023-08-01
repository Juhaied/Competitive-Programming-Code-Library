
import java.util.*;
import java.io.*;
import java.util.*;
import java.io.*;
public class Div3_713_C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t=in.nextInt();
        l:for (int test = 1;test<=t;test++) {
            int a=in.nextInt();//0
            int b=in.nextInt();//1
            char ch[]=in.next().toCharArray();
            int n=ch.length;
            for(int i=0;i<n/2;i++) {
                if(ch[i]!=ch[n-i-1]) {
                    if(ch[i]=='?')ch[i]=ch[n-i-1];
                    else if(ch[n-i-1]=='?')ch[n-i-1]=ch[i];
                    else {
                        System.out.println(-1);
                        continue l;
                    }
                    if(ch[i]=='1'||ch[n-i-1]=='1')b-=2;
                    else a-=2;
                }else {
                    if(ch[i]=='0')a-=2;
                    else if(ch[i]=='1')b-=2;
                }
            }

            if(n%2==1) {
                if(ch[n/2]!='?') {
                    if(ch[n/2]=='1') b--;
                    else a--;
                }else {
                    if(b%2==1) {
                        b--;
                        ch[n/2]='1';
                    }else {
                        a--;
                        ch[n/2]='0';
                    }
                }

            }
            if(a%2==1||b%2==1) {
                System.out.println(-1);
                continue;
            }
            for(int i=0;i<n/2;i++) {
                if(ch[i]=='?'&&a>0) {
                    ch[i]='0';
                    ch[n-i-1]='0';
                    a-=2;
                }else if(ch[i]=='?'&&b>0){
                    ch[i]='1';
                    ch[n-i-1]='1';
                    b-=2;
                }
            }
            if(a<0||b<0) {
                System.out.println(-1);
                continue l;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<n;i++) {
                sb.append(ch[i]);
            }
            System.out.println(sb);
        }
    }
}












