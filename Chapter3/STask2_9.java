public class STask2_9 {
    public static void countLowerAndUpperLetters(String line) {
        int lower = 0, upper = 0;
        for (char ch : line.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= 'A' && ch <= 'Z')
                upper++;
        }
        System.out.println("Letters in lower case: " + lower);
        System.out.println("Letters in upper case: " + upper);
    }

    public static void main(String[] args) {
        String line = "aaaaaaaaaaaaAAAsdsafsdf";
        countLowerAndUpperLetters(line);
    }
}
