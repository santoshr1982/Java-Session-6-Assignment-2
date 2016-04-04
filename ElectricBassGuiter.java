package Com.Abstract.Classes;

public class ElectricBassGuiter extends StringedInstrument{

	@Override
	public void Play()
	{
		System.out.println("The instrument " + strName + " has " + intNumberOfStrings + " strings.");
	}
	
}
