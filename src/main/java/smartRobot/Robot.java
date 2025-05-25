package smartRobot;

public class Robot {

    private int x;
    private int y;


    public Robot() {
        x = y = 0;
    }

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "this robot is at (" + x + ";" + y + ")";
    }
}
