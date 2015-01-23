package org.usfirst.frc.team5025.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
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
	
	public static Victor F_LEFT_MOTOR;
	public static Victor R_LEFT_MOTOR;
	public static Victor F_RIGHT_MOTOR;
	public static Victor R_RIGHT_MOTOR;
	
	public static Victor WINCH_MOTOR;
	public static Victor LIFT_MOTOR;
	public static Victor LATCH;
	public static Victor LIFT_REEL;
	public static DigitalInput LIMIT_SWITCH;
	
	public static void init(){
		F_LEFT_MOTOR = new Victor(1);
		R_LEFT_MOTOR = new Victor(2);
		F_RIGHT_MOTOR = new Victor(3);
		R_RIGHT_MOTOR = new Victor(4);
		
		WINCH_MOTOR = new Victor(5);
		LIFT_MOTOR = new Victor(6);
		LATCH = new Victor(7);
		LIFT_REEL = new Victor(8);
		
		LIMIT_SWITCH = new DigitalInput(5);
	}
}
