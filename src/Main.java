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
		double value = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the base value:", title, JOptionPane.QUESTION_MESSAGE));
		
		//Assign the double value to a new Number object
		Number num = new Number(value);
		
		//Obtain a double exponentValue using a the showInputDialog method (value of exponent)
		int exponentValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the exponent value:", title, JOptionPane.QUESTION_MESSAGE));
		
		//Use the Number object's pow method and raise to the power of exponentValue
		num.pow(exponentValue);
		
		//Display the final value of num
		JOptionPane.showMessageDialog(null, "The result is " + num, title, JOptionPane.INFORMATION_MESSAGE);
		
	}
}