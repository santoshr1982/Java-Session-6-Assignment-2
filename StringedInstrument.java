package Com.Abstract.Classes;

public class StringedInstrument extends Instrument{ //This is the sub class of abstract class instrument.

	int intNumberOfStrings;			//Declaration of Variable.
	
	public void Play() {			// Creating body for an abstract method.
		
		System.out.println("The instrument " + strName + " has " + intNumberOfStrings + " strings.");
		
	}
	

}
