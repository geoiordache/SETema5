package mta.se.tema.basic;

import mta.se.tema.basic.batteries.GoodBattery;
import mta.se.tema.basic.batteries.HighBattery;
import mta.se.tema.basic.batteries.LowBattery;
import mta.se.tema.basic.interfaces.IBattery;
import mta.se.tema.basic.interfaces.IDisplay;
import mta.se.tema.basic.interfaces.IProcessor;


/** Class which extends Abstract Factory to generate objects of concrete classes batteries 
 * @author George Iordache 14/11/2014
 *
 */
public class BatteryFactory extends AbstractFactory{

	/**
	 * Overridden method which gets different types of batteries based upon given information
	 */
	@Override
	IBattery getBatteryCapacity(String battery) {
		if (battery == null)
		{
			return null;
		}
		if (battery.equalsIgnoreCase("LOW"))
		{
			return new LowBattery();
		}
		else if (battery.equalsIgnoreCase("GOOD"))
		{
			return new GoodBattery();
		}
		else if (battery.equalsIgnoreCase("HIGH"))
		{
			return new HighBattery();
		}
		return null;
	}

	@Override
	IProcessor getProcessorType(String processor) {
		return null;
	}

	@Override
	IDisplay getDisplaySize(String display) {
		return null;
	}

}
