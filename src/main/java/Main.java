public class Main {
    public int gcd(int x, int y) {
        if (x < 1 || y < 1 || y > 300 || x > 300)
            return -1;
        if (x == y && x != 1)
            return 0;
        int a = Math.max(x, y); // a is greater number
        int b = Math.min(x, y); // b is smaller number
        int r = b;
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        if (r == 1)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.printf(""+10%0);
    }
}
