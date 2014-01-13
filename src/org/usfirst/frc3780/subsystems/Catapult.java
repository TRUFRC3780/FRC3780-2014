/*
* Copyright 2014 FRC3780 (Brian Fogarty + Eric Rothchild) Licensed under the
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

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3780.RobotMap;

/**
 * Subsystem for the catapult.
 * @author Eric
 */
public class Catapult extends Subsystem {
    
    private CANJaguar catapultLeftJag;
    private CANJaguar catapultRightJag;
    private RobotDrive drive;
    
    public Catapult() throws CANTimeoutException {
        catapultLeftJag = new CANJaguar(RobotMap.CATAPULTLEFTJAGID);
        catapultRightJag = new CANJaguar(RobotMap.CATAPULTRIGHTJAGID);
        drive = new RobotDrive(catapultLeftJag, catapultRightJag);
    }
    
    public void initDefaultCommand(){
    }
    
    public void runCIMAtSpeed(double speed) {
        drive.setLeftRightMotorOutputs(speed, speed);
    }
    
}
