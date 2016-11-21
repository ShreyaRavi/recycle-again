package org.teamresistance.frc;

import org.strongback.components.Motor;
import org.strongback.components.Switch;

/**
 * Created by shrey on 11/20/2016.
 */
public class CloseClaw extends MoveClaw{

    public CloseClaw(Motor clawMotor, Switch lowerLimit, double clawSpeed) {
        super(clawMotor,lowerLimit,clawSpeed);
        this.clawSpeed *= -1;
    }


}
