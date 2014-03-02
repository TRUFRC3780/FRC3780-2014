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

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3780.RobotMap;
import org.usfirst.frc3780.commands.DriveRoller;

/**
 * Controls the BaneBots motor powered roller.
 * @author Brian
 */
public class Roller extends Subsystem {

    private Jaguar rollerDrive;

    public Roller() {
        rollerDrive = new Jaguar(RobotMap.ROLLER_DRIVE_ID);
    }
    
    /**
     * Drives motor powering the roller.
     * @param speed Double indicating the speed and direction of the roller.
     * @throws CANTimeoutException
     */
    public void driveRoller(double speed) {
        rollerDrive.set(speed);
    }
    
    /**
     * Stops the motor powering the roller.
     * @throws CANTimeoutException
     */
    public void stopRoller() {
        rollerDrive.set(0);
    }
    
    public void initDefaultCommand() {
//        setDefaultCommand(new DriveRoller());
    }
}