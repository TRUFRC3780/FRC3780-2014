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

package org.usfirst.frc3780.commands;

import edu.wpi.first.wpilibj.can.CANTimeoutException;

/**
 * Command to run the winch at a speed.
 * Will winch up or down based on +/- speed.
 * @author Brian
 */
public class RunWinch extends CommandBase {
    
    private double speed;
    
    public RunWinch(double speed) {
        requires(winch);
        this.speed = speed;
    }

    protected void initialize() {
    }

    protected void execute() {
        try {
            winch.runCIMAtSpeed(speed);
        } catch (CANTimeoutException exception) {
            System.out.println(exception.getMessage());
            System.out.println("CANTimeout Exception in CommandBase");
        }
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        try {
            winch.runCIMAtSpeed(0);
        } catch (CANTimeoutException exception) {
            System.out.println(exception.getMessage());
            System.out.println("CANTimeout Exception in CommandBase");
        }
    }

    protected void interrupted() {
        try {
            winch.runCIMAtSpeed(0);
        } catch (CANTimeoutException exception) {
            System.out.println(exception.getMessage());
            System.out.println("CANTimeout Exception in CommandBase");
        }
    }
}