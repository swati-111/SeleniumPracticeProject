package seleniumPractice;

public class FarhenheitToCelsius {

	public static void main(String[] args) {
		// Farhenheit to Celsius conversion

		int farTemp = 41;
		int celTemp;

		celTemp = ((farTemp - 32) * 5) / 9;

		System.out.println("41Farhenheit Temperature in Celsius is  " + celTemp);

	}

}
