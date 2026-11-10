import java.util.Scanner;

class Main {

    // 원주율을 매크로 상수처럼 정의 (Java는 매크로가 없으므로 static final 상수로 대체)
    static final double PI = 3.141592;

    // 원의 넓이를 구하는 매크로 함수처럼 정의 (Java는 매크로 함수가 없으므로 static 메서드로 대체)
    static double CIRCLE_AREA(double r) {
        return PI * r * r;
    }

    // 입력을 받는 함수
    public static double inputRadius(Scanner sc) {
        System.out.print("radius : ");
        return sc.nextDouble();
    }

    // 소수 넷째자리에서 반올림하는 함수 (셋째자리까지 표현)
    public static double roundToThird(double value) {
        return Math.round(value * 1000.0) / 1000.0;
    }

    // 결과를 출력하는 함수
    public static void printResult(double area) {
        System.out.println(area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = inputRadius(sc);     // 반지름 입력
        double area = CIRCLE_AREA(radius);   // 원의 넓이 계산
        double rounded = roundToThird(area); // 소수 넷째자리에서 반올림

        printResult(rounded); // 결과 출력

        sc.close();
    }
}
