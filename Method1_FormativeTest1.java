class Main {
    public static void main(String[] args) {
        System.out.println("first");
        printAt();

        System.out.println("second");
        printAt();

        System.out.println("third");
        printAt();
    }

    public static void printAt() {
        for (int i = 0; i < 10; i++) {
            System.out.print("@");
        }
        System.out.println();
    }
}
