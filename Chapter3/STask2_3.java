public class STask2_3 {
    public static boolean isPalidrom(String line) {
        StringBuilder sb = new StringBuilder(line);
        return line.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        String x = "шалаш";
        System.out.println(isPalidrom(x));
    }
}
