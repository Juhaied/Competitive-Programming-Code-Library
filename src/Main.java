import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }


            // find the GCD of all the elements in the array
            int g = a[0];
            for (int i = 1; i < n; i++) {
                g = gcd(g, a[i]);
            }

            // check if the array can be "good"
            if (g > n) {
                System.out.println("NO");
            } else {
                // reorder the array
                Arrays.sort(a);

                // check if all the prefixes of the reordered array are "good"
                for (int i = 1; i < n; i++) {
                    int prefix_gcd = gcd(a[0], a[i]);
                    for (int j = i + 1; j < n; j++) {
                        prefix_gcd = gcd(prefix_gcd, a[j]);
                        if (prefix_gcd > i + 1) {
                            System.out.println("NO");
                            return;
                        }
                    }
                }
                System.out.println("YES");
            }
        }
    }

    // utility function to find the GCD of two numbers
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
