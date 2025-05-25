package smartRobot;

import java.util.Scanner;

public class RobotConnectionLight implements RobotConnection {

    private Robot robot = null;
    private boolean closed;

    public RobotConnectionLight(Robot robot) {
        this.robot = robot;
        closed = false;
    }

//    protected Robot getRobot() {
//        return robot;
//    }

    @Override
    public void moveRobotTo(int x, int y) {
        if (closed) {
            throw new RobotConnectionException("Connection is closed");
        }
        if (robot == null) {
            throw new RobotConnectionException("No robot");
        }
        robot.moveTo(x, y);
    }

    @Override
    public void close() {
        if (closed) {
            return;
        }
        closed = true;
        robot = null;
    }
}
