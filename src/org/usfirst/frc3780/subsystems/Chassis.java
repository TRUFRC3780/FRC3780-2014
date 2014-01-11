/*
* Copyright 2014 FRC3780 (Brian Fogarty) Licensed under the
* Educational Community License, Version 2.0 (the "License"); you may
* not use this file except in compliance with the License. You may
* obtain a copy of the License at
* 
* http://www.opensource.org/licenses/ECL-2.0
* 
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an "AS IS"
* BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
* or implied. See the License for the specific language governing
* permissions and limitations under the License.
* 
*/

package org.usfirst.frc3780.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3780.RobotMap;

/**
 * This subsystem handles the drive train.
 * @author Brian
 */
public class Chassis extends Subsystem {
    
    // Write methods for controlling this subsystem here. Call these from commands.
	
	
	public final CANJaguar frontLeft;
	public final CANJaguar rearLeft;
	public final CANJaguar frontRight;
	public final CANJaguar rearRight;
	public final RobotDrive drive;
	
	// The constructor;
	private Chassis() {
		frontLeft = RobotMap.Drive.FRONTLEFT.jag();
		rearLeft = RobotMap.Drive.REARLEFT.jag();
		frontRight = RobotMap.Drive.FRONTRIGHT.jag();
		rearRight = RobotMap.Drive.REARRIGHT.jag();
		drive = new RobotDrive(frontLeft,rearLeft,frontRight,rearRight);
	}
	
	public void goStraight(double speed) {
		drive.setLeftRightMotorOutputs(speed,speed);
	}
	
	public void arcadeDrive(Joystick j) {
		drive.arcadeDrive(j);
	}
	
	public void arcadeDrive(double magnitude, double turn) {
		drive.arcadeDrive(magnitude,turn);
	}
	

    public void initDefaultCommand() {

    }
}