package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class Arm {
    public static int FIRST_JOINT_DEPLOY = 135, SECOND_JOINT_DEPLOY = 160;
    public static int FIRST_JOINT_GRAB = 45, SECOND_JOINT_GRAB = 160;
    public static int FIRST_JOINT_REST = 0, SECOND_JOINT_REST = 0;

    public Joint joint1;
    public Joint joint2;

    private int targetFirst;
    private int targetSecond;
    private boolean tested = true;

    public Arm(HardwareMap hardwareMap) {
        joint1 = new Joint(hardwareMap,"first_joint_mtr");
        joint2 = new Joint(hardwareMap, "second_joint_mtr");
    }

    public void updatePosition(){
        if(tested){
            this.joint1.updateJointPosition(this.targetFirst);
            this.joint2.updateJointPosition(this.targetSecond);
        }
    }


}
