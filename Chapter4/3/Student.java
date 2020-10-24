import java.util.ArrayList;

public class Student {
    private String fullName;
    private int groupNum;
    private ArrayList<Integer> marks;

    public Student(String fullName, int groupNum) {
        this.fullName = fullName;
        this.groupNum = groupNum;
        this.marks = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public boolean setMark(int mark) {
        if (this.marks.size() < 5) {
            marks.add(mark);
            return true;
        }
        return false;
    }

    public boolean isExcellentStudent() {
        int good_marks = 0;
        for (int mark : this.marks) {
            if (mark>=9){
                good_marks++;
            }
        }
        return good_marks == 5;
    }

    public ArrayList<Integer> getMarks() {
        return this.marks;
    }
}