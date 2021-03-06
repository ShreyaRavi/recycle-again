package org.teamresistance.frc;

import edu.wpi.first.wpilibj.SPI;
import org.strongback.components.DistanceSensor;
import org.strongback.components.Motor;
import org.strongback.components.Switch;
import org.strongback.components.ui.ContinuousRange;
import org.strongback.components.ui.FlightStick;
import org.strongback.drive.MecanumDrive;
import org.strongback.hardware.Hardware.*;

/**
 * Created by shrey on 11/20/2016.
 */
public class IO {

    // Drive Subsystem
    public static final Motor frontLeftMotor = Motors.victorSP(0);
    public static final Motor frontRightMotor = Motors.victorSP(1);
    public static final Motor rearLeftMotor = Motors.victorSP(2);
    public static final Motor rearRightMotor = Motors.victorSP(3);

    public static final Gyro3D gyro = new Gyro3D(SPI.Port.kMXP);

    public static final MecanumDrive robotDrive = new MecanumDrive(
            frontLeftMotor,
            rearLeftMotor,
            frontRightMotor,
            rearRightMotor,
            gyro
    );

    // Joysticks
    public static final FlightStick leftJoystick = HumanInterfaceDevices.logitechAttack3D(0);
    public static final FlightStick rightJoystick = HumanInterfaceDevices.logitechAttack3D(1);

    public static final ContinuousRange translateXSpeed = leftJoystick.getRoll();
    public static final ContinuousRange translateYSpeed = leftJoystick.getPitch();


    public static final FlightStick coJoystick = HumanInterfaceDevices.logitechAttack3D(2);

    public static final ContinuousRange rotateSpeed = rightJoystick.getRoll();

    public static final Motor armMotor = Motors.victorSP(4);
    public static final ContinuousRange armSpeed = coJoystick.getPitch();

    public static final Motor wristMotor = Motors.victorSP(5);
    public static final Motor clawMotor = Motors.victorSP(6);

    public static final Switch clawOpen = Switches.normallyOpen(0);
    public static final Switch clawClosed = Switches.normallyClosed(1);

    public static final DistanceSensor armPot = DistanceSensors.potentiometer(2,
            Constants.ARM_POT_SCALE,
            Constants.ARM_POT_OFFSET);




}
