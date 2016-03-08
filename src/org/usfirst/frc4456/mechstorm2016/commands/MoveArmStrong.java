package org.usfirst.frc4456.mechstorm2016.commands;

import org.usfirst.frc4456.mechstorm2016.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveArmStrong extends Command {

	public MoveArmStrong() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.arm.setarm(0.7);
    	//Robot.arm.moveNextTargetPosition();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.arm.setarm(0.7);
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
