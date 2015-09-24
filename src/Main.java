import javax.swing.JOptionPane;

public class Main {
	//Title constant
	public static final String title = "Exponentiation With Successive Squaring";

	/**
	 * runs the program!
	 * @param args
	 */
	public static void main(String args[]) {

		//Obtain a double value using a the showInputDialog method (value of base)
		double value = 0;
		try {
			value = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the base value:", title, JOptionPane.QUESTION_MESSAGE));
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "It seems that you did not enter a valid input. Please restart the program.", title, JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);

		}

		//Assign the double value to a new Number object
		Number num = new Number(value);

		//Obtain a double exponentValue using a the showInputDialog method (value of exponent)
		int exponentValue=0;
		try {
			exponentValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the exponent value (integer):", title, JOptionPane.QUESTION_MESSAGE));
		} 
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "It seems that you did not enter a valid input. Please restart the program.", title, JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		//Use the Number object's pow method and raise to the power of exponentValue
		num.pow(exponentValue);

		//Display the final value of num
		JOptionPane.showMessageDialog(null, "The result is " + num, title, JOptionPane.INFORMATION_MESSAGE);

	}
}
