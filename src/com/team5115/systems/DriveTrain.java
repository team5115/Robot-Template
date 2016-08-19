package com.team5115.systems;

import com.team5115.Constants;

import edu.wpi.first.wpilibj.CANTalon;

public class DriveTrain {
	
	public boolean inuse;
	
	CANTalon frontleft;
	CANTalon frontright;
	CANTalon backleft;
	CANTalon backright;
	
	public DriveTrain() {
		frontleft = new CANTalon(Constants.FRONT_LEFT_MOTOR_ID);
		frontright = new CANTalon(Constants.FRONT_RIGHT_MOTOR_ID);
		backleft = new CANTalon(Constants.BACK_LEFT_MOTOR_ID);
		backright = new CANTalon(Constants.BACK_RIGHT_MOTOR_ID);

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
