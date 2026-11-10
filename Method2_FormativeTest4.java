import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static int inputN(Scanner sc) {
        return sc.nextInt();
    }

    // 2의 n제곱을 계산하는 함수
    public static long calculatePower(int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= 2;
        }
        return result;
    }

    // 결과를 출력하는 함수
    public static void printResult(long result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = inputN(sc);              // n 입력
        long result = calculatePower(n); // 2^n 계산

        printResult(result); // 결과 출력

        sc.close();
    }
}
