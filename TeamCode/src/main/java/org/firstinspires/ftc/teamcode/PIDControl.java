package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.controller.PIDController;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class PIDControl {
    private PIDController pidController;

    private final double kP = 0.01;
    private final double kI = .1;
    private final double kD = 1;

    public PIDControl(){
        pidController = new PIDController(kP, kI, kD);
    }
    public double loop(DcMotorEx Joint, int target){
        pidController.setPID(kP, kI, kD);
        return pidController.calculate(Joint.getCurrentPosition(), target);
    }
}