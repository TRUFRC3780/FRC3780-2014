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
 * Drives the insideRoller using the z-axis on the joystick.
 * @author Brian
 */
public class DriveRoller extends CommandBase {
    
    public DriveRoller() {
        requires(insideRoller);
    }

    protected void initialize() {
    }

    protected void execute() {
        try {
            insideRoller.driveRoller(oi.getOperatorJoystick().getZ()*-1);
        } catch (RollerException exception) {
            System.out.println(exception.getMessage());
            System.out.println("RollerException : J" + RobotMap.INSIDE_ROLLER_ID);
        }
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        try {
            insideRoller.stop();
        } catch (RollerException exception) {
            System.out.println(exception.getMessage());
            System.out.println("RollerException : J" + RobotMap.INSIDE_ROLLER_ID);
        }
    }

    protected void interrupted() {
        end();
    }
}