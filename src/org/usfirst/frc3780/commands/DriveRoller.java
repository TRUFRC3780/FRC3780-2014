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

/**
 * Drives the roller using the z-axis on the joystick.
 * @author Brian
 */
public class DriveRoller extends CommandBase {
    
    public DriveRoller() {
        requires(roller);
    }

    protected void initialize() {
    }

    protected void execute() {
        roller.driveRoller(oi.getOperatorJoystick().getZ()*-1);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        roller.stopRoller();
    }

    protected void interrupted() {
        end();
    }
}