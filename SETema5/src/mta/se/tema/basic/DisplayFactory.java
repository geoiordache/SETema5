package mta.se.tema.basic;

import mta.se.tema.basic.displays.BigSize;
import mta.se.tema.basic.displays.DisplayHD;
import mta.se.tema.basic.displays.SmallSize;
import mta.se.tema.basic.interfaces.IBattery;
import mta.se.tema.basic.interfaces.IDisplay;
import mta.se.tema.basic.interfaces.IProcessor;

/**Class which extends Abstract Factory to generate objects of concrete classes displays
 * @author George Iordache 14/11/2014
 *
 */
public class DisplayFactory extends AbstractFactory{

	@Override
	IBattery getBatteryCapacity(String battery) {
		return null;
	}

	@Override
	IProcessor getProcessorType(String processor) {
		return null;
	}

	/**
	 * Overridden method which gets different types of displays based upon given information
	 */
	@Override
	IDisplay getDisplaySize(String display) {
		if(display==null)
		{
			return null;
		}
		if(display.equalsIgnoreCase("SMALL"))
		{
			return new SmallSize();
		}
		else if(display.equalsIgnoreCase("BIG"))
		{
			return new BigSize();
		}
		else if(display.equalsIgnoreCase("HD"))
		{
			return new DisplayHD();
		}
		return null;
	}

}
