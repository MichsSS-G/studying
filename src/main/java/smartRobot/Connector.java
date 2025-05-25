package smartRobot;

public class Connector {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; ++i) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                i = 3;
            }
            catch (RobotConnectionException e) {
                if (i == 2) {
                    throw new RobotConnectionException("Cannot create connection");
                }
            }
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(10, 15);
//        Robot robot = null;
        RobotConnectionManager robotConnectionManager = new SimpleManager(robot);
        moveRobot(robotConnectionManager, 25, 25);
    }
}
