public class Demo {
    public static void main(String[] args) {
        int zahl1 = 4;
        int zahl2 = 8;
        System.out.printf("Was ist %d summiert mit %d: %d", zahl1, zahl2, add(zahl1, zahl2));
    }

    public static int add(int a, int b) {
        return (a + b);
    }
}