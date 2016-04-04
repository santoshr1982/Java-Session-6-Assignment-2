package Com.Abstract.Classes;

public class MainClass {

	public static void main(String[] args) {
		
		StringedInstrument objString = new StringedInstrument();
		objString.intNumberOfStrings = 3;
		objString.strName = "Guiter";
		objString.Play();
		
		ElectricGuiter objElectric = new ElectricGuiter();
		objElectric.intNumberOfStrings = 4;
		objElectric.strName = "Electric Guiter";
		objElectric.Play();
		
		ElectricBassGuiter objElectricBass = new ElectricBassGuiter();
		objElectricBass.intNumberOfStrings = 5;
		objElectricBass.strName = "Electric Bass Guiter";
		objElectricBass.Play();
		
	}
}
