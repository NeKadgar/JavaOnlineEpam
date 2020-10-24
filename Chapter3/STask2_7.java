public class STask2_7 {
    public static String deleteAllSpacesAndNotUniqueCharacters(String line) {
        line = line.trim().replace(" ", "");
        StringBuilder res = new StringBuilder();
        for (int i=0; i<line.length(); ++i) {
            if (res.indexOf(line.charAt(i)+"") == -1) {
                res.append(line.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String line = "aaaaaaaaaaaaAAAsdsafsdf";
        System.out.println(deleteAllSpacesAndNotUniqueCharacters(line));
    }
}
