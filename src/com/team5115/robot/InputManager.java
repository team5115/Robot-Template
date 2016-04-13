package com.team5115.robot;

import edu.wpi.first.wpilibj.Joystick;

public class InputManager {
	
	static Joystick joy = new Joystick(0);
	
	public static double getX() {
		return Math.pow(joy.getX(), 2) * Math.signum(joy.getX());
	}
	
	public static double getY() {
		return Math.pow(joy.getY(), 2) * Math.signum(joy.getY());
	}
	
	public static double getThrottle() {
		return (1 - joy.getThrottle()) / 2;
	}
	
	public static boolean startCommand() {
		return false;
	}

}
