public class DecimalCounterTest {
    public static void printCounterInfo(DecimalCounter counter) {
        System.out.println("Max value: " + counter.getMaxValue() +
                "\nMin value: " + counter.getMinValue() +
                "\nCurrent value: " + counter.getCurrentValue());
    }

    public static void main(String[] args) {
        int maxValue = 10;
        int minValue = 0;
        int currentValue = 4;

        try {
            System.out.println("= New Counter with default state =============");
            DecimalCounter counter1 = new DecimalCounter(minValue, maxValue);
            printCounterInfo(counter1);
            System.out.println("= Increase ================");
            counter1.increaseValue();
            printCounterInfo(counter1);
            System.out.println("= New Counter with state =============");
            DecimalCounter counter2 = new DecimalCounter(minValue, maxValue, currentValue);
            printCounterInfo(counter2);
            counter2.decreaseValue();
            System.out.println("= Decrease ================");
            printCounterInfo(counter2);
            System.out.println("= Creating wrong value counter =====");
            DecimalCounter counter3 = new DecimalCounter(5, 1, currentValue);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}