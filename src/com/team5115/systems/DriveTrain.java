package com.team5115.systems;

import edu.wpi.first.wpilibj.CANTalon;

public class DriveTrain {
	
	public boolean inuse;
	
	CANTalon frontleft;
	CANTalon frontright;
	CANTalon backleft;
	CANTalon backright;
	
	public DriveTrain() {
		frontleft = new CANTalon(1);
		frontright = new CANTalon(2);
		backleft = new CANTalon(3);
		backright = new CANTalon(4);

		backleft.changeControlMode(CANTalon.TalonControlMode.Follower);
		backright.changeControlMode(CANTalon.TalonControlMode.Follower);
		backleft.set(frontleft.getDeviceID());
		backright.set(frontright.getDeviceID());
		
		frontright.setInverted(true);
	}
	
	public void drive(double leftSpeed, double rightSpeed, double throttle) {
		if (leftSpeed > 1) {
			leftSpeed = 1;
			rightSpeed /= leftSpeed;
		}
		if (rightSpeed > 1) {
			rightSpeed = 1;
			leftSpeed /= rightSpeed;
		}
		
		frontleft.set(leftSpeed);
		frontright.set(rightSpeed);
	}

}
