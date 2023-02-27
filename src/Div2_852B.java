import java.util.Scanner;

public class Div2_852B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int T = in.nextInt();
        for (int t=0; t<T; t++) {
            int max = in.nextInt();
            int min = in.nextInt();
            int length = 2*(max-min);
            out.append(length).append('\n');
            for (int i=min; i<max; i++) {
                out.append(i).append(' ');
            }
            for (int i=max; i>min; i--) {
                out.append(i).append(' ');
            }
            out.append('\n');
        }
        System.out.print(out);
    }

}
