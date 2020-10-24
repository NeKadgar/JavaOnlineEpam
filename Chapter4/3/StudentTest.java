public class StudentTest {
    public static Student[] array = new Student[10];

    public static void main(String[] args) {
        for (int i=0; i<10; ++i) {
            array[i] = new Student("Student"+i, (int)(Math.random() * 11));
            while (array[i].setMark((int)(8 + Math.random() * 3)));
        }
        for (Student student : array) {
            if (student.isExcellentStudent())
                System.out.println("Student " + student.getFullName() + " from group №" +student.getGroupNum());
        }
    }
}
