package org.usfirst.frc.team5025.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	/*
	 * Motors - @nathan
	 * */
	
	public static int F_LEFT_MOTOR = 1;
	public static int R_LEFT_MOTOR = 2;
	public static int F_RIGHT_MOTOR = 3;
	public static int R_RIGHT_MOTOR = 4;

	public static int WINCH_MOTOR = 5;
	public static int LIFT_MOTOR = 6;
	public static int LIFT_REEL = 7;
	
	public static int REEL_LIMIT_SWITCH = 5;
}
