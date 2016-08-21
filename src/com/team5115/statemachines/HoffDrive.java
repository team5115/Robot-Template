package com.team5115.statemachines;

import com.team5115.robot.InputManager;
import com.team5115.robot.Robot;
import com.team5115.Constants;

public class HoffDrive extends StateMachineBase {

	double speed, turn, throttle;
	double turnPower;
	double lastSpeed = 0, lastTurn = 0;

	public void update() {
		switch (state) {
		case 1:

			// STATE 1 -- DRIVING
			speed = InputManager.getY();
			turn = InputManager.getX();
			throttle = InputManager.getThrottle();

			// Negative intertia. Increasing constants makes it more "repsonsive"
			speed += Constants.NEG_INERTIA_SPEED * (speed - lastSpeed);
			turn += Cosntants.NEG_INTERTIA_TURN * (turn - lastTurn);

			lastSpeed = speed;
			lastTurn = turn;

			// Turning in place and quickturn button
			if (speed == 0 || InputManager.quickTurn()) {
				turnPower = turn * Constants.QUICK_TURN_POWER;
			} else {
				// Keep in mind speed will always be in [-1, 1]
				// Use abs to make turning same direction forward and backward
				turnPower = Math.abs(speed) * turn;
			}

			Robot.drivetrain.drive(speed + turnPower, speed - turnPower, throttle);

			break;

		}
	}

}
