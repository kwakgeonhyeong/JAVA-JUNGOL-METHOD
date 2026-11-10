import java.util.Scanner;

class Main {

    // 입력을 받는 함수
    public static double[] inputNumbers(Scanner sc) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        return new double[]{a, b};
    }

    // 제곱근을 구하는 함수
    public static double[] getSquareRoots(double a, double b) {
        double sqrtA = Math.sqrt(a);
        double sqrtB = Math.sqrt(b);
        return new double[]{sqrtA, sqrtB};
    }

    // 두 제곱근 사이의 정수 개수를 구하는 함수
    public static int countIntegersBetween(double low, double high) {
        // low가 high보다 크면 교환
        if (low > high) {
            double temp = low;
            low = high;
            high = temp;
        }

        // 부동소수점 오차 보정
        double eps = 1e-9;

        int ceilLow = (int) Math.ceil(low - eps);
        int floorHigh = (int) Math.floor(high + eps);

        int count = floorHigh - ceilLow + 1;
        return Math.max(count, 0);
    }

    // 결과를 출력하는 함수
    public static void printResult(int count) {
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nums = inputNumbers(sc);
        double[] roots = getSquareRoots(nums[0], nums[1]);

        int result = countIntegersBetween(roots[0], roots[1]);
        printResult(result);

        sc.close();
    }
}
