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

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3780.RobotMap;


/**
 * This subsystem handles the drive train.
 * @author Brian,Andy
 */
public class Chassis extends Subsystem {
    
	private CANJaguar frontLeft, backLeft, frontRight, backRight;
	private RobotDrive drive;
	
    // TODO: create new RobotDrive and CAN Jaguars here.

    public Chassis() throws CANTimeoutException {
		frontLeft  = new CANJaguar( RobotMap.Drive.FRONT_LEFT  );
		backLeft   = new CANJaguar( RobotMap.Drive.BACK_LEFT   );
		frontRight = new CANJaguar( RobotMap.Drive.FRONT_RIGHT );
		backRight  = new CANJaguar( RobotMap.Drive.BACK_RIGHT  );
		drive      = new RobotDrive(
			frontLeft,
			backLeft,
			frontRight,
			backRight
		);
		
	}
	
	public void goStraight(double speed) {
		drive.setLeftRightMotorOutputs(speed,speed);
	}
	
	public void arcadeDrive(Joystick j) {
		drive.arcadeDrive(j);
	}
	
	public void arcadeDrive(double magnitude,double turn) {
		drive.arcadeDrive(magnitude,turn);
	}
    
    public void initDefaultCommand() {

    }
    
    // TODO: write methods for controlling drive train here. [See 2013 code]
    
}