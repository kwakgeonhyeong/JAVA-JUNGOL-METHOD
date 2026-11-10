import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static int inputN(Scanner sc) {
        return sc.nextInt();
    }

    // 재귀적으로 출력하는 함수
    // start : 시작값 (N이 홀수면 1, 짝수면 2)
    // n : 마지막 값
    public static void printRecursive(int cur, int n) {
        if (cur > n) return; // 종료 조건

        System.out.print(cur);
        if (cur + 2 <= n) System.out.print(" ");

        printRecursive(cur + 2, n); // 다음 값 호출 (2씩 증가)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = inputN(sc); // N 입력

        int start = (n % 2 == 0) ? 2 : 1; // N이 짝수면 2부터, 홀수면 1부터
        printRecursive(start, n);         // 재귀함수 호출

        System.out.println(); // 줄바꿈

        sc.close();
    }
}
