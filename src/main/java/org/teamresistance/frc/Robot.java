package org.teamresistance.frc;

import org.teamresistance.frc.buildconfig.BuildConfig;

import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * Main robot class. Override methods from {@link IterativeRobot} to define behavior.
 */
public class Robot extends IterativeRobot {

    @Override
    public void robotInit() {
        // Identifies which laptop deployed the code to keep track of whose code is on the
        // robot. The BuildConfig is automatically generated for each user at compile-time
        // using the "USERNAME" system environment variable. Prints to the DriverStation.
        System.out.println(BuildConfig.AGENT);
    }
}
