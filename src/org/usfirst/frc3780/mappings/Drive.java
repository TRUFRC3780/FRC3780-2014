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
	public CANJaguar motor() throws CANTimeoutException {
		return new CANJaguar(this.port);
	}
	
	private Drive(int port) {
		this.port = port;
	}
}