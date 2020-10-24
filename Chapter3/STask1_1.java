import javax.sound.midi.SysexMessage;

public class STask1_1 {
    public static void main(String[] args) {
        String[] names = {"camelCase", "gomerSimpson", "samsungElect"};
        for (int j = 0; j<names.length; j++) {
            String name = names[j];
            StringBuilder  tmp = new StringBuilder();
            for (int i = 0; i<name.length(); i++) {
                if (Character.isUpperCase(name.charAt(i))) {
                    tmp.append("_");
                    tmp.append(Character.toLowerCase(name.charAt(i)));
                } else {
                    tmp.append(name.charAt(i));
                }
            }
            names[j] = tmp.toString();
        }
        System.out.println(names[0]);
    }
}
