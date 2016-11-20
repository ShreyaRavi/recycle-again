package org.teamresistance.frc;

/**
 * Created by shrey on 11/20/2016.
 */
public class Arm {

    public void init() {
        States.armState = ArmState.OP_CONTROL;
    }

    public void update() {
        if (States.armState == ArmState.OP_CONTROL) {
            IO.armMotor.setSpeed(IO.armSpeed.read());
        } else if (States.armState == ArmState.COMMAND_CONTROL) {

        } else if (States.armState == ArmState.STOP) {
            IO.armMotor.stop();
        }
    }

    public void stop() {
        IO.armMotor.stop();

    }

}
