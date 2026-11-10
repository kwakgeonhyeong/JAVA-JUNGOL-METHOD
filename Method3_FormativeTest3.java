import java.util.Scanner;

class Main {

    static int N, M;
    static int[] dice;

    // 입력을 받는 함수
    public static void inputData(Scanner sc) {
        N = sc.nextInt();
        M = sc.nextInt();
        dice = new int[N];
    }

    // 재귀적으로 주사위 눈을 결정하는 함수
    // index : 현재 몇 번째 주사위인지
    // sum : 현재까지 나온 눈의 합
    public static void findCombination(int index, int sum) {
        if (index == N) {
            if (sum == M) {
                printResult();
            }
            return;
        }

        for (int i = 1; i <= 6; i++) {
            // 가지치기: 남은 주사위로 만들 수 있는 최소/최대 합을 이용해 불필요한 탐색 방지
            int remaining = N - index - 1;
            int minPossible = sum + i + remaining * 1;
            int maxPossible = sum + i + remaining * 6;

            if (minPossible <= M && maxPossible >= M) {
                dice[index] = i;
                findCombination(index + 1, sum + i);
            }
        }
    }

    // 결과를 출력하는 함수
    public static void printResult() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(dice[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inputData(sc);              // N, M 입력
        findCombination(0, 0);      // 재귀적으로 모든 경우 탐색

        sc.close();
    }
}
