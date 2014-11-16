package mta.se.tema.basic.batteries;

import mta.se.tema.basic.interfaces.IBattery;

/**Class which implements one type of battery
 * @author George
 *
 */
public class HighBattery implements IBattery{

	/**
	 * Method which overrides the method from IBattery interface
	 */
	@Override
	public void capacity() {
		System.out.println("This device has a high capacity battery!");
		
	}

}
