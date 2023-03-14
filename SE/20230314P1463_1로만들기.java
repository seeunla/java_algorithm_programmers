public class P1463_1로만들기 {
  static int N;
  static int D[];
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    D = new int[N+1];
    D[1] =0; // 1일 때 연산 불필요
    for (int i =2; i<=N; i++) {
      D[i] = D[i-1] +1; // -1 연산 가능할 때
      if (i % 2 == 0) D[i] = Math.min(D[i], D[i/2]+1); // 나누기 2 연산 가능할 때
      if (i % 3 == 0) D[i] = Math.min(D[i], D[i/3]+1); // 나누기 3 연산 가능할 때
    }
    System.out.println(D[N]);
  }
}
