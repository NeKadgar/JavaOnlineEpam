public class DecimalCounter {
    private int maxValue;
    private int minValue;
    private int currentValue;

    public DecimalCounter(int minValue, int maxValue) throws Exception {
        if (maxValue > minValue) {
            this.minValue = minValue;
            this.maxValue = maxValue;
            this.currentValue = minValue;
        } else throw new Exception("max value should be > than min");
    }

    public DecimalCounter(int minValue, int maxValue, int value) throws Exception {
        if (maxValue > minValue && value >= minValue && value <= maxValue) {
            this.minValue = minValue;
            this.maxValue = maxValue;
            this.currentValue = value;
        } else throw new Exception("Incorrect data");
    }

    public int getMaxValue() {
        return this.maxValue;
    }

    public int getMinValue() {
        return this.minValue;
    }

    public int getCurrentValue() {
        return this.currentValue;
    }

    public void increaseValue() {
        if (maxValue > currentValue) currentValue++;
    }

    public void decreaseValue() {
        if (minValue < currentValue) currentValue--;
    }
}