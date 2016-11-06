package org.teamresistance.frc;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;
import org.strongback.components.Motor;
import org.strongback.components.ui.FlightStick;
import org.strongback.drive.MecanumDrive;
import org.strongback.hardware.Hardware.*;
import org.strongback.hardware.Hardware.Motors;

/**
 * Created by shrey on 11/6/2016.
 */
public class IO {

    public static Motor leftFront;
    public static Motor leftRear;
    public static Motor rightFront;
    public static Motor rightRear;
    public static Gyro3D gyro;
    public static FlightStick leftJoystick;
    public static FlightStick rightJoystick;


    public static void init() {
        gyro = new Gyro3D(SPI.Port.kMXP);
        leftFront = Motors.victorSP(0);
        leftRear = Motors.victorSP(1);
        rightFront = Motors.victorSP(2);
        rightRear = Motors.victorSP(3);

        leftJoystick = HumanInterfaceDevices.logitechAttack3D(0);
        rightJoystick = HumanInterfaceDevices.logitechAttack3D(1);

    }

    public static void update() {

    }

}
