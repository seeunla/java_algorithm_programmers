import java.util.Scanner;

public class P2579_계단오르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] D = new int[n+1];
        int[] C = new int[n+1];
        for (int i =1; i<=n; i++) {
            C[i] = sc.nextInt();
        }

        D[1] = C[1];
        if (n > 1) {
            D[2] = C[1] + C[2];
        }
        for(int i = 3; i<=n; i--) {
            D[i] = Math.max(D[i-2], D[i-3] + C[i-1]) + C[i];
        }

        System.out.println(D[n]);
    }
}
