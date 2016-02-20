// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4456.TeleopTesting.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc4456.TeleopTesting.Robot;
import org.usfirst.frc4456.TeleopTesting.RobotMap;
import org.usfirst.frc4456.TeleopTesting.subsystems.*;

/**
 *
 */
public class primaryBack extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public primaryBack() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.arm);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.arm.primaryBack();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//Robot.arm.arm();
    	System.out.println("getOutputCurrent(): " + RobotMap.armsingleArm.getOutputCurrent());
    	System.out.println("getPosition(): " + RobotMap.armsingleArm.getPosition());
    	System.out.println("getSpeed(): " + RobotMap.armsingleArm.getSpeed());
      	System.out.println("get(): " + RobotMap.armsingleArm.get());
      	System.out.println("Enc(): " + RobotMap.armsingleArm.getEncPosition());
      	System.out.println("Analog(): " + RobotMap.armsingleArm.getAnalogInPosition());
      	
      	System.out.println("RobotMap.armsingleArm:" + RobotMap.armsingleArm.toString());
      
      	
        SmartDashboard.putNumber("Position", RobotMap.armsingleArm.getPosition());
		SmartDashboard.putNumber("Current", RobotMap.armsingleArm.getOutputCurrent());
		SmartDashboard.putNumber("Speed", RobotMap.armsingleArm.getSpeed());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.arm.stoparm();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
