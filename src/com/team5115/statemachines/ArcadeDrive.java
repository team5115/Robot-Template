package com.team5115.statemachines;

import com.team5115.robot.InputManager;
import com.team5115.robot.Robot;
import com.team5115.Constants;

public class CarDrive extends StateMachineBase {

	double speed, turn, throttle;
	double turnPower;
	
	public void update() {
		switch (state) {
		case 1:
			
			// STATE 1 -- DRIVING
			speed = InputManager.getY();
			turn = InputManager.getX();
			throttle = InputManager.getThrottle();

			// Keep in mind speed will always be in [-1, 1]
			// Use abs to make turning same direction forward and backward
			turnPower = Math.abs(speed) * turn;
			
			Robot.drivetrain.drive(speed + turnPower, speed - turnPower, throttle);

			break;
			
		}
	}

}
