/*
 * Drive.java
 * Initialize the jags needed for drive using this enum
 *
 */

package org.usfirst.frc3780.mappings;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;

public enum Drive {
	FRONTLEFT(2), FRONTRIGHT(3), BACKLEFT(4), BACKRIGHT(5);
	
	public final int port;
	public final CANJaguar motor;
	
	private Drive(int port) {
		this.port = port;
		try {
			this.motor = new CANJaguar(this.port);
		}
		catch(CANTimeoutException e) {
			throw new AssertionError("Error while initializing CANJaguar",e);
		}
	}
}