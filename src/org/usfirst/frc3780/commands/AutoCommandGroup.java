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

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc3780.RobotMap;

/**
 * Autonomous command sequence.
 * @author Brian
 */
public class AutoCommandGroup extends CommandGroup {
    
    public AutoCommandGroup() {
        
        // Drives robot then spins rollers.
        addSequential(new ShiftHigh());
        addSequential(new DriveRobotForTime(5, RobotMap.ROBOT_DRIVE_SPEED));
        addParallel(new DriveRollerForTime(5, RobotMap.ROLLER_DRIVE_SPEED));
        addSequential(new DriveRobotForTime(2, RobotMap.ROBOT_DRIVE_SPEED));
        
    }
}