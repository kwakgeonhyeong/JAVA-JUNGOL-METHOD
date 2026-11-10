import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[3][3];

        input(sc, score);
        printResult(score);
    }

    public static void input(Scanner sc, int[][] score) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                score[i][j] = sc.nextInt();
            }
        }
    }

    public static void printResult(int[][] score) {
        int[] subjectSum = new int[3];
        int total = 0;

        for (int i = 0; i < 3; i++) {
            int studentSum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print(score[i][j] + " ");
                studentSum += score[i][j];
                subjectSum[j] += score[i][j];
            }
            System.out.println(studentSum);
            total += studentSum;
        }

        for (int j = 0; j < 3; j++) {
            System.out.print(subjectSum[j] + " ");
        }
        System.out.println(total);
    }
}
