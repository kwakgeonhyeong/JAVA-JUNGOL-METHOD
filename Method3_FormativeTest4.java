import java.util.Scanner;

class Main {

    static int[] memo = new int[101];
    static boolean[] visited = new boolean[101];

    // 입력을 받는 함수
    public static int inputN(Scanner sc) {
        return sc.nextInt();
    }

    // 재귀함수로 n번째 값을 구하는 함수 (메모이제이션 사용)
    public static int getValue(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (visited[n]) return memo[n]; // 이미 계산된 값이면 재사용

        int result = (getValue(n - 1) * getValue(n - 2)) % 100;

        visited[n] = true;
        memo[n] = result;

        return result;
    }

    // 결과를 출력하는 함수
    public static void printResult(int result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = inputN(sc);        // N 입력
        int result = getValue(n);  // 재귀함수로 n번째 값 계산

        printResult(result); // 결과 출력

        sc.close();
    }
}
