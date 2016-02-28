package org.usfirst.frc4456.mechstorm2016.commands;

import org.usfirst.frc4456.mechstorm2016.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
//This is the Autonomous command that passes the lowbar
//backwards, spins around, raises the shooter, and shoots
public class LowBarAuto extends Command {

	boolean endCommand = false;
	
    public LowBarAuto() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Timer timer = new Timer();
    	timer.start();
    	
    	//get to low bar and lower arm
    	while(!timer.hasPeriodPassed(2)){
    		Robot.drive.setspeed(-0.5);
    		Robot.arm.setarm(0.1);
    	}
    	Robot.arm.setarm(0);
    	timer.stop();
		timer.reset();
		//////////////////////////////////////
		timer.start();
		//move under bar
		while(!timer.hasPeriodPassed(1.7)){
    		Robot.drive.setspeed(-.7);
    	}
		timer.stop();
		timer.reset();
		Robot.drive.setspeed(0);
		////////////////////////////////////////
		timer.start();
		//spin to shoot
		while(!timer.hasPeriodPassed(0.6)){
    		Robot.drive.spinright(1);
    	}
		timer.stop();
		timer.reset();
		Robot.drive.setspeed(0);
		////////////////////////////////////////
		/*
		timer.start();
		//raise shooter
		while(!timer.hasPeriodPassed(6)){
    		Robot.aim.shooterForward();
    	}
		timer.stop();
		timer.reset();
		Robot.aim.stopaim();
		*/
		
		//////////////////////////////////////////
		//spin up motors and fire
		Robot.shooter.speedmotors();
		Timer.delay(2.5);
		Robot.shooter.plunger();
		Timer.delay(1);
		Robot.shooter.stopplunger();
		Robot.shooter.stopshooter();
		endCommand = true;
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(endCommand == true){
    		return true;
    	}
    	else{
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
