import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {

    // 입력을 받는 함수
    public static int inputN(Scanner sc) {
        return sc.nextInt();
    }

    // 수열을 생성하는 함수
    // N에서 시작해서 2로 나눈 몫을 반복적으로 구해 1이 될 때까지 저장
    public static ArrayList<Integer> makeSequence(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int cur = n;
        list.add(cur);
        while (cur > 1) {
            cur = cur / 2;
            list.add(cur);
        }
        Collections.reverse(list); // 역순으로 뒤집어 1부터 N 순서로 만듦
        return list;
    }

    // 출력하는 함수
    public static void printSequence(ArrayList<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = inputN(sc);                      // N 입력
        ArrayList<Integer> result = makeSequence(n); // 수열 생성

        printSequence(result); // 결과 출력

        sc.close();
    }
}
