import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static int inputN(Scanner sc) {
        return sc.nextInt();
    }

    // 재귀함수로 나누는 횟수를 구하는 함수
    public static int countDivide(int n) {
        if (n == 1) return 0; // 1이 되면 종료

        if (n % 2 == 0) {
            return 1 + countDivide(n / 2); // 짝수면 2로 나눔
        } else {
            return 1 + countDivide(n / 3); // 홀수면 3으로 나눔 (몫)
        }
    }

    // 결과를 출력하는 함수
    public static void printResult(int result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = inputN(sc);            // N 입력
        int result = countDivide(n);   // 재귀적으로 나누는 횟수 계산

        printResult(result); // 결과 출력

        sc.close();
    }
}
