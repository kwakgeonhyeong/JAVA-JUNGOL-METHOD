import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static double[] inputNumbers(Scanner sc, int n) {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        return arr;
    }

    // 합계를 구하는 함수
    public static double getSum(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }

    // 평균을 구하는 함수
    public static double getAverage(double sum, int n) {
        return sum / n;
    }

    // 반올림하는 함수
    public static long roundValue(double value) {
        return Math.round(value);
    }

    // 배열의 각 원소를 반올림한 새 배열을 만드는 함수
    public static double[] roundArray(double[] arr) {
        double[] rounded = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rounded[i] = Math.round(arr[i]);
        }
        return rounded;
    }

    // 결과를 출력하는 함수
    public static void printResult(long result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;

        double[] arr = inputNumbers(sc, n); // 세 실수 입력

        // 1. 먼저 합계와 평균을 구한 후 평균을 반올림
        double sum1 = getSum(arr);
        double avg1 = getAverage(sum1, n);
        long result1 = roundValue(avg1);
        printResult(result1);

        // 2. 각 수를 먼저 반올림한 후 합계와 평균을 구하고 평균을 반올림
        double[] roundedArr = roundArray(arr);
        double sum2 = getSum(roundedArr);
        double avg2 = getAverage(sum2, n);
        long result2 = roundValue(avg2);
        printResult(result2);

        sc.close();
    }
}
