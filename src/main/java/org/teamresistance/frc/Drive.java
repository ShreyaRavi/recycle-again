package org.teamresistance.frc;

/**
 * Created by shrey on 11/20/2016.
 */
public class Drive {

    public void init() {
        States.driveState = DriveState.OP_CONTROL;
    }

    public void update() {
        if (States.driveState == DriveState.OP_CONTROL) {
            IO.robotDrive.cartesian(IO.translateXSpeed.read(), IO.translateYSpeed.read(), IO.gyro.getAngle());
        } else if (States.driveState == DriveState.COMMAND_CONTROL) {

        } else if (States.driveState == DriveState.STOP) {
            IO.robotDrive.stop();
        }
    }

    public void stop() {
        IO.robotDrive.stop();
    }

}
