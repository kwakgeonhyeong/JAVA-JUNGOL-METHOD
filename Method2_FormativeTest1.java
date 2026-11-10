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

    // 내림차순 정렬 함수 (버블 정렬)
    public static void sortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 출력하는 함수
    public static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // N 입력
        int[] arr = inputArray(sc, n); // N개의 정수 입력

        sortDescending(arr); // 내림차순 정렬
        printArray(arr); // 결과 출력

        sc.close();
    }
}
