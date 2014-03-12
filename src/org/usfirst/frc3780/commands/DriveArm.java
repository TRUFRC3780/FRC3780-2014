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

package org.usfirst.frc3780.commands;

import edu.wpi.first.wpilibj.can.CANTimeoutException;
import org.usfirst.frc3780.RobotMap;
import org.usfirst.frc3780.components.*;

/**
 * Drives the arm with the y-axis on the operator joystick.
 * @author Brian
 */
public class DriveArm extends CommandBase {
    
    public DriveArm() {
        requires(arm);
    }

    protected void initialize() {
    }

    protected void execute() {
        try {
            arm.driveArm(oi.getOperatorJoystick().getY()*-1);
        } catch (ControllerException exception) {
            System.out.println(exception.getMessage());
            System.out.println("ControllerExceptiona : J" + RobotMap.ARM_DRIVE_ID);
        }
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        try {
            arm.stop();
        } catch (ControllerException exception) {
            System.out.println(exception.getMessage());
            System.out.println("ControllerException : J" + RobotMap.ARM_DRIVE_ID);
        }
    }

    protected void interrupted() {
        end();
    }
}