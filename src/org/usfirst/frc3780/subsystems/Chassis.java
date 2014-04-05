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
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3780.RobotMap;
import org.usfirst.frc3780.commands.DriveRobot;
import org.usfirst.frc3780.commands.DriveRobotInverted;

/**
 * This subsystem handles the drive train.
 * @author Brian
 */
public class Chassis extends Subsystem {
    
    private RobotDrive drive;
    private SpeedController frontLeftDrive, rearLeftDrive, frontRightDrive, rearRightDrive;

    public Chassis() {
        frontLeftDrive = new Talon(RobotMap.CHASSIS_FRONT_LEFT_DRIVE_ID);
        rearLeftDrive = new Jaguar(RobotMap.CHASSIS_REAR_LEFT_DRIVE_ID);
        frontRightDrive = new Jaguar(RobotMap.CHASSIS_FRONT_RIGHT_DRIVE_ID);
        rearRightDrive = new Talon(RobotMap.CHASSIS_REAR_RIGHT_DRIVE_ID);
        drive = new RobotDrive(frontLeftDrive, rearLeftDrive, frontRightDrive, rearRightDrive);
    }
    
    /**
     * Drives the drive train with an arcade drive joystick.
     * @param j The joystick that controls the drive train.
     */
    public void arcadeDrive(Joystick j) {
        drive.arcadeDrive(j);
    }
    
    /**
     * Drives the drive train with an arcade drive joystick.
     * @param y The y-axis of the drive joystick.
     * @param x The x-axis of the drive joystick.
     */
    public void arcadeDrive(double y, double x) {
        drive.arcadeDrive(y, x);
    }
    
    /**
     * Sets the left and right outputs for the RobotDrive.
     * @param speed Speed to drive at.
     */
    public void driveStraightAtSpeed(double time, double speed) {
        drive.setLeftRightMotorOutputs(speed, speed);
    }
    
    /**
     * Sets the left and right outputs for the RobotDrive to zero.
     */
    public void stopDrive() {
        drive.setLeftRightMotorOutputs(0, 0);
    }
    
    /**
     * Arcade drive initializes with subsystem.
     */
    public void initDefaultCommand() {
        setDefaultCommand(new DriveRobotInverted());
    }
    
}