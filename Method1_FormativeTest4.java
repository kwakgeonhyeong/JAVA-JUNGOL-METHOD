import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(squareDiff(a, b));
    }

    public static int squareDiff(int a, int b) {
        int large = Math.max(a, b);
        int small = Math.min(a, b);
        return large * large - small * small;
    }
}
