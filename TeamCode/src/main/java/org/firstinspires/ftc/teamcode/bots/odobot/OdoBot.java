package org.firstinspires.ftc.teamcode.bots.odobot;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.libs_ar.DriveTrain_Mecanum;

@TeleOp
public class OdoBot extends LinearOpMode{
    DriveTrain_Mecanum myDriveTrain = null;

    //@Override

    public void runOpMode() throws InterruptedException {
        myDriveTrain = new DriveTrain_Mecanum(this);

        waitForStart();
        if (isStopRequested()) return;
        while (opModeIsActive()){
            //**************************************************************************************
            // ---------------------Gamepad 1 Controls ---------------------------------------------
            myDriveTrain.drive();

            //--------------------- TELEMETRY Code --------------------------------------------
            // Useful telemetry data in case needed for testing and to find heading of robot
            myDriveTrain.getTelemetryData();
            telemetry.update();
        }
    }
}