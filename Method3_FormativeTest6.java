import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static long[] inputNumbers(Scanner sc, int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        return arr;
    }

    // 세 수의 곱을 구하는 함수
    public static long multiply(long[] arr) {
        long result = 1;
        for (long num : arr) {
            result *= num;
        }
        return result;
    }

    // 재귀함수로 각 자리 숫자 중 0을 제외한 수들의 곱을 구하는 함수
    public static long digitProduct(long n) {
        if (n == 0) return 1; // 재귀 종료 조건 (더 이상 자리가 없음)

        long digit = n % 10;      // 마지막 자리 숫자
        long remain = n / 10;     // 나머지 자리 숫자들

        if (digit == 0) {
            return digitProduct(remain); // 0이면 곱하지 않고 다음 자리로
        } else {
            return digit * digitProduct(remain); // 0이 아니면 곱함
        }
    }

    // 결과를 출력하는 함수
    public static void printResult(long result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] arr = inputNumbers(sc, 3);   // 3개의 자연수 입력
        long product = multiply(arr);       // 세 수의 곱 계산
        long result = digitProduct(product); // 곱의 각 자리 숫자(0 제외) 곱 계산

        printResult(result); // 결과 출력

        sc.close();
    }
}
