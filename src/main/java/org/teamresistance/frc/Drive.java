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
    public FlightStick leftJoystick;
    public FlightStick rightJoystick;

    public Drive(Motor leftFront, Motor leftRear, Motor rightFront, Motor rightRear, AngleSensor gyro, FlightStick leftJoystick, FlightStick rightJoystick) {
        robotDrive = new MecanumDrive(leftFront,leftRear,rightFront,rightRear,gyro);
        this.leftJoystick = leftJoystick;
        this.rightJoystick = rightJoystick;
    }

    public void update() {
        robotDrive.cartesian(leftJoystick.getPitch().read(), leftJoystick.getRoll().read(), rightJoystick.getRoll().read());
    }



}
