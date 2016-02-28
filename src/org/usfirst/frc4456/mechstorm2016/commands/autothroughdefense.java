package org.usfirst.frc4456.mechstorm2016.commands;

import org.usfirst.frc4456.mechstorm2016.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class autothroughdefense extends Command {

    public autothroughdefense() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.timer.reset();
    	Robot.timer.start();
    	if (Robot.timer.get() == 2) {
    		Robot.drive.setspeed(.8);
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.timer.hasPeriodPassed(5);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.setspeed(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
