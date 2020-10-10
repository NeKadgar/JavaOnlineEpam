public class Task1_5 {
    // Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    // Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
    public static String calculate(int time) {
        int hours, min, sec;
        sec = Math.floorMod(time, 60);
        min = Math.floorMod(time - sec, 3600) / 60;
        hours = (time - sec - min * 60) / 3600;
        return String.format("%dч %dмин %dс", hours, min, sec);
    }

    public static void main(String[] args) {
        System.out.println(calculate(8000));
    }
}
