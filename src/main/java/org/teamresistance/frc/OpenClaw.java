package org.teamresistance.frc;

import org.strongback.components.Motor;
import org.strongback.components.Switch;

/**
 * Created by shrey on 11/20/2016.
 */
public class OpenClaw extends MoveClaw {

    public OpenClaw(Motor clawMotor, Switch upperLimit, double clawSpeed) {
        super(clawMotor, upperLimit, clawSpeed);

    }


}
