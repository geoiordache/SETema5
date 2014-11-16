package mta.se.tema.basic;


/**Class used for generating different factories
 * @author George Iordache 14/11/2014
 *
 */
public class FactoryProducer {
	/**
	 * Method which returns one type of factory based upon given information
	 * @param factory
	 * @return DisplayFactory object, BatteryFactory object or ProcessorFactory object
	 */
	public static AbstractFactory getFactory(String factory)
	{
		if(factory.equalsIgnoreCase("DISPLAY"))
		{
			return new DisplayFactory();
		}
		else if(factory.equalsIgnoreCase("BATTERY"))
		{
			return new BatteryFactory();
		}
		else if(factory.equalsIgnoreCase("PROCESSOR"))
		{
			return new ProcessorFactory();
		}
		return null;
	}

}
