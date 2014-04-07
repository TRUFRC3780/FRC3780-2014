/*
* Copyright 2014 FRC3780 (B. Fogarty, E. Rothchild, A. Lee) Licensed under the
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
import org.usfirst.frc3780.components.*;

public class Arm extends Subsystem {
	Controller armDrive;
	
	public Arm() throws ControllerException {
		armDrive = Controller.jaguar(RobotMap.ARM_DRIVE_ID);
	}
	
	public void driveArm(double speed) throws ControllerException {
		armDrive.set(speed);
	}
	
	public void stop() {
		armDrive.stop();
	}
	
	public void initDefaultCommand() {
		
	}
	
}