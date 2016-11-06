package org.teamresistance.frc;

import org.strongback.components.AngleSensor;
import org.strongback.components.Motor;
import org.strongback.components.ui.FlightStick;
import org.strongback.drive.MecanumDrive;


public class Drive {

    public MecanumDrive robotDrive;

    public Drive(Motor leftFront, Motor leftRear, Motor rightFront, Motor rightRear, AngleSensor gyro) {
        robotDrive = new MecanumDrive(leftFront,leftRear,rightFront,rightRear,gyro);
    }

    public void teleopDriveUpdate(FlightStick leftJoystick, FlightStick rightJoystick) {
        robotDrive.cartesian(leftJoystick.getPitch().read(), leftJoystick.getRoll().read(), rightJoystick.getRoll().read());
    }



}
