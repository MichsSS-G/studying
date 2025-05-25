package studyingExceptions;

public class typeConversionFind {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Test1 test1 = (Test1) test2;
    }
}

class Test1 extends Test2 {
    private int value = 25;

    public int getValue() {
        return value;
    }
}


class Test2 {
    private int value = 25;


    public int getValue() {
        return value;
    }
}
