import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static int[] inputArray(Scanner sc, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // 절댓값의 합을 구하는 함수
    public static int sumOfAbs(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += Math.abs(num);
        }
        return sum;
    }

    // 출력하는 함수
    public static void printResult(int result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = inputArray(sc, 5); // 5개의 정수 입력
        int result = sumOfAbs(arr);    // 절댓값의 합 계산

        printResult(result); // 결과 출력

        sc.close();
    }
}
