package smartRobot;

public class SimpleManager implements RobotConnectionManager {

    private final Robot robot;

    public SimpleManager(Robot robot) {
        this.robot = robot;
    }

    @Override
    public RobotConnection getConnection() {
        return new RobotConnectionLight(robot);
    }
}
