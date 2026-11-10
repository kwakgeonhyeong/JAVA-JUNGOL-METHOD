import java.util.Scanner;

class Main {

    static final int SIZE = 7; // 매크로 상수로 자료의 개수 정의

    // 입력을 받는 함수
    public static int[] inputArray(Scanner sc) {
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // 한 번의 비교-교환 과정을 수행하는 함수 (앞에서부터 끝까지)
    public static void bubblePass(int[] arr) {
        for (int i = 0; i < SIZE - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    // 세 번의 패스를 반복하는 함수
    public static void repeatBubble(int[] arr, int times) {
        for (int t = 0; t < times; t++) {
            bubblePass(arr);
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

        int[] arr = inputArray(sc);   // 7개의 정수 입력
        repeatBubble(arr, 3);         // 비교-교환 과정을 3번 반복

        printArray(arr); // 결과 출력

        sc.close();
    }
}
