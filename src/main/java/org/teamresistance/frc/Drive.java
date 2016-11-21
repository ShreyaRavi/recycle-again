package org.teamresistance.frc;

import org.strongback.components.AngleSensor;
import org.strongback.components.ui.ContinuousRange;
import org.strongback.drive.MecanumDrive;

/**
 * Created by shrey on 11/20/2016.
 */
public class Drive {

    public final MecanumDrive robotDrive;

    public Drive(MecanumDrive robotDrive) {
        this.robotDrive = robotDrive;
        States.driveState = DriveState.OP_CONTROL;
    }

    public void update(ContinuousRange translateXSpeed, ContinuousRange translateYSpeed, AngleSensor gyro) {
        if (States.driveState == DriveState.OP_CONTROL) {
            this.robotDrive.cartesian(translateXSpeed.read(), translateYSpeed.read(), gyro.getAngle());
        } else if (States.driveState == DriveState.COMMAND_CONTROL) {

        } else if (States.driveState == DriveState.STOP) {
            this.robotDrive.stop();
        }
    }

    public void stop() {
        this.robotDrive.stop();
    }

}
