package org.usfirst.frc4456.mechstorm2016.commands;

import org.usfirst.frc4456.mechstorm2016.Robot;
import org.usfirst.frc4456.mechstorm2016.subsystems.*;
import org.usfirst.frc4456.mechstorm2016.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MOVEARM extends Command {

    public MOVEARM() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//RobotMap.armsingleArm.set(200);
    	//Robot.arm.moveNextTargetPosition();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
