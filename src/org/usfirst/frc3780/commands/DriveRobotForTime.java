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

import edu.wpi.first.wpilibj.Timer;

/**
 * Drives the robot for a time at a speed.
 * @author Brian
 */
public class DriveRobotForTime extends CommandBase {
    
    private Timer timer;
    private double time;
    private double speed;
    
    /**
     * Constructor of the DriveRobotForTime command.
     * @param time The amount of time to drive the robot for.
     * @param speed The speed to drive the robot at.
     */
    public DriveRobotForTime(double time, double speed) {
        requires(chassis);    
        this.time = time;
        this.speed = speed;
        timer = new Timer();
        timer.stop();
    }

    protected void initialize() {
        timer.start();
    }

    protected void execute() {
        chassis.driveStraightAtSpeed(time, speed);
    }

    protected boolean isFinished() {
        return timer.get() >= time;
    }

    protected void end() {
        chassis.stopDrive();
    }

    protected void interrupted() {
        end();
    }
}