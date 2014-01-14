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

import edu.wpi.first.wpilibj.Timer;

/**
 * Runs the catapult CIMs for a short amount of time.
 * @author Brian
 */
public class FlingCatapult extends CommandBase {
    
    private Timer timer;
    private double numberOfSeconds;
    private double speed;
    
    public FlingCatapult(double numberOfSeconds, double speed) {
        requires(catapult);
        timer = new Timer();
        timer.stop();
        this.numberOfSeconds = numberOfSeconds;
        this.speed = speed;
    }

    protected void initialize() {
        timer.start();
    }

    protected void execute() {
        catapult.runCIMAtSpeed(speed);
    }

    protected boolean isFinished() {
        return timer.get() >= numberOfSeconds;
    }

    protected void end() {
        catapult.runCIMAtSpeed(0);
    }

    protected void interrupted() {
    }
}