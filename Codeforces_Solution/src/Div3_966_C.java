import java.util.*;

public class Div3_966_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int test = 0;test<t;test++) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int m = sc.nextInt();
            for (int i = 0;i<m;i++) {
                String s = sc.next();

                if (matchesTemplate(a, s)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }

    private static boolean matchesTemplate(int[] a, String s) {
        if (a.length != s.length()) return false;

        HashMap<Integer, Character> mapAtoS = new HashMap<>();
        HashMap<Character, Integer> mapStoA = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int number = a[i];
            char letter = s.charAt(i);
            
            if (mapAtoS.containsKey(number)) {
                if (mapAtoS.get(number) != letter) return false;
            } else {
                mapAtoS.put(number, letter);
            }

            if (mapStoA.containsKey(letter)) {
                if (mapStoA.get(letter) != number) return false;
            } else {
                mapStoA.put(letter, number);
            }
        }

        return true;
    }
}