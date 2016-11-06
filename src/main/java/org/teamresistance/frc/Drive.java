package org.teamresistance.frc;

import org.strongback.components.AngleSensor;
import org.strongback.components.Motor;
import org.strongback.components.ui.FlightStick;
import org.strongback.drive.MecanumDrive;

/**
 * Created by shrey on 11/6/2016.
 */
public class Drive {

    public MecanumDrive robotDrive;

    public Drive(Motor leftFront, Motor leftRear, Motor rightFront, Motor rightRear, AngleSensor gyro) {
        robotDrive = new MecanumDrive(leftFront,leftRear,rightFront,rightRear,gyro);
    }

    public void update() {
        robotDrive.cartesian(IO.leftJoystick.getPitch().read(), IO.leftJoystick.getRoll().read(), IO.rightJoystick.getRoll().read());
    }



}
