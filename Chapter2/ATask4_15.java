public class ATask4_15 {
    public static boolean is_increasing(int a) {
        int oldNum = 11;
        int curNum = 10;
        while (a > 0 && curNum < oldNum) {
            oldNum = curNum;
            curNum = (a % 10);
            a /= 10;
        }
        if (curNum < oldNum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(Math.pow(10, n));
        for (int i = 0; i <= Math.pow(10, n); i++) {
            if (is_increasing(i)) {
                System.out.println(i);
            }
        }
        System.out.println(is_increasing(678));
    }
}
