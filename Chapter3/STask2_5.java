public class STask2_5 {
    public static void main(String[] args) {
        String line = "aaaaaaaaaaaaAAAsdsafsdf";
        int count = line.length() - line.replaceAll("a", "").length();
        System.out.println(count);
    }
}
