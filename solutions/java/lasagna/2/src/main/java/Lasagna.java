public class Lasagna {

    private static final int EXPECTED_TIME_IN_OVEN = 40;

    private static final int EXPECTED_TIME_FOR_ONE_LAYER = 2;

    public int expectedMinutesInOven() {
        return EXPECTED_TIME_IN_OVEN;
    }

    public int remainingMinutesInOven(int x) {
        return expectedMinutesInOven() - x;
    }

    public int preparationTimeInMinutes(int count) {
        return count * EXPECTED_TIME_FOR_ONE_LAYER;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
    }
}
