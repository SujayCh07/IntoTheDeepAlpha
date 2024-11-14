package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
//TODO Remember to look back at this when importing field centric

public class Joint {
    private DcMotorEx MTR_JOINT;
    private static final double MTR_JOINT_PW = 0.7;
    private PIDControl newPID;

    public Joint(HardwareMap hardwareMap, String jointName) {
        //TODO Parameterize hardware map for our future code rather than passing iBot
        MTR_JOINT = hardwareMap.get(DcMotorEx.class, jointName);
        //Create pid controller here
        this.newPID = new PIDControl();
    }
    public void updateJointPosition(int target){
        this.MTR_JOINT.setPower(newPID.loop(this.MTR_JOINT, target));}
}
