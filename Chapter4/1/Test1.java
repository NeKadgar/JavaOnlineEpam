public class Test1 {
    private int a, b;

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int get_a() {
        return a;
    }

    public int get_b() {
        return b;
    }

    public boolean set_a(int a) {
        this.a = a;
        return true;
    }

    public boolean set_b(int b) {
        this.b = b;
        return true;
    }

    public void print_vars() {
        System.out.println("a: " + a + " b: " + b);
    }

    public int sum() {
        return a + b;
    }

    public int max() {
        return Math.max(a, b);
    }
}
