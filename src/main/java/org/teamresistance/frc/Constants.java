package org.teamresistance.frc;

/**
 * Created by shrey on 11/22/2016.
 */
public class Constants {

    // Arm Constants

    // Arm Potentiometer Constants
    public static final double ARM_POT_MIN = 0;
    public static final double ARM_POT_MAX = 1;
    public static final double ARM_POT_SCALE = (1.0)/(ARM_POT_MAX - ARM_POT_MIN);
    public static final double ARM_POT_OFFSET = -1.0 * (ARM_POT_MIN * ARM_POT_SCALE);

//    if its 0.2 to 0.9
//       it would be 0.0 to 0.7
//       which would be multiplied by 10/7 to get between 0 and 1

}
