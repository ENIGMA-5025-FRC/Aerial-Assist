package org.usfirst.frc.team5025.robot.commands;

import org.usfirst.frc.team5025.robot.OI;
import org.usfirst.frc.team5025.robot.RobotMap;
import org.usfirst.frc.team5025.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CommandBAse extends Command {

    public static OI io;
    public static RobotDrive drive = new RobotDrive(RobotMap.F_LEFT_MOTOR, RobotMap.R_LEFT_MOTOR, RobotMap.F_RIGHT_MOTOR,  RobotMap.R_RIGHT_MOTOR);
	public CommandBAse() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
		requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	drivetrain.TankDrive(OI.getX(), OI.getY());
    }
    
    public void drive(){
    	drive.arcadeDrive(OI.getX(), OI.getY());
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
