import java.util.*;
public class Div1_134_A {
    static int x[],y[];
    static boolean visited[];
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        x=new int[n];
        y=new int[n];
        visited=new boolean[n];
        for(int i=0;i<n;i++)
        {
            x[i]=input.nextInt();
            y[i]=input.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                dfs(i);
                max++;
            }
        }
        System.out.println(max-1);
    }
    public static void dfs(int index)
    {
        visited[index]=true;
        for(int i=0;i<x.length;i++)
        {
            if(!visited[i]&&(x[i]==x[index]||y[i]==y[index]))
                dfs(i);
        }
    }
}
